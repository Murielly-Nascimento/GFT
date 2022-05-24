public class ContaCorrente extends Conta{

    private static final double LIMITE = 1000;

    //Atributos
    private double limite;

    //Construtor
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limite = ContaCorrente.LIMITE;
    }

    //Getters
    public double getLimite() {
        return limite;
    }

    //Métodos
    public void imprimirExtrato(){
        System.out.println("****Extrato da Conta Corrente***");
        super.imprimirDados();
        System.out.println(String.format("Limite: R$ %.2f", this.getLimite()));

    }

    public void aumentoLimite(double valor){
        this.limite += valor;
    }

    public void reduzLimite(double valor){
        this.limite -=limite;
    }


}
