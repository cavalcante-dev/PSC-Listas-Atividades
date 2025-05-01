package ProfessorDaniel.ListaRevisao01;

import java.util.Scanner;

public class Atv6_MaiorNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int maior = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("> Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i:numeros) {
            if (i > maior) {
                maior = i;
            }
        }

        System.out.println("\n=== MAIOR NÚMERO: " + maior + " ===\n");

        sc.close();

    }
}
