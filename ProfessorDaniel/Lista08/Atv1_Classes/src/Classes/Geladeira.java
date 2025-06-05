package Classes;

import java.util.List;

public class Geladeira {

    private int portas;
    private List<String> itens;
    private List<String> peças;
    private String cor;
    private String marca;

    public Geladeira(int portas, List<String> itens, List<String> peças, String cor, String marca) {
        this.portas = portas;
        this.itens = itens;
        this.peças = peças;
        this.cor = cor;
        this.marca = marca;
    }

    public void refrigerar() {
        System.out.println("vummmmmmmm geladinho");
    }

    public void congelar() {
        System.out.println("Fica frio aí");
    }

    public void acenderLuz() {
        System.out.println("As vezes funciona, as vezes não");
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public List<String> getPeças() {
        return peças;
    }

    public void setPeças(List<String> peças) {
        this.peças = peças;
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
}
