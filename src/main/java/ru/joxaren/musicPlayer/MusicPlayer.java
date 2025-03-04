package ru.joxaren.musicPlayer;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> playLIst;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> playLIst, String name, int volume) {
        this.playLIst = playLIst;
        this.name = name;
        this.volume = volume;
    }

    public String playing(){
        Random random = new Random();
        int number = random.nextInt(playLIst.size());
        return playLIst.get(number).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
