package ru.joxaren.musicPlayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPlayer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Player: " + player.getName() + "\nvolume: " + player.getVolume());

        for (int i = 0; i < 10; i++) {
            System.out.println(player.playing());
        }
    }
}
