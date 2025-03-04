package ru.joxaren.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Bach - 5th simphony" + this;
    }
}
