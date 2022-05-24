package ca.vincent.model;

public class Menuisier extends Humain {

    public Menuisier() {}

    public void quiSuisJe() {
        System.out.println("Je suis un " + this.getClass().getSimpleName());
    }
}