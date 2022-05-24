package ca.vincent;

import ca.vincent.model.Humain;
import ca.vincent.model.Menuisier;
import ca.vincent.model.Plombier;

public class Main {

    public static void main(String[] args) {
        Humain humain = new Humain();
        Menuisier menuisier = new Menuisier();
        Plombier plombier = new Plombier();

        humain.quiSuisJe();
        menuisier.quiSuisJe();
        plombier.quiSuisJe();
    }
}