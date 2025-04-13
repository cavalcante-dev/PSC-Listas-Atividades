package ProfessorGlender.Lista04;

import java.util.Scanner;

public class Atv1_2Vetores {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] vetorA, vetorB, vetorC;
        int tamanhoVetor; 

        System.out.print("\n> Insira um tamanho para os vetores: ");
        tamanhoVetor = sc.nextInt();

        vetorA = new int[tamanhoVetor];
        vetorB = new int[tamanhoVetor];
        vetorC = new int[tamanhoVetor += tamanhoVetor];
    
        System.out.println("\n-------------------------------------------------\n");
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("> Digite o " + (i + 1) + "º número para o Vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        
        System.out.println("\n-------------------------------------------------\n");
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("> Digite o " + (i + 1) + "º número para o Vetor B: ");
            vetorB[i] = sc.nextInt();
        }
    
        System.out.println("\n-------------------------------------------------\n");

        int impar = 0, par = 0;

        for (int i = 0; i < vetorC.length; i++) {
            if (i %2 == 0) {
                vetorC[i] = vetorA[par];
                par++;
            } else if (i %2 != 0) {
                vetorC[i] = vetorB[impar];
                impar++;
            }
        }

        System.out.print("> Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        System.out.println("\n\n-------------------------------------------------\n");

        sc.close();

    }
}
