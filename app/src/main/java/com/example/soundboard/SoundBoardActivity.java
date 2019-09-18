package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity {

    private Button buttonBs;
    private Button buttonB;
    private Button buttonA;

    private int soundA;
    private int soundB;
    private int soundBb;

    private SoundPool soundPool;
    private int  soundID;
    boolean loaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        wireWidgets();
        setLitseners();
        initializeSoundPool();
    }

    public void wireWidgets() {
        buttonA = findViewById(R.id.button_A);
        buttonB = findViewById(R.id.button_B);
        buttonBs = findViewById(R.id.button_Bb);
    }

    public void initializeSoundPool(); {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sid, int status) {
                loaded = true;
            }
        });
        soundID = soundPool.load(this, R.raw.scalea, 1);
    }

    public void setLitseners() {
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
