package API.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("1","5","3","4","9","7","2");

        //Simplificação de métodos usando reference method
        System.out.println("Imprimindo lista de números");
        lista.forEach(System.out::println);

        //Interface Collector
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        lista.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Método map + parseInt
        System.out.println("Transformar lista de Strings em Números");
        List<Integer> inteiros =  lista.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2");
        inteiros.stream()
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Média dos números");
        lista.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares");
        inteiros.removeIf(integer -> (integer % 2 !=0));
        System.out.println(inteiros);
    }
}
