package com.example.android.musicalstructureabnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//TODO: create intents for all buttons in mainactivity
//TODO: add an array of all songs in mainactivity
//TODO: create an array adapter class
//TODO: create an instance of the array adapter and use it

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates an onclick listener for the Artists menu item
        TextView artistsMenu = (TextView) findViewById(R.id.go_to_artists);
        artistsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, Category.class);
                startActivity(artistsIntent);
            }
        });

        //creates an onclick listener for the Albums menu item
        TextView albumsMenu = (TextView) findViewById(R.id.go_to_albums);
        albumsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, Category.class);
                startActivity(albumsIntent);
            }
        });

        //creates an onclick listener for the Songs menu item
        TextView songsMenu = (TextView) findViewById(R.id.go_to_songs);
        songsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, Category.class);
                startActivity(songsIntent);
            }
        });

        //creates an onclick listener for the Favourites menu item
        TextView favouritesMenu = (TextView) findViewById(R.id.go_to_favourites);
        favouritesMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favouritesIntent = new Intent(MainActivity.this, Category.class);
                startActivity(favouritesIntent);
            }
        });
    }
}

