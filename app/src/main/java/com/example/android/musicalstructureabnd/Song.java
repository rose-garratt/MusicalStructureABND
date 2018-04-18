package com.example.android.musicalstructureabnd;

public class Song {
    private String msongTitle;
    private String msongArtist;
    private String msongAlbum;

    Song(String msongTitle, String msongArtist, String msongAlbum) {
        this.msongTitle = msongTitle;
        this.msongArtist = msongArtist;
        this.msongAlbum = msongAlbum;
        }

        public String getTitle()    {
        return msongTitle;
        }

        public String getArtist()   {
        return msongArtist;
        }

        public String getAlbum()    {
        return msongAlbum;
        }
}
