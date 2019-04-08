package com.squeed.jokeapp.cli;

import com.squeed.jokeapp.backend.AbstractJokeService;
import com.squeed.jokeapp.backend.ChuckNorrisJokeService;
import com.squeed.jokeapp.backend.GothenburgJokeService;

public class JokeApp {
    public static void main(String[] args){
        System.out.println("This is the joke app");
        AbstractJokeService jokeService = new ChuckNorrisJokeService();
        System.out.println(jokeService.getRandomJoke());
        jokeService = new GothenburgJokeService();
        System.out.println(jokeService.getRandomJoke());

    }
}
