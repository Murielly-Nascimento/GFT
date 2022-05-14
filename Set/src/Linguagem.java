package Set.src;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linguagem {
    public static void main(String[] args) {
        Set<Language> linguagens = new HashSet<>();
        linguagens.add(new Language("Python", 1978, "IntelliJ"));
        linguagens.add(new Language("C", 1950, "CodeBlocks"));
        linguagens.add(new Language("Prolog", 1980, "SWISH"));

        System.out.println("---------Ordem de inserção----------");
        for(Language lingua : linguagens)
            System.out.println(lingua);

        System.out.println("----------Ordem de Alfabética--------");
        Set<Language> nome = new TreeSet<>(linguagens);
        for(Language lingua : nome)
            System.out.println(lingua);

        System.out.println("-----------IDE---------");
        Set<Language> IDE = new TreeSet<Language>(new ComparadorIDE());
        IDE.addAll(linguagens);
        for(Language lingua : IDE)
            System.out.println(lingua);

        System.out.println("--------Ano e nome-------");
        Set<Language> ano = new TreeSet<Language>(new ComparadorAno());
        ano.addAll(linguagens);
        for(Language lingua : ano)
            System.out.println(lingua);

        System.out.println("-------Todos os atributos--------");
        Set<Language> atributos = new TreeSet<Language>(new ComparadorAtributos());
        atributos.addAll(linguagens);
        for(Language lingua : atributos)
            System.out.println(lingua);
    }
}

//Classe Language
class Language implements Comparable<Language>{

    //Atributos
    public String nome;
    public Integer ano;
    public String IDE;

    //Construtor
    public Language(String nome, Integer ano, String IDE){
        this.nome = nome;
        this.ano = ano;
        this.IDE = IDE;
    }

    //Métodos
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Ano de Criação: "+ this.ano + "\n" +
                "IDE: " + this.IDE + "\n";
    }

    //Comparador padrão
    @Override
    public int compareTo(Language o) {
        return this.nome.compareTo(o.nome);
    }

}

class ComparadorIDE implements Comparator<Language> {

    @Override
    public int compare(Language A, Language B) {
        return A.IDE.compareToIgnoreCase(B.IDE);
    }
}

class ComparadorAno implements Comparator<Language> {

    @Override
    public int compare(Language A, Language B) {
        int ano = Integer.compare(A.ano, B.ano);
        if (ano != 0) return ano;
        return A.nome.compareToIgnoreCase(B.nome);
    }
}

class ComparadorAtributos implements Comparator<Language> {

    @Override
    public int compare(Language A, Language B) {
        int nome = A.nome.compareToIgnoreCase(B.nome);
        int ano = Integer.compare(A.ano, B.ano);
        if (nome != 0) return nome;
        if (ano != 0) return ano;
        return A.IDE.compareToIgnoreCase(B.IDE);
    }
}

