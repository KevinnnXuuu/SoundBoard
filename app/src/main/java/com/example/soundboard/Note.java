package com.example.soundboard;


public class Note {

    private int soundID;
    private int timeDelayed;

    public Note(int soundID, int timeDelayed) {

        this.soundID = soundID;
        this.timeDelayed = timeDelayed;
    }
    public int getSoundID() {
        return soundID;
    }

    public int getTimeDelayed() {
        return timeDelayed;
    }
}
