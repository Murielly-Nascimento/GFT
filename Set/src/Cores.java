package Set.src;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Cores {
    public static void main(String[] args) {
        System.out.println("Arco Íris");
        Set<String> cores = new HashSet<>();
        cores.add("rosa");
        cores.add("verde");
        cores.add("azul");
        cores.add("amarelo");
        cores.add("laranja");
        cores.add("vermelho");

        System.out.println("Cores do Arco Íris");
        for(String c : cores)
            System.out.println(c);

        System.out.println("A quantidade de cores é igual a: " + cores.size());

        System.out.println("Cores por ordem alfabética");
        Set<String> ordenada = new TreeSet<>(cores);
        System.out.println(ordenada);

        System.out.println("Cores na ordem inversa");
        Set<String> aux = new LinkedHashSet<>(
                Arrays.asList("rosa", "verde", "azul", "amarelo", "laranja", "vermelho"));
        List<String> inversa = new ArrayList<>(aux);
        Collections.reverse(inversa);
        System.out.println(inversa);

        System.out.println("Cores com a letra v");
        for(String c: cores){
            if(c.startsWith("v")) System.out.println(c);
        }

        System.out.println("Remove cores com a letra v");
        Iterator<String> it = cores.iterator();
        while(it.hasNext()){
            if(it.next().startsWith("v")) it.remove();
        }

        System.out.println("Remove cores sem a letra v");
        it = cores.iterator();
        while(it.hasNext()){
            if(!(it.next().startsWith("v"))) it.remove();
        }

        System.out.println(cores);

        System.out.println("Limpar conjunto");
        cores.clear();

        System.out.println("Conjunto está vazio: " + cores.isEmpty());




    }
}
