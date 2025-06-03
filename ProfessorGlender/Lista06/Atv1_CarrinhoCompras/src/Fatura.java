import java.util.List;

public class Fatura {

    private List<Item> listaItens;
    private double valorFatura;

    public Fatura() {
        this.valorFatura = 0;
    }

    public void adicionarItem(Item item) {
        this.listaItens.add(item);
    }

    public double calcularFatura() {
        for (Item item : listaItens) {
            valorFatura += item.getValorTotal();
        }
        return valorFatura;
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
