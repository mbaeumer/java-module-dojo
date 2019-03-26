package com.squeed.jokeapp.factory;

import java.util.List;
import com.squeed.jokeapp.api.*;
import com.squeed.jokeapp.backend.ChuckNorrisJokeService;
import com.squeed.jokeapp.backend.GothenburgJokeService;


public class JokeServiceFactory {
    public static List<String> getSupportedJokeTypes(){
        return List.of(ChuckNorrisJokeService.NAME, GothenburgJokeService.NAME);
    }

    public static AbstractJokeService getJokeService(final String name){
        switch(name){
            case ChuckNorrisJokeService.NAME: return new ChuckNorrisJokeService();
            case GothenburgJokeService.NAME: return new GothenburgJokeService();
            default: throw new IllegalArgumentException("No valid service name provided");
        }

    }


}
