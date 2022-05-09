package Condicoes.src;

public class Verificacao {
    public static void main(String[] args) {
        System.out.println("Verificação");
        int i = 3;
        if(i >=1 && i <=3) System.out.println("Certo");
        else if(i == 4) System.out.println("Errado");
        else if(i==5) System.out.println("Talvez");
        else System.out.println("Valor indefinido");
    }
}
