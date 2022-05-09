package Condicoes.src;

public class Semana {
    public static void main(String[] args) {
        System.out.println("Calendário semanal");
        String dia = "Segunda-feira";
        switch(dia){
            case "Segunda-feira":
                System.out.println(1);
                break;
            case "Terça-feira":
                System.out.println(2);
                break;
            case "Quarta-feira":
                System.out.println(3);
                break;
            case "Quinta-feira":
                System.out.println(4);
                break;
            case "Sexta-feira":
                System.out.println(5);
                break;
            case "Sábado-feira":
                System.out.println(6);
                break;
            case "Domingo-feira":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia inválido");
                break;

        }
    }
}
