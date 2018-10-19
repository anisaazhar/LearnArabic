package com.anisahnurulazhar.learnarabic;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Khiwar extends AppCompatActivity {

    Button Perkenalan1, Perkenalan2, Kebangsaan1, Kebangsaan2, Profesi1, Profesi2, Keluarga,
    SilsilahKeturunan, TempatTinggal, Apartement, PerabotRumah, PagiHari, Libur, MakanPokok, Makanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khiwar);


        Perkenalan1 = (Button) findViewById(R.id.perkenalan1);
        Perkenalan2 = (Button) findViewById(R.id.perkenalan2);
        Kebangsaan1 = (Button) findViewById(R.id.kebangsaan1);
        Kebangsaan2 = (Button) findViewById(R.id.kebangsaan2);
        Profesi1 = (Button) findViewById(R.id.profesi1);
        Profesi2 = (Button) findViewById(R.id.profesi2);
        Keluarga = (Button) findViewById(R.id.keluarga);
        SilsilahKeturunan = (Button) findViewById(R.id.silsilahketurunan);
        TempatTinggal = (Button) findViewById(R.id.tempattinggal);
        Apartement= (Button) findViewById(R.id.apartement);
        PerabotRumah = (Button) findViewById(R.id.perabotrumah);
        PagiHari = (Button) findViewById(R.id.pagihari);
        Libur = (Button) findViewById(R.id.libur);
        MakanPokok = (Button) findViewById(R.id.makanpokok);
        Makanan = (Button) findViewById(R.id.makanan);


        Perkenalan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Perkenalan1.class);
                startActivity(a);
            }
        });

        Perkenalan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), Perkenalan2.class);
                startActivity(b);
            }
        });

        Kebangsaan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(), Kebangsaan1.class);
                startActivity(c);
            }
        });

        Kebangsaan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getApplicationContext(), Kebangsaan2.class);
                startActivity(d);
            }
        });

        Profesi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(getApplicationContext(), Profesi1.class);
                startActivity(e);
            }
        });

        Profesi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getApplicationContext(), Profesi2.class);
                startActivity(f);
            }
        });

        Keluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(getApplicationContext(), Keluarga.class);
                startActivity(g);
            }
        });

        SilsilahKeturunan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), SilsilahKeturunan.class);
                startActivity(h);
            }
        });

        TempatTinggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TempatTinggal.class);
                startActivity(i);
            }
        });

        Apartement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(), Apartement.class);
                startActivity(j);
            }
        });

        PerabotRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), PerabotRumah.class);
                startActivity(k);
            }
        });

        PagiHari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(getApplicationContext(), PagiHari.class);
                startActivity(l);
            }
        });

        Libur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getApplicationContext(), Libur.class);
                startActivity(m);
            }
        });

        MakanPokok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), MakanPokok.class);
                startActivity(n);
            }
        });

        Makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(getApplicationContext(), Makanan.class);
                startActivity(o);
            }
        });




    }
    //FOR ARROW BACK
    @Override
    public void onResume() {
        super.onResume();

// Display custom title
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setTitle("Khiwar");

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
