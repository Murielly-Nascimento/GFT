package Loops.src;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        while(true){
            System.out.print("Digite um nome: ");
            nome = sc.next();

            if(nome.equals("0")) break;

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            System.out.println(nome + " - " + idade + " anos");





        }
    }
}
