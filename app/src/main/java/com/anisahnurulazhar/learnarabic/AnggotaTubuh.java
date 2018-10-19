package com.anisahnurulazhar.learnarabic;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class AnggotaTubuh extends AppCompatActivity {


    AQuery aq;
    ProgressDialog progressDialog;
    ArrayList<HashMap<String, String>> data;
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota_tubuh);

        data = new ArrayList<HashMap<String, String>>();
        AmbilData();
        gv = (GridView) findViewById(R.id.gv);



    }

    //FOR ARROW BACK
    @Override
    public void onResume() {
        super.onResume();

// Display custom title
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setTitle("Anggota Tubuh");

// Display the back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    // Back arrow click event to go to the parent Activity
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }



    private void AmbilData() {

        String url = "http://192.168.100.5/LearnArabic/anggotatubuh.php";

        aq = new AQuery(AnggotaTubuh.this);
        progressDialog = new ProgressDialog(AnggotaTubuh.this);
        progressDialog.setMessage("Loading. . . . . . . .");
        aq.progress(progressDialog).ajax(url, String.class, new AjaxCallback<String>(){
            @Override
            public void callback(String url, String object, AjaxStatus status) {
                if (object != null){
                    Log.d("Respon", object);
                    try{

                        JSONObject json = new JSONObject(object);
                        String result = json.getString("pesan");
                        String sukses= json.getString("sukses");

                        //jika datanya ada
                        if (sukses.equalsIgnoreCase("true")){
                            JSONArray jsonArray = json.getJSONArray("anggotatubuh");
                            for (int i = 0; i <jsonArray.length(); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                String id_warna = jsonObject.getString("id");
                                String gambar = jsonObject.getString("anggotatubuh");

                                HashMap<String, String> map = new HashMap<String, String>();
                                map.put("id", id_warna);
                                map.put("anggotatubuh", gambar);
                                //call data
                                data.add(map);

                                setLisAdapter(data);


                            }

                        }


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void setLisAdapter(final ArrayList<HashMap<String, String>> data) {
        AnggotaTubuh.CustomAdapter adapter = new AnggotaTubuh.CustomAdapter(this, data);
        gv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    private class CustomAdapter extends BaseAdapter {
        Activity activity;
        ArrayList <HashMap<String, String>> data2;
        LayoutInflater layoutInflater;

        public CustomAdapter(Activity activity, ArrayList<HashMap<String, String>> data2) {
            this.activity = activity;
            this.data2 = data;//dont forget to change this to data
        }

        @Override
        public int getCount() {
            return data2.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = layoutInflater.inflate(R.layout.listtransportasi, null);

            ImageView img2 = (ImageView) v.findViewById(R.id.imgtransportasi);
//            TextView jdl = (TextView) v.findViewById(R.id.textjudul);
//            CircleImageView img = (CircleImageView) v.findViewById(R.id.listImg);
            HashMap<String, String> data = new HashMap<>();
            data = data2.get(position);


            // id.setText(data.get("id"));
            String url_foto = "http://192.168.100.5/LearnArabic/potoanggotatubuh/";
            Picasso.with(AnggotaTubuh.this).load(url_foto+data.get("anggotatubuh")).error(R.drawable.noimage).into(img2);

            return v;
        }
    }
}
