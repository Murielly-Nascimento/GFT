public class Veiculo {

    //Atributos
    private String modelo;
    private String cor;
    private int capacidadeTanque;

    //Construtor
    public Veiculo(){

    }

    public Veiculo(String modelo, String cor, int capacidade) {
        setCapacidadeTanque(capacidade);
        setCor(cor);
        setModelo(modelo);
    }

    //Getters and Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCapacidadeTanque(int capacidade) {
        this.capacidadeTanque = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //Métodos
    public double abastecimento(double preçoGasolina){
        return getCapacidadeTanque() * preçoGasolina;
    }
}
