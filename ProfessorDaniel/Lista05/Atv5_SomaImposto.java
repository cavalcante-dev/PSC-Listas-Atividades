package ProfessorDaniel.Lista05;

import java.util.Scanner;

public class Atv5_SomaImposto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double custo, taxaImposto, valorFinal;

        System.out.println("\n----------------------------\n");
        
        System.out.print("> Digite o custo do produto: ");
        custo = sc.nextDouble();
        System.out.print("> Digite o valor da taxa de imposto: ");
        taxaImposto = sc.nextDouble();

        valorFinal = somaImposto(taxaImposto, custo);

        System.out.println("\n----------------------------\n");

        System.out.printf("--- Valor final do produto R$%.2f ---\n", valorFinal);

    }    

    public static double somaImposto(double taxaImposto, double custo) {
        
        double taxaPorCento = taxaImposto / 100.00;
        double valorFinal = custo + (custo * taxaPorCento);
        
        return valorFinal;

    } 

}
