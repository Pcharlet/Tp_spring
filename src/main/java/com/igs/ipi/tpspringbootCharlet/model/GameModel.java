package com.igs.ipi.tpspringbootCharlet.model;

public class GameModel {

    private static final int LARGEUR = 7;
    private static final int HAUTEUR = 6;

    private String nom1;

    private String nom2;

    private Jeton[][] jetons = new Jeton[HAUTEUR][LARGEUR];

    public GameModel() {
        for (int i = 0; i < jetons.length; i++) {
            for (int j = 0; j < jetons[i].length; j++) {
                jetons[i][j] = Jeton.VIDE;
            }
         }
    }



    public Jeton[][] getJetons() {
        return jetons;
    }

     public void setJetons(Jeton[][] jetons) {
        this.jetons = jetons;
     }

    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }
}
