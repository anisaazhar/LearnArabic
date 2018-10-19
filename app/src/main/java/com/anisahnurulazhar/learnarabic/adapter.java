package com.anisahnurulazhar.learnarabic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by adminmacbook on 5/4/18.
 */

public class adapter extends ArrayAdapter {
    private final Activity context;
    private final int gambar[];
    private final String nama[];
    private final String isi[];

    public adapter( Activity context, int[] gambar, String[] nama, String[] isi) {
        super(context, R.layout.listitem,nama);
        this.context = context;
        this.gambar = gambar;
        this.nama = nama;
        this.isi = isi;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.listitem, null, true);
        TextView txt = (TextView) v.findViewById(R.id.textView);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);

        txt.setText(nama[position]);
        img.setImageResource(gambar[position]);


        return v;
    }

}