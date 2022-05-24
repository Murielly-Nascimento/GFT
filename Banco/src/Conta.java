public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    //Construtor
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Métodos
    public void sacar(double valor){
        this.saldo -= valor;

    }

    public void depositar(double valor){
        this.saldo += valor;

    }

    public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);

    }

    public void imprimirDados(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println(this.cliente.getEndereco().toString());
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Número: %d", this.getNumero()));
        System.out.println(String.format("Saldo: R$ %.2f", this.getSaldo()));
    }
}
