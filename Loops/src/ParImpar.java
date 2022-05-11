package Loops.src;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int N = sc.nextInt();

        int aux = 0, impar = 0, par = 0;

        for(int i = 0; i < N; i++){
            System.out.print("Digite um número: ");
            aux = sc.nextInt();
            if(aux%2 == 0) par++;
            else impar++;
        }
        System.out.println("O número de pares é: " + par);
        System.out.println("O número de impares é: " + impar);

    }
}
