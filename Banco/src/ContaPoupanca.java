public class ContaPoupanca extends Conta{

    private static int SEQUENCIAL = 0;
    private static double TAXA = 0.08;

    //Construtor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    //Métodos
    public void imprimirExtrato(){
        System.out.println("****Extrato da Conta Poupança***");
        super.imprimirDados();
        System.out.println(String.format("Rendimento: R$ %.2f", rendimento()));
    }

    public double rendimento(){
        return this.getSaldo() * TAXA;
    }


}
