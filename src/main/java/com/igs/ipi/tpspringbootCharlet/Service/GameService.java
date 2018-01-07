package com.igs.ipi.tpspringbootCharlet.Service;

import javax.xml.ws.Service;
import com.igs.ipi.tpspringbootCharlet.model.GameModel;

@org.springframework.stereotype.Service
public class GameService {

    public GameModel newGame() {
        GameModel gameModel = new GameModel();
        gameModel.setNom1("Gérard");
        gameModel.setNom2("TERA100");
        return gameModel;
    }
}
