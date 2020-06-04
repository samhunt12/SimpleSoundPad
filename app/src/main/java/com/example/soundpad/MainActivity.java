package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int newbeatanthem_a_piano_01;
    private int newbeatanthem_a_piano_02;
    private int newbeatanthem_a_piano_03;
    private int newbeatanthem_a_swell_01;
    private int newbeatanthem_a_glitch_01;
    private int newbeatanthem_a_keys_01;
    private int newbeatanthem_a_keys_02;
    private int newbeatanthem_a_keys_03;
    private int newbeatanthem_a_keys_04;
    private int newbeatanthem_a_kick_01;
    private int newbeatanthem_a_hihat_01;
    private int newbeatanthem_a_snare_01;
    private int sound00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        newbeatanthem_a_piano_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_piano_01, 1);
        newbeatanthem_a_piano_02 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_piano_02, 1);
        newbeatanthem_a_piano_03 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_piano_03, 1);
        newbeatanthem_a_swell_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_swell_01, 1);
        newbeatanthem_a_glitch_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_glitch_01, 1);
        newbeatanthem_a_keys_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_keys_01, 1);
        newbeatanthem_a_keys_02 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_keys_02, 1);
        newbeatanthem_a_keys_03 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_keys_03, 1);
        newbeatanthem_a_keys_04 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_keys_04, 1);
        newbeatanthem_a_kick_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_kick_01, 1);
        newbeatanthem_a_hihat_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_hihat_01, 1);
        newbeatanthem_a_snare_01 = sp.load(getApplicationContext(), R.raw.newbeatanthem_a_snare_01, 1);


        sound00 = sp.load(getApplicationContext(), R.raw.sound00, 1);

    }

    public void bunyi1(View v) { sp.play(newbeatanthem_a_piano_01, 1.0f, 1.0f, 0,0,1f); }
    public void bunyi2(View v) {
        sp.play(newbeatanthem_a_piano_02, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi3(View v) {
        sp.play(newbeatanthem_a_piano_03, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi4(View v) {
        sp.play(newbeatanthem_a_swell_01, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi5(View v) {
        sp.play(newbeatanthem_a_glitch_01, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi6(View v) {
        sp.play(newbeatanthem_a_keys_01, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi7(View v) {
        sp.play(newbeatanthem_a_keys_02, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi8(View v) {
        sp.play(newbeatanthem_a_keys_03, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi9(View v) {
        sp.play(newbeatanthem_a_keys_04, 1.0f, 1.0f, 0,0,1f);
    }
    public void bunyi10(View v) { sp.play(newbeatanthem_a_kick_01, 1.0f, 1.0f, 0, 0, 1f); }
    public void bunyi11(View v) { sp.play(newbeatanthem_a_hihat_01, 1.0f, 1.0f, 0, 0, 1f); }
    public void bunyi12(View v) { sp.play(newbeatanthem_a_snare_01, 1.0f, 1.0f, 0, 0, 1f); }
}
