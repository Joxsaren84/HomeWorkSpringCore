package ru.joxaren.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Lead Zeppelin - Moby Dick" + this;
    }
}
