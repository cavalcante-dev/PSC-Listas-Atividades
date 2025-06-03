import java.util.List;

public class Item extends Produto {

    private int quantidade;
    private double valorTotal;

    public Item(String nome, String codigo, double preco) {
        super(nome, codigo, preco);
    }

    public void realizarCompra(String codigo, int quantidade) {

    }

    public void comprarItens(String codigo, int quantidade) {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
