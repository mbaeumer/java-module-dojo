package com.squeed.jokeapp.developer;

import com.squeed.jokeapp.api.*;

public class DeveloperJokeService extends AbstractJokeService {
    public static final String NAME = "chuck";

    @Override
    public void initJokes(){
        jokes.add("A programmer had a problem. He used Java. Now he has a ProblemFactory.");
        jokes.add("Why did the developer quit the job? Because he did not get arrays");
        jokes.add("Why do Java developers wear glasses? Because they do not C#");
        jokes.add("An SQL database walks into a NoSQL bar...a while later it walks out again, because it could not find a table ");
        jokes.add("An SQL query goes into a bar, walks up to two table and asks 'Can I join you?'");
        jokes.add("Why was the C programmer ignored by everyone during the last party? Because she did not have class.");

    }
}
