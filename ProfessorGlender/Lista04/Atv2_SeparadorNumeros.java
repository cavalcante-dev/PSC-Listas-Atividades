package ProfessorGlender.Lista04;

import java.util.Scanner;

public class Atv2_SeparadorNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] vetorA, vetorPositivo, vetorNegativo;
        vetorA = new int[8];
        vetorPositivo = new int[8];
        vetorNegativo = new int[8];

        System.out.println("\n> Digite 8 números: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt(); 
        }

        System.out.println("\n----------------------------------\n");

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                vetorPositivo[i] = vetorA[i];
            } else if (vetorA[i] < 0) {
                vetorNegativo[i] = vetorA[i];
            }
        }

        System.out.println("=== Vetor Inserido: ===");
        for (int i = 0; i < vetorA.length; i++) {
             System.out.print(vetorA[i] + " ");
        }


        System.out.println("\n\n=== Vetor Positivo: ===");
        for (int i = 0; i < vetorPositivo.length; i++) {
            if (vetorPositivo[i] != 0) {
                System.out.print(vetorPositivo[i] + " ");   
            } 
        }

        
        System.out.println("\n\n=== Vetor Negativo: ===");
        for (int i = 0; i < vetorNegativo.length; i++) {
            if (vetorNegativo[i] != 0) {
                System.out.print(vetorNegativo[i] + " ");   
            }
        }

        System.out.println("\n\n----------------------------------\n");

        sc.close();

    }
}