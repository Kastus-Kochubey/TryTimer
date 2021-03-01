package com.example.trytimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    Button butt_start_stop;
    SeekBar seekBar;
    EditText time_bar;
    AudioManager audioManager;
    MediaPlayer mediaPlayer;
    Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt_start_stop = findViewById(R.id.butt_start_stop);
        seekBar = findViewById(R.id.seekBar);
        time_bar = findViewById(R.id.editTextTime);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.endSound);

        seekBar.setMax(600);

//        time_bar.setText('%d,%d')
        butt_start_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });




        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


}