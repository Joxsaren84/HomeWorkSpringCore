package ru.joxaren.musicPlayer;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.joxaren.musicPlayer")
@PropertySource("classpath:player.properties")
public class SpringConfig {

    @Bean
    public List<Music> musicList(){
        List<Music> list = new ArrayList<>();
        list.add(new ClassicalMusic());
        list.add(new RockMusic());
        list.add(new PopMusic());
        return list;
    }
}
