package Expressoes.src;

public class Emprestimo {

    public static void financiamento(double valor){
        if(valor <= 1000){
            System.out.println("2x - Total: $" + duasParcelas(valor));
            System.out.println("3x - Total: $" + tresParcelas(valor));
            System.out.println("4x - Total: $" + quatroParcelas(valor));
        }
        else if(valor <= 5000){
            System.out.println("Acréscimo de $200 de taxa");
            System.out.println("2x - Total: $" + (duasParcelas(valor) + 200));
            System.out.println("3x - Total: $" + (tresParcelas(valor) + 200));
            System.out.println("4x - Total: $" + (quatroParcelas(valor) + 200));
        }
        else{
            System.out.println("Acréscimo de $400 de taxa");
            System.out.println("2x - Total: $" + (duasParcelas(valor) + 400));
            System.out.println("3x - Total: $" + (tresParcelas(valor) + 400));
            System.out.println("4x - Total: $" + (quatroParcelas(valor) + 400));
        }

    }

    public static double duasParcelas(double valor){
        return valor * 1.20;
    }

    public static double tresParcelas(double valor){
        return valor * 1.30;
    }

    public static double quatroParcelas(double valor){
        return valor * 1.40;
    }
}
