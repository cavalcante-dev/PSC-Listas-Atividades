package ProfessorGlender.Lista04;
import java.util.Scanner;

public class Atv6_CalculoComissao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] produtos = {"Colares", "Pulseiras", "Brincos", "Velas", "Canecas", "Quadros", "Pratos", "Miçangas", "Aneis", "Esculturas"};
        String nomeVendedor;
        double [] precos, unidades, vendaItens;
        double salarioVendedor = 545.00, comissao = 0.0, comissaoPorCento = 0, vendaTotal = 0, salarioFinal = 0;

        precos = new double[10];
        unidades = new double[10];
        vendaItens = new double[10];

        System.out.println("\n=== Digite o nome do vendedor: ===");
        nomeVendedor = sc.next();

        System.out.println("\n=============================================\n");

        for (int i = 0; i < unidades.length; i++) {
            System.out.print("> Insira o preço de " + produtos[i] + ": ");
            precos[i] = sc.nextDouble();
            System.out.print("> Insira a quantidade vendida: ");
            unidades[i] = sc.nextDouble();
            System.out.println("\n--------------------------------------------\n");
        }

        for (int j = 0; j < produtos.length; j++) {
            vendaItens[j] = precos[j] * unidades[j];
            // Teste valor total = System.out.println("> Total da venda de " + produtos[j] + " = " + vendaItens[j]);
        }

        System.out.println("\n=============================================\n");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("== Item " + (i+1) + " - " + produtos[i] + " ==");
            System.out.printf("> Preço: R$%.2f", precos[i]);
            System.out.printf("\n> Quantidade Vendida: %.0f", unidades[i]);
            System.out.printf("\n> Venda total: R$%.2f", vendaItens[i]);
            System.out.println("\n--------------------------------------------\n");
        }

        System.out.println("\n=============================================\n");

        for (int i = 0; i < vendaItens.length; i++) {
            vendaTotal += vendaItens[i];
        }

        comissaoPorCento = 5 / 100.00; 
        comissao = comissaoPorCento * vendaTotal;
        salarioFinal = salarioVendedor + comissao;

        System.out.print("> Valor total: " + vendaTotal + "\n> Salario do vendedor " + nomeVendedor + ": ");
        System.out.printf("R$%.2f \n> Valor da Comissão: R$%.2f \n> Salario final do vendedor: R$%.2f \n", salarioVendedor, comissao, salarioFinal);

        System.out.println("\n=============================================\n");

        int maisVendido = 0;

        for (int i = 0; i < unidades.length; i++) {
            if (unidades[i] > i) {
                maisVendido = i;
            }
        }

        System.out.println("> Item Mais vendido: " + produtos[maisVendido] + "\n> Posição no Estoque: " + (maisVendido + 1));
        System.out.printf("> Preço: R$%.2f \n", precos[maisVendido]);

        System.out.println("\n=============================================\n");

        sc.close();

    }
}
