package guru.springframework.springbootjokesapp.services.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.springbootjokesapp.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Service;

@Service
public class DefaultChuckNorrisJokeService implements ChuckNorrisJokeService {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
