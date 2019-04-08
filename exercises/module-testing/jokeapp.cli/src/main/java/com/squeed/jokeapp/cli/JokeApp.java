package com.squeed.jokeapp.cli;

import com.squeed.jokeapp.api.AbstractJokeService;
import java.util.ServiceLoader;
import java.util.logging.Logger;

public class JokeApp {
    private final static Logger LOGGER = Logger.getLogger(JokeApp.class.getName());
    public static void main(String[] args){
        System.out.println("This is the joke app");
        LOGGER.info("this is a logging message from the cli module");

        Iterable<AbstractJokeService>  jokeServiceIterable = ServiceLoader.load(AbstractJokeService.class);

        for (AbstractJokeService jokeService : jokeServiceIterable){
            System.out.println(jokeService.getRandomJoke());
        }

    }
}
