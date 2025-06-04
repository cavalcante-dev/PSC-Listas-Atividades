import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private List<Item> listaItens;
    private double valorFatura;

    public Fatura(List<Item> listaItens) {
        this.listaItens = listaItens;
        this.valorFatura = 0;
    }

    public void calcularFatura() {
        for (Item item : listaItens) {
            valorFatura += item.getValorTotal();
        }
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public double getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(double valorFatura) {
        this.valorFatura = valorFatura;
    }
}
