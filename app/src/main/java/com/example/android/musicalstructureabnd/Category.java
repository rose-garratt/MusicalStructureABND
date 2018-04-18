package com.example.android.musicalstructureabnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
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
      ArrayList<com.example.android.musicalstructureabnd.Song> songList = new ArrayList<>();
      songList.add(new Song("Kilamba", "Kyaku Kyadaff", "Se Hungwile"));
      songList.add(new Song("Biscoitinho", "Yuri da Cunha", "O Intérprete"));
      songList.add(new Song("Aló", "Matias Damasio", "Por Amor"));
      songList.add(new Song("Sirens", "Pearl Jam", "Lightning Bolt"));
      songList.add(new Song("Nearly Forgot My Broken Heart", "Chris Cornell", "Higher Truth"));
      songList.add(new Song("On The Beach", "Neil Young", "On The Beach"));
      songList.add(new Song("Minor Swing", "Django Reinhardt and Stéphane Grappelli", "The Quintet of the Hot Club of France"));
      songList.add(new Song("Since I've Been Loving You", "Led Zeppelin", "Led Zeppelin III"));
      songList.add(new Song("Streamline", "System Of A Down", "Steal This Album"));
      songList.add(new Song("Four", "Miles Davis Quintet", "Workin'"));
      songList.add(new Song("Nature Boy", "Nat King Cole", "The Nat King Cole Story"));

        SongAdapter adapter = new SongAdapter(this, songList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
