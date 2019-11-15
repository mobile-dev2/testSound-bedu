package com.example.testsound;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sound;
    RecyclerView rcvAnimals;

    Button btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        RcvAdapter rcvAdapter = new RcvAdapter(this);

        rcvAnimals = findViewById(R.id.rcv_animals);
        rcvAnimals.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        //rcvAnimals.setLayoutManager(new LinearLayoutManager(this));
        rcvAnimals.setAdapter(rcvAdapter);

        /*btnStop = findViewById(R.id.btnStop);

        //sound = MediaPlayer.create(getApplicationContext(), R.raw.audio);
        sound = MediaPlayer.create(this, R.raw.audio);
        sound.start();

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.stop();
            }
        });*/



    }
}
