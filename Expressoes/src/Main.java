package Expressoes.src;

import static Expressoes.src.Aritmetica.*;
import static Expressoes.src.Cumprimento.*;
import static Expressoes.src.Emprestimo.*;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        int a = 3;
        int b = 4;

        System.out.println("Soma: " + soma(a,b));
        System.out.println("Subtração: " + subtracao(a,b));
        System.out.println("Multiplicação: " + multiplicao(a,b));
        System.out.println("Divisão: " + divisao(a,b));

        //Saudações e cumprimentos
        saudacao(9);
        saudacao(14);
        saudacao(20);

        //Empréstimo
        financiamento(1000);
        financiamento(4000);
        financiamento(7000);

    }
}

