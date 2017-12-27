package guru.springframework.springbootjokesapp.controllers;

import guru.springframework.springbootjokesapp.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokesController {
    ChuckNorrisJokeService jokeService;

    @RequestMapping({"/", ""})
    public String getRandomJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chucknorris";
    }

    @Autowired
    public void setJokeService(ChuckNorrisJokeService jokeService) {
        this.jokeService = jokeService;
    }
}
