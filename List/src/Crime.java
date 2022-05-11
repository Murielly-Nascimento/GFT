package List.src;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        String resposta = new String();
        List<String> respostas =  new ArrayList<String>();

        System.out.print("1. Telefonou para a vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("2. Esteve no local do crime? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("3. Mora perto da vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("4. Devia para a vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("5. Já trabalhou com a vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        int cont = 0;

        for(String aux :respostas){
            if(aux.contains("s")) cont++;
        }

        switch (cont){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }


    }
}
