package ProfessorDaniel.ListaRevisao01;

import java.util.Scanner;

public class Atv8_ImpostoRenda {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double aliquota, renda, parcelaReduzir, imposto;

        System.out.print("\n> Insira sua Renda Tributável para o cálculo do imposto de renda: ");
        renda = sc.nextDouble();

        if (renda <= 2428.80) {
            System.out.println("=== RENDA NÃO DECLARAVEL ===\n");
        } else if (renda <= 2826.65) {
            aliquota = 7.5 / 100.0;
            parcelaReduzir = 142.80;
            imposto = (renda * aliquota) - parcelaReduzir;
            System.out.printf("=== VALOR DO IMPOSTO: R$%.2f ===\n", imposto);
        } else if (renda <= 3751.05) {
            aliquota = 15.0 / 100.0;
            parcelaReduzir = 354.80;
            imposto = (renda * aliquota) - parcelaReduzir;
            System.out.printf("=== VALOR DO IMPOSTO: R$%.2f ===\n", imposto);
        } else if (renda <= 4664.68) {
            aliquota = 22.5 / 100.0;
            parcelaReduzir = 636.13;
            imposto = (renda * aliquota) - parcelaReduzir;
            System.out.printf("=== VALOR DO IMPOSTO: R$%.2f ===\n", imposto);
        } else if (renda > 4664.68) {
            aliquota = 27.5 / 100.0;
            parcelaReduzir = 869.36;
            imposto = (renda * aliquota) - parcelaReduzir;
            System.out.printf("=== VALOR DO IMPOSTO: R$%.2f ===\n", imposto);
        }

        sc.close();

    }
}
