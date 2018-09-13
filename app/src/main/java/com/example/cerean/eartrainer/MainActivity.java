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
        String fileNameToSet = indexToFileName(randomSoundIndex);
        //int help = Integer.parseInt(fileNameToSet);
        //MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.a1);
        MediaPlayer mediaStuff = MediaPlayer.create(this, getResources().getIdentifier("c3", "raw", getPackageName()));
        mediaStuff.start();
        //mediaPlayer.start();
    }

    public void setRandomSoundIndex() { // sounds will be indexed from 1 to 85
        randomSoundIndex = (int) (Math.random() * 85 ); // outputs number from 0 to 84
    }

    public String indexToFileName(int indexInput) {
        String fileName = "";
        //indexInput = 84;
        int octave = (indexInput / 12) + 1;
        int remainder = (indexInput) % 12;
        System.out.println("Octave: " + Integer.toString(octave));
        System.out.println("Remainder: " + Integer.toString(remainder));
        switch(remainder) {
            case 0: fileName+="c" + Integer.toString(octave);
                break;
            case 1:
                fileName+="c" + Integer.toString(octave) + "sharp";
                break;
            case 2:
                fileName+="d" + Integer.toString(octave);
                break;
            case 3:
                fileName+="d" + Integer.toString(octave) + "sharp";
                break;
            case 4:
                fileName+="e" + Integer.toString(octave);
                break;
            case 5:
                fileName+="f" + Integer.toString(octave);
                break;
            case 6:
                fileName+="f" + Integer.toString(octave) + "sharp";
                break;
            case 7:
                fileName+="g" + Integer.toString(octave);
                break;
            case 8:
                fileName+="g" + Integer.toString(octave) + "sharp";
                break;
            case 9:
                fileName+="a" + Integer.toString(octave);
                break;
            case 10:
                fileName+="A" + Integer.toString(octave) + "sharp";
                break;
            case 11:
                fileName+="B" + Integer.toString(octave);
                break;

        }
        System.out.println("fileName: " + fileName);
        return fileName;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRandomSoundIndex();
    }
}
