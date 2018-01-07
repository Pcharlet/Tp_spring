package com.igs.ipi.tpspringbootCharlet.Service;

import com.igs.ipi.tpspringbootCharlet.model.GameModel;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session_en_cour", proxyMode = ScopedProxyMode.DEFAULT.TARGET_CLASS)
public class PartieEnCours {

    private static GameModel gameModel;

    public static GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }
}
