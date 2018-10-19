package com.anisahnurulazhar.learnarabic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mufradat, khiwar, nahwushorof, translate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mufradat = (Button) findViewById(R.id.mufradat);
        khiwar = (Button) findViewById(R.id.khiwar);
        nahwushorof = (Button) findViewById(R.id.nahwushorof);
        translate = (Button) findViewById(R.id.translate);


        mufradat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Mufradat.class);
                startActivity(a);
            }
        });

        khiwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Khiwar.class);
                startActivity(a);
            }
        });


        nahwushorof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), NahwuShorof.class);
                startActivity(a);
            }
        });

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Translate.class);
                startActivity(a);
            }
        });
    }
}
