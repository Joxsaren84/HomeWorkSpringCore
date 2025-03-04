package ru.joxaren.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Nana - Faina" + this;
    }
}
