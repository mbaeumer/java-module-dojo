package com.squeed.jokeapp.cli;

import com.squeed.jokeapp.api.*;
import java.util.ServiceLoader;


public class JokeApp {
    public static void main(String[] args){
        System.out.println("This is the joke app");

        Iterable<AbstractJokeService>  jokeServiceIterable = ServiceLoader.load(AbstractJokeService.class);

        for (AbstractJokeService jokeService : jokeServiceIterable){
            System.out.println(jokeService.getRandomJoke());
        }

    }
}
