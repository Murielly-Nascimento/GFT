package Loops.src;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 0, aux = 0, maior = 0;

        for(int i = 0; i<5; i++){
            System.out.print("Digite o "+ (i+1) + " número: ");
            aux = sc.nextDouble();

            if(aux > maior) maior = aux;

            media +=aux;
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (media/5));

    }
}
