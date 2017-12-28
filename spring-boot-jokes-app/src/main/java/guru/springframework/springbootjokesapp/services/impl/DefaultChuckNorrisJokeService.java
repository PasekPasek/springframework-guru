package guru.springframework.springbootjokesapp.services.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.springbootjokesapp.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultChuckNorrisJokeService implements ChuckNorrisJokeService {

    ChuckNorrisQuotes quotes;

    @Autowired
    public DefaultChuckNorrisJokeService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
