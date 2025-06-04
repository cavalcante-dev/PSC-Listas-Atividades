import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Teste");

        /*
        1 - Comprar / 2 - Ver Fatura / 3 - Encerrar programa
        1 - Produtos cadastrados --> Código do produto + quantidade
        2 - Exibir itens comprados e valor final
        3 - Encerra o programa
        * */

        Scanner sc = new Scanner(System.in);

        int menu = 0;
        int codigo = 0;
        int quantidade = 0;

        listaProdutos.add(new Produto("Banana", 12, 1.45));
        listaProdutos.add(new Produto("Maçã", 13, 2.00));
        listaProdutos.add(new Produto("Abacaxi", 14, 15.75));
        listaProdutos.add(new Produto("Melancia", 15, 13.90));

        List<Item> itens = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            itens.add(new Item(produto.getCodigo()));
        }

        Fatura fatura = new Fatura(itens);

        do {

            System.out.print("""
                               \n=== BEM VINDO ===
                               
                               > 1. Comprar Item
                               > 2. Ver Fatura
                               > 3. Encerrar e pagar
                               
                               Insira a opção que deseja realizar:\s""");
            menu = sc.nextInt();

            System.out.println("\n-------------------------------\n");

            // COMPRAR ITEM
            if (menu == 1) {

                System.out.println(" --- Adicione um item digitando seu código de identificação --- ");
                for (Produto produto : listaProdutos) {
                    System.out.println("> " + produto.getNome() + " (" + produto.getCodigo() + ") - R$" + produto.getPreco());
                }
                System.out.print("\n> Insira o código do produto: ");
                codigo = sc.nextInt();
                System.out.print("> Insira a quantidade: ");
                quantidade = sc.nextInt();

                for (Item item : itens) {
                    if (item.getCodigo() == codigo) {
                        item.realizarCompra(codigo, quantidade);
                    }
                }

            // VER FATURA
            } else if (menu == 2) {

                fatura.calcularFatura();

                System.out.println("FATURA");
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (itens.get(i).getValorTotal() != 0) {
                        System.out.println(
                                "----------------\n" +
                                "> Produto: " + listaProdutos.get(i).getNome() +
                                "\n> Total Comprado: " + itens.get(i).getQuantidade() +
                                "\n> Valor Total: " + itens.get(i).getValorTotal());
                    }
                }

                System.out.println("\n------------------\n");

                System.out.println("Total da Fatura: " + fatura.getValorFatura());

            }

        //FINALIZAR PROGRAMA
        } while (menu != 3);

        System.out.println("=== Muito obrigado por comprar conosco! ===");

    }
}