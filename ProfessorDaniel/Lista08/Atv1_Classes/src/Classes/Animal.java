package Classes;

public class Animal {

    private String especie;
    private String alimentação;
    private String cor;
    private double tamanho;
    private int patas;

    public Animal(String especie, String alimentação, String cor, double tamanho, int patas) {
        this.especie = especie;
        this.alimentação = alimentação;
        this.cor = cor;
        this.tamanho = tamanho;
        this.patas = patas;
    }

    public void morder() {
        System.out.println("nhac");
    }

    public void comer() {
        System.out.println("yummi");
    }

    public void andar() {
        System.out.println("Passos passos passos");
    }

    public void reproduzir() {
        System.out.println("Vamo dar uma privacidade");
    }

    public void saltar() {
        System.out.println("Pulo");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

}
