package com.igs.ipi.tpspringbootCharlet.controller;


import com.igs.ipi.tpspringbootCharlet.Service.GameService;
import com.igs.ipi.tpspringbootCharlet.Service.PartieEnCours;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.igs.ipi.tpspringbootCharlet.model.GameModel;
import com.igs.ipi.tpspringbootCharlet.Service.GameService;

@Controller
@RequestMapping("/")
public class GameController {

    private GameService gameService;

    public GameController(GameService game) {
        this.gameService = game;
        }

    @RequestMapping("/game/new")
    public ModelAndView newGame(HttpServletResponse request, HttpServletResponse response){
        ModelAndView m = new ModelAndView("game");
        GameModel gameModel = gameService.newGame();
        m.addObject("game", gameModel);
        return m;
    }

    @GetMapping("/game")
    public ModelAndView game(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView MaV = new ModelAndView("game");
        GameModel gameModel = PartieEnCours.getGameModel();
        MaV.addObject("game", gameModel);
        return MaV;
    }

}
