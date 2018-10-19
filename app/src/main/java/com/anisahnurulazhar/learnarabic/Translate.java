package com.anisahnurulazhar.learnarabic;

import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Translate extends AppCompatActivity {

    EditText translateEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
    }

    public void onTranslateClick(View view) {

        translateEditText = (EditText) findViewById(R.id.editText);


        if (!isEmpty(translateEditText)){

            Toast.makeText(this, "Getting Translation", Toast.LENGTH_LONG).show();

            new SaveTheFeed().execute();
        }else {
            Toast.makeText(this, "Enter Words To Translate", Toast.LENGTH_SHORT).show();
        }



    }

    protected boolean isEmpty(EditText editText) {

        return editText.getText().toString().trim().length() == 0;


    }

    class SaveTheFeed extends AsyncTask<Void, Void, Void>{

        String jsonString = "";

        String result = "";

        String edt = translateEditText.getText().toString();



        @Override
        protected Void doInBackground(Void... params) {

            String wordsToTranslate = edt;

            wordsToTranslate = wordsToTranslate.replace(" ","+" );

            DefaultHttpClient httpclient = new DefaultHttpClient(new BasicHttpParams());

            HttpPost httpPost = new HttpPost("http://newjustin.com/translateit.php?action=translations&english_words=" + wordsToTranslate);

            httpPost.setHeader("Content-type", "application/json");

            InputStream inputStream = null;

            try{

                HttpResponse response = httpclient.execute(httpPost);

                HttpEntity enity = response.getEntity();

                inputStream = enity.getContent();

                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);

                StringBuilder sb = new StringBuilder();

                String line = null;

                while ((line = reader.readLine()) != null){

                    sb.append(line + "\n");


                }

                jsonString = sb.toString();

                JSONObject jObject = new  JSONObject(jsonString);

                JSONArray jArray = jObject.getJSONArray("translations");

                outputTranslations(jArray);

            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }


                        return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            TextView translationTextView = (TextView) findViewById(R.id.translationTextView);

            translationTextView.setText(result);
        }

        protected void outputTranslations(JSONArray jsonArray){

            String languages = "Arabic";

            try{
                for(int i = 0; i < jsonArray.length(); i++){

                    JSONObject translationObject =
                            jsonArray.getJSONObject(i);

                    result = result + languages + " : " +
                            translationObject.getString(languages) +  "\n";

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
    //FOR ARROW BACK
    @Override
    public void onResume() {
        super.onResume();

// Display custom title
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setTitle("Translate");

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


}










