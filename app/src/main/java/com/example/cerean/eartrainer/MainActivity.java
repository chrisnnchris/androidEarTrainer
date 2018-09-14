package com.example.cerean.eartrainer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //MediaPlayer mediaPlayer;
    int randomSoundIndex;
    Button playSoundButton;

    public void playSound(View view) {
        Log.i("randomSoundIndex", Integer.toString(randomSoundIndex));
        String fileNameToSet = indexToFileName(randomSoundIndex);
        Log.i("fileNameToSet", fileNameToSet);
        //int help = Integer.parseInt(fileNameToSet);
        //MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.a1);
        MediaPlayer mediaStuff = MediaPlayer.create(this, getResources().getIdentifier(fileNameToSet, "raw", getPackageName()));
        mediaStuff.start();
        playSoundButton.setEnabled(false);
        CountDownTimer countDownTimer = new CountDownTimer(4 * 1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Yo", "as stated");
            }

            @Override
            public void onFinish() {
                Log.i("finished", "as stated");
                playSoundButton.setEnabled(true);
            }
        }.start();
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
        playSoundButton = findViewById(R.id.repeatSoundButton);
    }
}
