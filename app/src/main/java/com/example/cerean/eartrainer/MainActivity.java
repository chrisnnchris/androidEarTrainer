package com.example.cerean.eartrainer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //MediaPlayer mediaPlayer;
    int randomSoundIndex;
    public void playSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.a1);

        mediaPlayer.start();
    }

    public void setRandomSoundIndex() {
        randomSoundIndex = (int) (Math.random() * 86);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
