package List.src;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<Double>();
        double media = 0;

        for(int i = 0; i < 6; i++){
            System.out.print("Digite a temperatura: ");
            double temp = sc.nextDouble();
            temperatura.add(temp);
            media += temp;
        }

        media /=6;
        System.out.printf("Media semestral das temperaturas: %.1f\n", media);

        for(int i = 0; i< 6; i++){
            if(temperatura.get(i) > media){
                int mes = i+1;
                meses(mes, temperatura.get(i));
            }
        }
    }

    public static void meses(int mes, double temperatura){

        switch (mes){
            case 1:
                System.out.println("1 - Janeiro - " + temperatura + " ºC");
                break;
            case 2:
                System.out.println("2 - Fevereiro - " + temperatura + " ºC");
                break;
            case 3:
                System.out.println("3 - Março - " + temperatura + " ºC");
                break;
            case 4:
                System.out.println("4 - Abril - " + temperatura + " ºC");
                break;
            case 5:
                System.out.println("5 - Maio - " + temperatura + " ºC");
                break;
            case 6:
                System.out.println("6 - Junho - " + temperatura + " ºC");
                break;
            default:
                break;
        }

    }



}
