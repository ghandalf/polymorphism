package ca.vincent.model;

public class Humain {

    private int nbTete = 1;
    private int nbBras = 2;
    private int nvJambe = 2;

    // Construct par defaut
    public Humain() {}

    public void quiSuisJe() {
        System.out.println("Je suis un " + this.getClass().getSimpleName());
    }
}