import java.util.ArrayList;
import java.util.List;

public class Item {

    private int quantidade;
    private double valorTotal;
    private int codigo;

    public Item(int codigo) {
        this.codigo = codigo;
        this.valorTotal = 0;
    }

    public void realizarCompra(int codigo, int quantidade) {
        for (Produto produto : Main.listaProdutos) {
            if (produto.getCodigo() == codigo) {
                this.quantidade += quantidade;
                this.valorTotal = this.quantidade * produto.getPreco();
            }
        }
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
