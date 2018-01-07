package com.igs.ipi.tpspringbootCharlet.model;

public class GameModel {

    private static final int LARGEUR = 7;
    private static final int HAUTEUR = 6;

    private int numGagnant = 0;
    private boolean tour;
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


    // je n'est pas réussi à faire la fonction en totalité je me suis plus qu'inspirer de votre correction
    public void add(Integer index) {
        if (numGagnant != 0) {
            throw new IllegalStateException("La partie est déjà terminée");
        }
        // h=0 est la ligne du haut, on va itérer sur la hateur en sens inverse pour cherche une place libre en bas
        for (int h = jetons.length - 1; h >= 0; h--) {
            if (jetons[h][index] == Jeton.VIDE) {
                Jeton jeton = tour ? Jeton.ROUGE : Jeton.JAUNE;
                jetons[h][index] = jeton;
                tour = !tour;
                return;
            }
        }
        throw new IllegalArgumentException("Aucune place disponible pour un jeton en index " + index);
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
