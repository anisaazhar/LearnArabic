package com.anisahnurulazhar.learnarabic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txt = (TextView) findViewById(R.id.txtDetail);
        ImageView img = (ImageView) findViewById(R.id.imgDetail);
        TextView txtIsi = (TextView) findViewById(R.id.isiDetail);


        // get data dari listview
        Intent a = getIntent();
        String nama = a.getStringExtra("nama");
        String isi = a.getStringExtra("isi");
        int image = a.getIntExtra("gambar", 0);

        img .setImageResource(image);
        txt.setText(nama);
        txtIsi.setText(getString(Integer.parseInt(isi)));
    }
}
