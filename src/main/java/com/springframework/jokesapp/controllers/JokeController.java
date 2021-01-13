package com.springframework.jokesapp.controllers;

import com.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/jokes")
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }

}
