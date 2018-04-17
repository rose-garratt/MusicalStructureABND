package com.example.android.musicalstructureabnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        TextView backToMain = (TextView) findViewById(R.id.back_to_main);
        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         finish();
         }
        });
      //  ArrayList<com.example.android.musicalstructureabnd.Song> songList = new ArrayList<>();
      //  songList.add(new com.example.android.musicalstructureabnd.Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));
      //  songList.add(new com.example.android.musicalstructureabnd.Song("Biscoitinho", "Yuri da Cunha", "O Intérprete"));
      //  songList.add(new com.example.android.musicalstructureabnd.Song("Aló", "Matias Damasio", "Por Amor"));
      //  songList.add(new com.example.android.musicalstructureabnd.Song("Sirens", "Pearl Jam, "Lighning Bolt"));
      //  songList.add(new com.example.android.musicalstructureabnd.Song("...", "...", "..."))
        //  songList.add(new com.example.android.musicalstructureabnd.Song("On The Beach", "Neil Young", "On The Beach"));
        //  songList.add(new com.example.android.musicalstructureabnd.Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));
        //  songList.add(new com.example.android.musicalstructureabnd.Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));
        //  songList.add(new com.example.android.musicalstructureabnd.Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));
        //  songList.add(new com.example.android.musicalstructureabnd.Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));
        //  songList.add(new com.example.android.musicalstructureabnd.Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));

    }
}
