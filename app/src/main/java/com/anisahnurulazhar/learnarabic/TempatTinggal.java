package com.anisahnurulazhar.learnarabic;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class TempatTinggal extends AppCompatActivity {

    Button play, stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_tinggal);

        play = (Button) findViewById(R.id.btnPlay);
        stop = (Button) findViewById(R.id.btnStop);
        stop.setEnabled(false);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play.getText().toString().equals("Pause") && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    play.setText("Resume");
                } else if (play.getText().toString().equals("Resume")) {
                    mediaPlayer.start();
                    play.setText("Pause");
                } else {
                    mediaPlayer = new MediaPlayer();
                    //URI = Uniform Resource Identifier
                    Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tempattinggal);
                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                    try {

                        mediaPlayer.setDataSource(getApplicationContext(), uri);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {

                        mediaPlayer.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mediaPlayer.start();
                    stop.setEnabled(true);
                    play.setText("Pause");


                }


            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    stop.setEnabled(false);
                    play.setEnabled(true);
                }
            }
        });
    }
}

