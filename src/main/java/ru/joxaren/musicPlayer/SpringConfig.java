package ru.joxaren.musicPlayer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:player.properties")
public class SpringConfig {

    @Value("${player.name}")
    private String name;

    @Value("${player.volume}")
    private int volume;

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList(){
        List<Music> list = new ArrayList<>();
        list.add(classicalMusic());
        list.add(rockMusic());
        list.add(popMusic());
        return list;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList(), name, volume);
    }
}
