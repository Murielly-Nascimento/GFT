import java.util.ArrayList;

public class Carro_Main {
    public static void main(String[] args) {

        /*Carro Jipe = new Carro("Branco", "Renegade", 30);

        Carro Ford = new Carro();
        Ford.setModelo("Fiesta Sedan");
        Ford.setCor("Vermelho");
        Ford.setCapacidadeTanque(20);

        System.out.println("****Carros com preço da gasolina a R$ 6,72***\n");
        System.out.println(Jipe.getModelo() + "\nCor: " + Jipe.getCor() +
                "\nTanque: " + Jipe.getCapacidadeTanque() + " Litros");
        System.out.println("Custo: R$ " + Jipe.abastecimento(6.72));


        System.out.println("\n" + Ford.getModelo() + "\nCor: " + Ford.getCor() +
                "\nTanque: " + Ford.getCapacidadeTanque() + " Litros");
        System.out.println("Custo: R$ " + Ford.abastecimento(6.72));*/

        //Upcast
        Veiculo carro =  new Carro();
        Veiculo moto = new Moto();
        Veiculo caminhao = new Caminhao();

        //Downcast
        Carro carro2 =(Carro) new Veiculo();



    }
}
