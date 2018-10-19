package com.anisahnurulazhar.learnarabic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Mufradat extends AppCompatActivity {

    ListView listView;

    String nama[] = {
            "Nama Nama Hari", "Nama Nama Warna", "Alat Transportasi", "Sekolah",
            "Seputar Rumah", "Profesi", "Pakaian", "Waktu",
            "Anggota Tubuh", "Nama Nama Bulan"
    };

    int gambar[] = {
            R.drawable.okhari, R.drawable.warnaw, R.drawable.oktransportasi, R.drawable.oksekolah,
            R.drawable.okrumah, R.drawable.okprofesi, R.drawable.okpakaian, R.drawable.okwaktu,
            R.drawable.okanggotatubuh, R.drawable.okbulan
    };

    String isi[] = {
            String.valueOf(R.string.mufradathari),
            String.valueOf(R.string.mufradatwarna),  String.valueOf(R.string.mufradattransportasi),
            String.valueOf(R.string.mufradatsekolah), String.valueOf(R.string.mufradatrumah),
            String.valueOf(R.string.mufradatprofesi), String.valueOf(R.string.mufradatpakaian),
            String.valueOf(R.string.mufradatwaktu),
            String.valueOf(R.string.mufradatbulan),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mufradat);

        listView = (ListView) findViewById(R.id.listMufradat);
        adapter adapterListview = new adapter(this, gambar, nama, isi);
        listView.setAdapter(adapterListview);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (nama[position] == "Nama Nama Hari"){
                    Intent h = new Intent(getApplicationContext(), Hari.class);
                    startActivity(h);

                } else if (nama[position] == "Nama Nama Warna"){
                    Intent w = new Intent(getApplicationContext(), Warna.class);
                    startActivity(w);

                }else if (nama[position] == "Alat Transportasi"){
                    Intent t = new Intent(getApplicationContext(), Transportasi.class);
                    startActivity(t);

                }else if (nama[position] == "Sekolah"){
                        Intent s = new Intent(getApplicationContext(), Sekolah.class);
                        startActivity(s);

                }else if (nama[position] == "Seputar Rumah") {
                    Intent r = new Intent(getApplicationContext(), Rumah.class);
                    startActivity(r);

                }else if (nama[position] == "Profesi") {
                    Intent p = new Intent(getApplicationContext(), Profesi.class);
                    startActivity(p);

                }else if (nama[position] == "Pakaian") {
                    Intent p = new Intent(getApplicationContext(), Pakaian.class);
                    startActivity(p);

                }else if (nama[position] == "Waktu"){
                    Intent w = new Intent(getApplicationContext(), Waktu.class);
                    startActivity(w);

                }else if (nama[position] == "Anggota Tubuh"){
                    Intent a = new Intent(getApplicationContext(), AnggotaTubuh.class);
                    startActivity(a);

                }else if (nama[position] == "Nama Nama Bulan") {
                    Intent b = new Intent(getApplicationContext(), Bulan.class);
                    startActivity(b);

                }
                else {
                    Intent a = new Intent(getApplicationContext(), Detail.class);
                    a.putExtra("nama", nama[position]);
                    a.putExtra("isi", isi[position]);
                    int c = gambar[position];
                    a.putExtra("gambar", c);

                    startActivity(a);
                }

            }
        });

    }
    //FOR ARROW BACK
    @Override
    public void onResume() {
        super.onResume();

// Display custom title
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setTitle("Mufradat");

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
