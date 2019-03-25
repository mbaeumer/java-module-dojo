package se.mbaeumer.jokeapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractJokeService {
    protected List<String> jokes = new ArrayList<>();

    public String getRandomJoke(){
        if (jokes.size() == 0){
            initJokes();
        }
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    };
    abstract void initJokes();

}
