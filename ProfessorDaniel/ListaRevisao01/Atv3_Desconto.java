package ProfessorDaniel.ListaRevisao01;

import java.util.Scanner;

public class Atv3_Desconto {
    public static void main(String[] args) {

        double desconto, descontoPorCento, valorProduto, valorFinal;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== DESCONTASSO ===");
        System.out.print("> Digite o valor do produto: ");
        valorProduto = sc.nextDouble();
        System.out.print("> Digite o valor do desconto: ");
        desconto = sc.nextDouble();

        descontoPorCento = desconto / 100.0;
        valorFinal = valorProduto - (descontoPorCento * valorProduto);

        System.out.println("--------------------------");
        System.out.printf("=== Valor final do produto R$%.2f ===\n", valorFinal);

        sc.close();

    }    
}
