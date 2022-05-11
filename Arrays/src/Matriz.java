package Arrays.src;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int matriz[][] = new int[4][4];
        int linha = 0, coluna = 0;
        int menor = Integer.MAX_VALUE;

        System.out.println("MATRIZ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(9);

                System.out.print(matriz[i][j] + " ");

                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            System.out.println();
        }

        System.out.println("O menor número é: " + menor);
        System.out.println("E está na linha " + linha + " e coluna " + coluna);


    }
}
