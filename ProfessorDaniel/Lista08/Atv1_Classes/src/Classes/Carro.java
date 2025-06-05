package Classes;

public class Carro {

    private String modelo;
    private String cor;
    private String marca;
    private int rodas;
    private int portas;

    public Carro(String modelo, String cor, String marca, int rodas, int portas) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.rodas = rodas;
        this.portas = portas;
    }

    public void acelerar(){
        System.out.println("Vruuuuuum");
    }

    public void frear(){
        System.out.println("Eeeeeeerrrrrrrrrr");
    }

    public void acionarEmbreagem(){
        System.out.println("Troca a marcha ai");
    }

    public void virarVolante(){
        System.out.println("Esquerda esquerda esquerda direita");
    }

    public void trocarMarcha(){
        System.out.println("R é de rapidão");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
