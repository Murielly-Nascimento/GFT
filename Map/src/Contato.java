package Map.src;

public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero){
        setNome(nome);
        setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
