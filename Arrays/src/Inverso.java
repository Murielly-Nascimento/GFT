package Arrays.src;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Inverso {
    public static void main(String[] args) {

        int vetor[] = {1,2,3,4,5,6};

        System.out.print("Vetor: ");
        for(int i = 5; i>=0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
