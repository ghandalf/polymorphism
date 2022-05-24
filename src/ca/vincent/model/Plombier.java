package ca.vincent.model;

public class Plombier extends Humain {

    public Plombier() {}

    public void quiSuisJe() {
        System.out.println("Je suis un " + this.getClass().getSimpleName());
    }
}