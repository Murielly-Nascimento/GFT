package Arrays.src;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vetor[] = new String[6];
        int j = 0;

        for(int i = 0; i < 6; i++) {
            System.out.print("Digite uma letra: ");
            String letra = sc.next();

            if(!(letra.equalsIgnoreCase("a")
                    |letra.equalsIgnoreCase("e")
                    |letra.equalsIgnoreCase("i")
                    |letra.equalsIgnoreCase("o")
                    |letra.equalsIgnoreCase("u"))){
                vetor[j] = letra;
                j++;
            }
        }
        System.out.print("Consoantes: ");
        for(String consoante : vetor){
            if(consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nConsoantes lidas: " + j);
    }
}
