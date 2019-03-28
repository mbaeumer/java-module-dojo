package com.squeed.jokeapp.cli;

import com.squeed.jokeapp.factory.JokeServiceFactory;
import com.squeed.jokeapp.api.*;

public class JokeApp {
    public static void main(String[] args){
        System.out.println("This is the joke app");

        AbstractJokeService abstractJokeService = JokeServiceFactory.getJokeService("chuck");
        System.out.println(abstractJokeService.getRandomJoke());

        abstractJokeService = JokeServiceFactory.getJokeService("got");
        System.out.println(abstractJokeService.getRandomJoke());
    }
}
