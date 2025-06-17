package org.example;


public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();
        playlist.clear();
        playlist.load();
        playlist.add(new Track( "LadyBug", "LAdy", "C:\\main\\dz\\HWinf\\dz20\\MusicPlaylist\\Miraculous Ladybug (Season 5)(Instrumental).wav11" ));
        playlist.save();

        Console console = new Console();
        console.startCommand();
    }
}