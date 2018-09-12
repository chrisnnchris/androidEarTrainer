package com.example.cerean.eartrainer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //MediaPlayer mediaPlayer;
    int randomSoundIndex;
    public void playSound(View view) {
        Log.i("randomSoundIndex", Integer.toString(randomSoundIndex));
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.a1);

        mediaPlayer.start();
    }

    public void setRandomSoundIndex() { // sounds will be indexed from 1 to 85
        randomSoundIndex = (int) (Math.random() * 85  + 1); // outputs number from 0 to 85
    }

    public String indexToFileName(int indexInput) {
        int octave = (indexInput / 12) + 1;
        int remainder = (indexInput) % 12;
        return "test";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRandomSoundIndex();
    }
}
