public class Endereco {

    //Atributos
    private String Rua;
    private int numero;
    private String CEP;
    private String Complemento;

    //Construtor
    public Endereco(String rua, int numero, String CEP, String complemento){
        setRua(rua);
        setCEP(CEP);
        setComplemento(complemento);
        setNumero(numero);
    }

    //Getters and Setters
    public String getRua() {
        return Rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCEP() {
        return CEP;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    //Método
    public String toString(){
        return "--Endereço: "
                + "Rua " + this.getRua()
                +  ", " + this.getNumero()
                + ", " + this.getComplemento()
                + "--CEP - " + this.getCEP();
    }

}
