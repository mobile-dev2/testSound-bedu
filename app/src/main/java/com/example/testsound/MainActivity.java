package com.example.testsound;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sound;
    RecyclerView rcvAnimals;

    List<Animal> animals = new ArrayList<>();

    Button btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);



        Animal caballo = new Animal("Caballo", R.raw.caballo, R.drawable.caballo);
        animals.add(caballo);

        Animal cabra = new Animal("Cabra", R.raw.cabra, R.drawable.cabra);
        animals.add(cabra);

        Animal cerdo = new Animal("Cerdo", R.raw.cerdo, R.drawable.cerdo);
        animals.add(cerdo);

        Animal gallo = new Animal("Gallo", R.raw.gallo, R.drawable.gallo);
        animals.add(gallo);

        Animal mono = new Animal("Caballo", R.raw.mono, R.drawable.mono);
        animals.add(mono);

        Animal perro = new Animal("Perro", R.raw.perro, R.drawable.perro);
        animals.add(perro);

        Animal serpiente = new Animal("Serpiente", R.raw.serpiente, R.drawable.serpiente);
        animals.add(serpiente);

        Animal tigre = new Animal("Tigre", R.raw.tigre, R.drawable.tigre);
        animals.add(tigre);

        RcvAdapter rcvAdapter = new RcvAdapter(this, animals);

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
