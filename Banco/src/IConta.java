public interface IConta {

    public void sacar(double valor);
    public void transferir(Conta destino, double valor);
    public void depositar(double valor);
    public void imprimirExtrato();
}
