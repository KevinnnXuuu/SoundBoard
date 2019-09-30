package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.widget.Toast.LENGTH_SHORT;

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
    private Button buttonSongUsermade;
    private ArrayList<Note> song1;
    private ArrayList<Note> song1edit;
    private ArrayList<Note> songUsermade;
    private Button buttonScale;

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

    private Note noteA;
    private Note noteBb;
    private Note noteB;
    private Note noteC;
    private Note noteCs;
    private Note noteD;
    private Note noteDs;
    private Note noteE;
    private Note noteF;
    private Note noteFs;
    private Note noteG;
    private Note noteGs;

    private Switch switchAddNotes;
    private Switch switchRecord;


    private Map<Integer, Integer> noteMap;

    private SoundPool soundPool;
    boolean loaded = false;
    boolean recording = false;
    boolean adding = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);

        wireWidgets();
        initializeSoundPool();
        setLitseners();
        initializeNotes();
        initializeSongs();

    }

    private void initializeSongs() {
        ArrayList<Note> song1 = new ArrayList<>();
        song1.add(noteG);
        song1.add(noteG);
        song1.add(noteE);
        song1.add(noteG);
        song1.add(noteE);
        song1.add(noteA);
        song1edit = song1;
    }

    private void initializeNotes() {
        noteA = new Note(soundA,200);
        noteBb = new Note(soundBb,200);
        noteB = new Note(soundB,200);
        noteC = new Note(soundC,200);
        noteCs = new Note(soundCs,200);
        noteD = new Note(soundD,200);
        noteDs = new Note(soundDs,200);
        noteE = new Note(soundE,200);
        noteF = new Note(soundF,200);
        noteFs = new Note(soundFs,200);
        noteG = new Note(soundG,200);
        noteGs = new Note(soundGs,200);

        ArrayList<Note> song1 = new ArrayList<>();
        song1.add(noteG);
        song1.add(noteG);
        song1.add(noteE);
        song1.add(noteG);
        song1.add(noteE);
        song1.add(noteA);
        song1edit = song1;

        ArrayList<Note> songUser = new ArrayList<>();
        songUsermade = songUser;
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
        buttonSongUsermade = findViewById((R.id.button_song_user));
        buttonScale = findViewById(R.id.button_scale);
        switchAddNotes = findViewById(R.id.switch_add_note);
        switchRecord = findViewById(R.id.switch_record_note);
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

        noteMap = new HashMap<>();
        noteMap.put(buttonA.getId(), soundA);
        noteMap.put(buttonB.getId(), soundB);
        noteMap.put(buttonBb.getId(), soundBb);
        noteMap.put(buttonC.getId(), soundC);
        noteMap.put(buttonCs.getId(), soundCs);
        noteMap.put(buttonD.getId(), soundD);
        noteMap.put(buttonDs.getId(), soundDs);
        noteMap.put(buttonE.getId(), soundE);
        noteMap.put(buttonF.getId(), soundF);
        noteMap.put(buttonFs.getId(), soundFs);
        noteMap.put(buttonG.getId(), soundG);
        noteMap.put(buttonGs.getId(), soundGs);
    }

    public void setLitseners() {
        KeyboardListensers keyboardListensers = new KeyboardListensers();
        buttonA.setOnClickListener(keyboardListensers);
        buttonB.setOnClickListener(keyboardListensers);
        buttonBb.setOnClickListener(keyboardListensers);
        buttonC.setOnClickListener(keyboardListensers);
        buttonCs.setOnClickListener(keyboardListensers);
        buttonD.setOnClickListener(keyboardListensers);
        buttonDs.setOnClickListener(keyboardListensers);
        buttonE.setOnClickListener(keyboardListensers);
        buttonF.setOnClickListener(keyboardListensers);
        buttonFs.setOnClickListener(keyboardListensers);
        buttonG.setOnClickListener(keyboardListensers);
        buttonGs.setOnClickListener(keyboardListensers);

        buttonSongOne.setOnClickListener(this);
        buttonSongUsermade.setOnClickListener(this);
        buttonScale.setOnClickListener(this);

        switchAddNotes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonAddNotes, boolean isChecked) {
                adding = isChecked;
            }
        });

        switchRecord.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonRecord, boolean isChecked) {
                recording = isChecked;
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_song_1: {
                playNote(song1edit);
                break;
            }
            case R.id.button_song_user: {
                playNote(songUsermade);
                break;
            }
            case R.id.button_scale: {
                scale();
            }
        }
    }

    private void scale() {
        int[] scale = {soundA, soundBb, soundB, soundC, soundCs, soundD, soundDs, soundE, soundF, soundFs, soundG, soundGs};
        if (loaded) {
            for (int i = 0; i < 12; i++) {
                soundPool.play(scale[i], 1, 1, 1, 0, 1);
                delay(200);
            }
        }
    }

    private class KeyboardListensers implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int songId = noteMap.get(view.getId());
            if(adding || recording) {
                addNote(songId);
                soundPool.play(songId, 1, 1, 1, 0, 1);
            }
            else if (songId != 0) {
                soundPool.play(songId, 1, 1, 1, 0, 1);
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

    public void playNote(ArrayList<Note> song) {
        for (Note note: song) {
            soundPool.play(note.getSoundID(), 1, 1, 1, 0, 1);
            delay(note.getTimeDelayed());
        }
    }

    public void addNote(int soundAdded) {
        Note noteAdded = new Note(soundAdded, 200);
        if (adding) {
            song1edit.add(noteAdded);
        }
        else if(recording) {
            songUsermade.add(noteAdded);
        }
    }

}
