package Arrays.src;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int vetor[] =  new int[20];

        for(int i = 0; i < 20; i++){
            int aux = random.nextInt(100);
            vetor[i] = aux;
        }

        System.out.println("Vetor: ");
        for(int numero : vetor){
            System.out.print("Número: " + numero + " - Sucessor: ");
            System.out.println(numero+1);
        }

    }
}
