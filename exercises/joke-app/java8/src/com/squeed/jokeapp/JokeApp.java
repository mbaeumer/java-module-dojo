package se.mbaeumer.jokeapp;

public class JokeApp {
    public static void main(String[] args){
        System.out.println("This is the joke app");
        AbstractJokeService jokeService = new ChuckNorrisJokeService();
        System.out.println(jokeService.getRandomJoke());
        jokeService = new GothenburgJokeService();
        System.out.println(jokeService.getRandomJoke());

    }
}
