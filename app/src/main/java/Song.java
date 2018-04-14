package com.example.android.musicalstructureabnd;

public class Song {
    private String xsongTitle;
    private String xsongArtist;
    private String xsongAlbum;

    public void songDetails(String songTitle, String songArtist, String songAlbum) {
        xsongTitle = songTitle;
        xsongArtist = songArtist;
        xsongAlbum = songAlbum;
        }

        public String displaySongDetails() {
        return xsongTitle + ", " + xsongArtist + ", " + xsongAlbum;
        }

        public String getSongTitle()
}
