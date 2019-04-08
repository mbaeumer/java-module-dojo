module jokeapp.gothenburg {
    requires jokeapp.api;

    provides com.squeed.jokeapp.api.AbstractJokeService
            with com.squeed.jokeapp.gothenburg.GothenburgJokeService;
}
