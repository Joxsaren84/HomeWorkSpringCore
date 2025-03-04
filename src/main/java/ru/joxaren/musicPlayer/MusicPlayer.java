package ru.joxaren.musicPlayer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
@Component
public class MusicPlayer {

    private List<Music> playList;
    @Value("${player.name}")
    private String name;

    @Value("${player.volume}")
    private int volume;

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;

    }

    public String playing(){
        Random random = new Random();
        int number = random.nextInt(playList.size());
        return playList.get(number).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
