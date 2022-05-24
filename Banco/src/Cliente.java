public class Cliente {

    private String nome;
    private String CPF;
    private Endereco endereco;

    public Cliente(String nome, String CPF, Endereco endereco){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
