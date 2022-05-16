package Map.src;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    public static void main(String[] args) {
        System.out.println("--------- Agenda -------");
        Map<Integer, Contato> agenda = new HashMap<>(){{
           put(1, new Contato("Elena", 123456));
           put(4, new Contato("Alice", 567890));
           put(3, new Contato("Laura", 123789));
        }};
        for(Map.Entry<Integer, Contato> entry: agenda.entrySet())
            System.out.println(entry.getKey() + "----" + entry.getValue().getNome());


    }


}
