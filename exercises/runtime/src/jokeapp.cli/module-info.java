module jokeapp.cli {
    requires jokeapp.api;
    requires java.sql;
    uses com.squeed.jokeapp.api.AbstractJokeService;
}
