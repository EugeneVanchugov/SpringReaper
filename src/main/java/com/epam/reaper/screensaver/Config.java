package com.epam.reaper.screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "com.epam.reaper.screensaver")
public class Config {

    @Bean
    @Scope("periodical")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255),random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public AbstractColorFrame frame(){
        return new AbstractColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

}

