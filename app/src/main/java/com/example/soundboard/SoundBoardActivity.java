package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SoundBoardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonA;
    private Button buttonBb;
    private Button buttonB;
    private Button buttonC;
    private Button buttonCs;
    private Button buttonD;
    private Button buttonDs;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFs;
    private Button buttonG;
    private Button buttonGs;

    private Button buttonSongOne;

    private int soundA;
    private int soundBb;
    private int soundB;
    private int soundC;
    private int soundCs;
    private int soundD;
    private int soundDs;
    private int soundE;
    private int soundF;
    private int soundFs;
    private int soundG;
    private int soundGs;

    private SoundPool soundPool;
    boolean loaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);

        wireWidgets();
        initializeSoundPool();
        setLitseners();

    }

    public void wireWidgets() {
        buttonA = findViewById(R.id.button_A);
        buttonBb = findViewById(R.id.button_Bb);
        buttonB = findViewById(R.id.button_B);
        buttonC = findViewById(R.id.button_C);
        buttonCs = findViewById(R.id.button_Cs);
        buttonD = findViewById(R.id.button_D);
        buttonDs = findViewById(R.id.button_Ds);
        buttonE = findViewById(R.id.button_E);
        buttonF = findViewById(R.id.button_F);
        buttonFs = findViewById(R.id.button_Fs);
        buttonG = findViewById(R.id.button_G);
        buttonGs = findViewById(R.id.button_Gs);

        buttonSongOne = findViewById(R.id.button_song_1);
    }

    public void initializeSoundPool() {
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sid, int status) {
                loaded = true;
            }
        });

        soundA = soundPool.load(this, R.raw.scalea, 1);
        soundBb = soundPool.load(this, R.raw.scalebb, 1);
        soundB = soundPool.load(this, R.raw.scaleb, 1);
        soundC = soundPool.load(this, R.raw.scalec, 1);
        soundCs = soundPool.load(this, R.raw.scalecs, 1);
        soundD = soundPool.load(this, R.raw.scaled, 1);
        soundDs = soundPool.load(this, R.raw.scaleds, 1);
        soundE = soundPool.load(this, R.raw.scalee, 1);
        soundF = soundPool.load(this, R.raw.scalef, 1);
        soundFs = soundPool.load(this, R.raw.scalefs, 1);
        soundG = soundPool.load(this, R.raw.scaleg, 1);
        soundGs = soundPool.load(this, R.raw.scalegs, 1);

    }

    public void setLitseners() {
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loaded) {
                    soundPool.play(soundA, 1, 1, 1, 0, 1);
                }
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loaded) {
                    soundPool.play(soundB, 1, 1, 1, 0, 1);
                }
            }
        });

        buttonBb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loaded) {
                    soundPool.play(soundBb, 1, 1, 1, 0, 1);
                }
            }
        });

        buttonSongOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_song_1: {
                soundPool.play(soundC, 1,1,1,0,1);
                delay(500);
                soundPool.play(soundE, 1,1,1,0,1);
                delay(750);
                soundPool.play(soundC, 1,1,1,0,1);
                delay(250);
                soundPool.play(soundE, 1,1,1,0,1);
                delay(2000);
                soundPool.play(soundA, 1,1,1,0,1);
                delay(500);
                soundPool.play(soundC, 1,1,1,0,1);
                delay(750);
                soundPool.play(soundA, 1,1,1,0,1);
                delay(250);
                soundPool.play(soundBb, 1,1,1,0,1);
                delay(2000);


                break;
            }
        }
    }

    public void delay(int millieDelay) {
        try {
            Thread.sleep(millieDelay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
