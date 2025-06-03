import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Teste");

        /*
        1 - Comprar / 2 - Ver Fatura / 3 - Encerrar programa
        1 - Produtos cadastrados --> Código do produto + quantidade
        2 - Exibir itens comprados e valor final
        3 - Encerra o programa
        * */

        Scanner sc = new Scanner(System.in);

        String codigo;
        int quantidade = 0;

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Banana", "1222", 1.45));
        listaProdutos.add(new Produto("Maça", "1323", 2.95));
        listaProdutos.add(new Produto("Abacaxi", "1424", 15.75));
        listaProdutos.add(new Produto("Melancia", "1525", 13.97));

        System.out.println("> Escolha um item: Banana - 1222, 2 Maça - 1323, 3 Abacaxi - 1424, 4 Melancia - 1525: ");
        codigo = sc.next();

        System.out.println("> Escolha uma quantidade: ");
        quantidade = sc.nextInt();





    }
}