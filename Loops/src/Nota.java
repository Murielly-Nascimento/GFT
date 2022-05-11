package Loops.src;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Digite uma nota entre 0 e 10: ");
            int nota = sc.nextInt();

            if(nota>=0 && nota<=10){
                System.out.print("A sua nota foi de: " + nota);
                break;
            }
            else
                System.out.println("Valor inválido!");
        }

    }
}
