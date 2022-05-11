package Loops.src;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int N = sc.nextInt();
        int fat = 1;
        for(int i = N; i>=1; i--)
            fat*=i;
        System.out.println("O fatorial de " + N + " é " + fat);

    }
}
