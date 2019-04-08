module jokeapp.chucknorris {
    requires jokeapp.api;

    provides com.squeed.jokeapp.api.AbstractJokeService
            with com.squeed.jokeapp.chucknorris.ChuckNorrisJokeService;
}
