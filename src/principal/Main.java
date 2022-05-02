package principal;

import Personagens.Witch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wizard World!");

        Witch hermione = new Witch("Hermione", 20);
        System.out.println(hermione.getNome() + " " + hermione.getVida());
    }
}
