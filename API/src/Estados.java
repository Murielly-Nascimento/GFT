package API.src;

import java.util.*;
import java.util.function.Function;

/*
    Dada a população estimada de alguns estados do NE brasileiro, faça:
    Estado = PE - População = 9.616.621
    Estado = AL - População = 3.351.543
    Estado = CE - População = 9.187.103
    Estado = RN - População = 3.534.265
    Crie um dicionário e relacione os estados e suas populações;
*/

public class Estados {
    public static void main(String[] args) {

        System.out.println("----Estados no Nordeste-------");
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        //Substitua a população do estado do RN por 3.534.165;
        estados.put("RN", 3534165);

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277
        estados.putIfAbsent("PB", 4039277);

        //Exiba a população PE
        System.out.println("População de PE: " + estados.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi
        //informado;
        System.out.println("----Inserção----");
        Map<String, Integer> insercao = new LinkedHashMap<>(estados);
        System.out.println(insercao);

        //Exiba os estados e suas populações em ordem alfabética;
        System.out.println("----Ordenado----");
        Map<String, Integer> ordenado = new TreeMap<>(estados);
        System.out.println(ordenado);

        //Exiba os estados por ordem crescente de população;
        Set<Map.Entry<String,Integer>> set = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });
        set.addAll(estados.entrySet());
        System.out.println("---Por ordem de população-------");
        for(Map.Entry<String,Integer> entry: set){
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }

        //Usando o método comparing para ordenar
        /*System.out.println("Outra forma de colocar em ordem");
        Set<Map.Entry<String,Integer>> set2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<String, Integer>, Integer>() {

                    @Override
                    public Integer apply(Map.Entry<String, Integer> numero) {
                        return numero.getValue();
                    }
                }
        ));
        set.addAll(estados.entrySet());
        System.out.println("---Por ordem de população-------");
        for(Map.Entry<String,Integer> entry: set){
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }*/

        //Usando lambda
        System.out.println("Outra forma de colocar em ordem usando lambda");
        Set<Map.Entry<String,Integer>> set2 = new TreeSet<>(Comparator.comparing(
                numero -> numero.getValue()));
        set.addAll(estados.entrySet());
        System.out.println("---Por ordem de população-------");
        for(Map.Entry<String,Integer> entry: set){
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }


        //Exiba o estado com o menor população e sua quantidade;
        Collection<Integer> população = estados.values();
        String maior = " ", menor = " ";

        //Exiba o estado com a maior população e sua quantidade;
        //Exiba o estado com o menor população e sua quantidade;
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            if(entry.getValue().equals(Collections.max(população))) maior = entry.getKey();
            if(entry.getValue().equals(Collections.min(população))) menor = entry.getKey();
        }
        System.out.println("Estado com menor população: " + menor + " - " + Collections.min(população));
        System.out.println("Estado com maior população: " + maior + " - " + Collections.max(população));

        //Exiba a soma da população desses estados;
        int sum = 0;
        Iterator<Integer> it = estados.values().iterator();
        while(it.hasNext()) sum += it.next();
        System.out.println("A população dos estados é: " + sum);

        //Exiba a média da população deste dicionário de estados;
        double media = sum / estados.size();
        System.out.println("Média: " + media);

        //Remova os estados com a população menor que 4.000.000;
        int value = 4000000;
        it = estados.values().iterator();
        while(it.hasNext()) {
            if(it.next() <= value) it.remove();
        }

        //Apague o dicionário de estados;
        estados.clear();

        //Confira se o dicionário está vazio.
        System.out.println("Está vazio? " + estados.isEmpty());




    }
}
