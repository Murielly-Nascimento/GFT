package Expressoes.src;

public class Cumprimento {

    public static void saudacao(int hora){
        if(hora <= 12)
            System.out.println("Bom dia!");
        else if(hora <= 16)
            System.out.println("Boa tarde!");
        else
            System.out.println("Boa noite!");
    }
}
