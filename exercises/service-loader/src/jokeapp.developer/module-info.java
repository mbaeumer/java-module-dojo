module jokeapp.developer {
    requires jokeapp.api;

    provides com.squeed.jokeapp.api.AbstractJokeService
            with com.squeed.jokeapp.developer.DeveloperJokeService;
}
