package com.squeed.jokeapp.backend;

import com.squeed.jokeapp.api.*;

public class ChuckNorrisJokeService extends AbstractJokeService {
    public static final String NAME = "chuck";

    @Override
    public void initJokes(){
        jokes.add("If you spell Chuck Norris in Scrabble, you win. Forever.");
        jokes.add("Chuck Norris is the only man to ever defeat a brick wall in a game of tennis.");
        jokes.add("There is no theory of evolution, just a list of creatures Chuck Norris allows to live.");
        jokes.add("Chuck Norris can win a game of Connect Four in only three moves.");
        jokes.add("Crop circles are Chuck Norris' way of telling the world that sometimes corn needs to lie down.");
        jokes.add("Chuck Norris uses pepper spray to spice up his steaks.");

    }
}
