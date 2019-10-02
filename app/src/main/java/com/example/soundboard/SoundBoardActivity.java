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
    private Button buttonHighA;
    private Button buttonHighBb;
    private Button buttonHighB;
    private Button buttonHighC;
    private Button buttonHighCs;
    private Button buttonHighD;
    private Button buttonHighDs;
    private Button buttonHighE;
    private Button buttonHighF;
    private Button buttonHighFs;
    private Button buttonHighG;
    private Button buttonHighGs;

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
    private int soundHighA;
    private int soundHighBb;
    private int soundHighB;
    private int soundHighC;
    private int soundHighCs;
    private int soundHighD;
    private int soundHighDs;
    private int soundHighE;
    private int soundHighF;
    private int soundHighFs;
    private int soundHighG;
    private int soundHighGs;

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
    private Note noteHighA;
    private Note noteHighBb;
    private Note noteHighB;
    private Note noteHighC;
    private Note noteHighCs;
    private Note noteHighD;
    private Note noteHighDs;
    private Note noteHighE;
    private Note noteHighF;
    private Note noteHighFs;
    private Note noteHighG;
    private Note noteHighGs;

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
        song1.add(noteHighD);
        song1.add(noteHighE);
        song1.add(noteHighD);
        song1.add(noteHighE);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteD);
        delay(150);
        song1.add(noteHighD);
        delay(150);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteFs);
        delay(150);
        song1.add(noteHighA);
        delay(150);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteE);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteHighD);
        song1.add(noteHighB);
        song1.add(noteHighA);
        song1.add(noteFs);
        song1.add(noteE);
        song1.add(noteD);
        song1.add(noteE);
        song1.add(noteHighD);
        song1.add(noteHighE);
        song1.add(noteHighD);
        song1.add(noteHighE);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteFs);
        song1.add(noteHighA); //line 1

        song1.add(noteD);
        delay(150);
        song1.add(noteHighD);
        delay(150);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteFs);
        delay(150);
        song1.add(noteHighA);
        delay(150);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteE);
        song1.add(noteFs);
        song1.add(noteHighA);
        delay(150);
        song1.add(noteHighD);
        delay(150);
        song1.add(noteD);
        delay(300);
        song1.add(noteHighD);
        song1.add(noteHighE);
        song1.add(noteHighD);
        song1.add(noteHighE);
        song1.add(noteHighFs);
        delay(150);
        song1.add(noteHighFs);
        delay(150);
        song1.add(noteHighE);
        song1.add(noteHighFs);
        song1.add(noteHighE);
        song1.add(noteHighFs);
        song1.add(noteHighGs);
        delay(150);
        song1.add(noteHighGs);
        delay(150);
        song1.add(noteHighGs);
        delay(150);
        song1.add(noteHighE);
        delay(150);
        song1.add(noteHighFs);
        song1.add(noteHighGs);
        song1.add(noteHighFs);
        song1.add(noteHighE); //line 2

        song1.add(noteHighD);
        song1.add(noteHighFs);
        song1.add(noteHighE);
        song1.add(noteHighD);
        song1.add(noteHighA);
        delay(150);
        song1.add(noteHighA);
        delay(150);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteD);
        song1.add(noteE);
        song1.add(noteFs);
        song1.add(noteHighA);
        song1.add(noteE);
        song1.add(noteHighA);
        song1.add(noteFs);
        song1.add(noteE);
        song1.add(noteD);
        song1.add(noteHighD);
        song1.add(noteHighB);
        song1.add(noteHighD);
        song1.add(noteE);
        song1.add(noteHighA);
        song1.add(noteFs);
        song1.add(noteE);
        song1.add(noteD);
        delay(150);
        song1.add(noteHighD);
        delay(200);
        song1.add(noteD);

        song1edit = song1;

        ArrayList<Note> songUser = new ArrayList<>();
        songUsermade = songUser;
    }

    private void initializeNotes() {
        noteA = new Note(soundA,150);
        noteBb = new Note(soundBb,150);
        noteB = new Note(soundB,150);
        noteC = new Note(soundC,150);
        noteCs = new Note(soundCs,150);
        noteD = new Note(soundD,150);
        noteDs = new Note(soundDs,150);
        noteE = new Note(soundE,150);
        noteF = new Note(soundF,150);
        noteFs = new Note(soundFs,150);
        noteG = new Note(soundG,150);
        noteGs = new Note(soundGs,150);
        noteHighA = new Note(soundHighA,150);
        noteHighBb = new Note(soundHighBb,150);
        noteHighB = new Note(soundHighB,150);
        noteHighC = new Note(soundHighC,150);
        noteHighCs = new Note(soundHighCs,150);
        noteHighD = new Note(soundHighD,150);
        noteHighDs = new Note(soundHighDs,150);
        noteHighE = new Note(soundHighE,150);
        noteHighF = new Note(soundHighF,150);
        noteHighFs = new Note(soundHighFs,150);
        noteHighG = new Note(soundHighG,150);
        noteHighGs = new Note(soundHighGs,150);
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
        buttonHighA = findViewById(R.id.button_high_A);
        buttonHighBb = findViewById(R.id.button_high_Bb);
        buttonHighB = findViewById(R.id.button_high_B);
        buttonHighC = findViewById(R.id.button_high_C);
        buttonHighCs = findViewById(R.id.button_high_Cs);
        buttonHighD = findViewById(R.id.button_high_D);
        buttonHighDs = findViewById(R.id.button_high_Ds);
        buttonHighE = findViewById(R.id.button_high_E);
        buttonHighF = findViewById(R.id.button_high_F);
        buttonHighFs = findViewById(R.id.button_high_Fs);
        buttonHighG = findViewById(R.id.button_high_G);
        buttonHighGs = findViewById(R.id.button_high_Gs);

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
        soundHighA = soundPool.load(this, R.raw.scalehigha, 1);
        soundHighBb = soundPool.load(this, R.raw.scalehighbb, 1);
        soundHighB = soundPool.load(this, R.raw.scalehighb, 1);
        soundHighC = soundPool.load(this, R.raw.scalehighc, 1);
        soundHighCs = soundPool.load(this, R.raw.scalehighcs, 1);
        soundHighD = soundPool.load(this, R.raw.scalehighd, 1);
        soundHighDs = soundPool.load(this, R.raw.scalehighds, 1);
        soundHighE = soundPool.load(this, R.raw.scalehighe, 1);
        soundHighF = soundPool.load(this, R.raw.scalehighf, 1);
        soundHighFs = soundPool.load(this, R.raw.scalehighfs, 1);
        soundHighG = soundPool.load(this, R.raw.scalehighg, 1);
        soundHighGs = soundPool.load(this, R.raw.scalehighgs, 1);

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
        noteMap.put(buttonHighA.getId(), soundHighA);
        noteMap.put(buttonHighB.getId(), soundHighB);
        noteMap.put(buttonHighBb.getId(), soundHighBb);
        noteMap.put(buttonHighC.getId(), soundHighC);
        noteMap.put(buttonHighCs.getId(), soundHighCs);
        noteMap.put(buttonHighD.getId(), soundHighD);
        noteMap.put(buttonHighDs.getId(), soundHighDs);
        noteMap.put(buttonHighE.getId(), soundHighE);
        noteMap.put(buttonHighF.getId(), soundHighF);
        noteMap.put(buttonHighFs.getId(), soundHighFs);
        noteMap.put(buttonHighG.getId(), soundHighG);
        noteMap.put(buttonHighGs.getId(), soundHighGs);
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
        buttonHighA.setOnClickListener(keyboardListensers);
        buttonHighB.setOnClickListener(keyboardListensers);
        buttonHighBb.setOnClickListener(keyboardListensers);
        buttonHighC.setOnClickListener(keyboardListensers);
        buttonHighCs.setOnClickListener(keyboardListensers);
        buttonHighD.setOnClickListener(keyboardListensers);
        buttonHighDs.setOnClickListener(keyboardListensers);
        buttonHighE.setOnClickListener(keyboardListensers);
        buttonHighF.setOnClickListener(keyboardListensers);
        buttonHighFs.setOnClickListener(keyboardListensers);
        buttonHighG.setOnClickListener(keyboardListensers);
        buttonHighGs.setOnClickListener(keyboardListensers);

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
        int[] scale = {soundA, soundBb, soundB, soundC, soundCs, soundD,
                       soundDs, soundE, soundF, soundFs, soundG, soundGs,
                       soundHighA, soundHighBb, soundHighB, soundHighC, soundHighCs, soundHighD,
                       soundHighDs, soundHighE, soundHighF, soundHighFs, soundHighG, soundHighGs,};
        if (loaded) {
            for (int i = 0; i < 24; i++) {
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
            Toast.makeText(this, noteAdded.getSoundID() + " Added", LENGTH_SHORT ).show();
        }
        else if(recording) {
            songUsermade.add(noteAdded);
            Toast.makeText(this, noteAdded.getSoundID() + " Recorded", LENGTH_SHORT ).show();
        }
    }

}
