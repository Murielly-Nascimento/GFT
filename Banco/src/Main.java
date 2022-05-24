public class Main {

    public static void main(String[] args) {


        Endereco endereco = new Endereco("Prata", 12,"38400-712","Apartamento 7");
        Cliente cliente = new Cliente("Mury", "123.456.789-02", endereco);

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.depositar(100);
        poupanca.depositar(200);

        corrente.transferir(poupanca, 100);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
