package com.example.android.musicalstructureabnd;

public class Song {
    private String msongTitle;
    private String msongArtist;
    private String msongAlbum;

    public void songDetails(String songTitle, String songArtist, String songAlbum) {
        msongTitle = songTitle;
        msongArtist = songArtist;
        msongAlbum = songAlbum;
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
