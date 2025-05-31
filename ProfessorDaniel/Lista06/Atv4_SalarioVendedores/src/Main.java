import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vendedores> vendedores = new ArrayList<>();
        String nome;
        double comissao = 0;
        int quantidadeVendedores = 0;

        System.out.print("""
                \n===== CADASTRO DE VENDEDORES =====
                > Insira a quantidade de Vendedores cadastrados:\s""");
        quantidadeVendedores = sc.nextInt();

        System.out.println("\n---------------------\n");

        for (int i = 1; i <= quantidadeVendedores; i++) {
            System.out.print("> Insira o nome do " + i + "º vendedor: ");
            nome = sc.next();
            Vendedores vendedor = new Vendedores(nome);
            vendedores.add(vendedor);
        }

        System.out.println("\n---------------------\n");

        System.out.println("===== REGISTRO DE VENDAS =====\n");

        for (int i = 0; i < vendedores.size(); i++) {
            System.out.print("> Insira o valor de vendas (Semanal) do vendedor " + vendedores.get(i).getNome() + ": ");
            comissao = sc.nextInt();
            vendedores.get(i).setComissao(comissao);
        }

        Calculos calculos = new Calculos();

        calculos.calcularComissao(vendedores);

        List<Integer> faixaSalario = calculos.checarSalario(vendedores);

        System.out.println("\n---------------------\n");

        System.out.println("===== FAIXA SALARIAL SEMANAL ====\n" +
                "\n> $200 - $299: " + faixaSalario.get(0) +
                "\n> $300 - $399: " + faixaSalario.get(1) +
                "\n> $400 - $499: " + faixaSalario.get(2) +
                "\n> $500 - $599: " + faixaSalario.get(3) +
                "\n> $600 - $699: " + faixaSalario.get(4) +
                "\n> $700 - $799: " + faixaSalario.get(5) +
                "\n> $800 - $899: " + faixaSalario.get(6) +
                "\n> $900 - $999: " + faixaSalario.get(7) +
                "\n> $1000 em diante: " + faixaSalario.get(8) );

        sc.close();

    }
}