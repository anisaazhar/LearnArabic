package com.anisahnurulazhar.learnarabic;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NahwuShorof extends AppCompatActivity {

    Button Pengertian, JenisKata, Isim, BerdasarkanJenis, BerdasarkanBilangan,
            BerdasarkanKejelasan, BerdasarkanPerubahan,  Fiil, Dhomir, Tashrif,
    IsimIsyarah, HarfuJar, JumlahKalimat, Mubtada, Khabar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nahwu_shorof);

        Pengertian = (Button) findViewById(R.id.pengertian);
        JenisKata = (Button) findViewById(R.id.jeniskata);
        Isim = (Button) findViewById(R.id.isim);
        BerdasarkanJenis = (Button) findViewById(R.id.jenis);
        BerdasarkanBilangan = (Button) findViewById(R.id.bilangan);
        BerdasarkanKejelasan = (Button) findViewById(R.id.kejelasan);
        BerdasarkanPerubahan = (Button) findViewById(R.id.perubahan);
        Fiil = (Button) findViewById(R.id.fiil);
        Dhomir = (Button) findViewById(R.id.dhomir);
        Tashrif = (Button) findViewById(R.id.tashrif);
        IsimIsyarah = (Button) findViewById(R.id.isimisyaroh);
        HarfuJar = (Button) findViewById(R.id.harfujar);
        JumlahKalimat = (Button) findViewById(R.id.jumlahkalimat);
        Mubtada = (Button) findViewById(R.id.mubtada);
        Khabar = (Button) findViewById(R.id.khobar);

        Pengertian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), PengertianNahwuShorof.class);
                startActivity(a);
            }
        });

        JenisKata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), JenisKataDalamBahasaArab.class);
                startActivity(a);
            }
        });

        Isim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Isim.class);
                startActivity(a);
            }
        });

        BerdasarkanJenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), IsimBerdasarkanJenis.class);
                startActivity(a);
            }
        });

        BerdasarkanBilangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), IsimBerdasarkanBilangan.class);
                startActivity(a);
            }
        });

        BerdasarkanKejelasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), IsimBerdasarkanKejelasan.class);
                startActivity(a);
            }
        });

        BerdasarkanPerubahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), IsimBerdasarkanPerubahanHarakatAkhir.class);
                startActivity(a);
            }
        });

        Fiil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Fiil.class);
                startActivity(a);
            }
        });

        Dhomir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Dhomir.class);
                startActivity(a);
            }
        });

        Tashrif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Tashrif.class);
                startActivity(a);
            }
        });

        IsimIsyarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), IsimIsyarah.class);
                startActivity(a);
            }
        });

        HarfuJar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), HarfuJar.class);
                startActivity(a);
            }
        });

        JumlahKalimat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), JumlahKalimat.class);
                startActivity(a);
            }
        });

        Mubtada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Mubtada.class);
                startActivity(a);
            }
        });

        Khabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Khabar.class);
                startActivity(a);
            }
        });
    }
    //FOR ARROW BACK
    @Override
    public void onResume() {
        super.onResume();

// Display custom title
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setTitle("Nahwu Shorof");

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
