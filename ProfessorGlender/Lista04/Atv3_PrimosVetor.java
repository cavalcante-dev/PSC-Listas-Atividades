package ProfessorGlender.Lista04;

import java.util.Scanner;

public class Atv3_PrimosVetor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] vetorA = new int[9]; 

        System.out.println("\n> Digite 9 números: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("\n-------------------------------------------\n");

        boolean testePrimo = true;

        for (int i = 0; i < vetorA.length; i++) {
        
            //System.out.println("\nTeste - " + vetorA[i]);
            
            for (int j = 1; j <= 1; j++) {
                
                if (vetorA[i] <= 2) {
                    System.out.println("> " + vetorA[i] + " presente na " + (i+1) + "ª posição é primo.");
                    // Linha de teste de ciclo - System.out.println(vetorA[i] + " É primo (Menor ou Igual a 2) - Ciclo " + j);
                    break;
                } else if (vetorA[i] %2 == 0) {
                    System.out.println("> " + vetorA[i] + " presente na " + (i+1) + "ª posição não é primo.");
                    // Linha de teste de ciclo - System.out.println(vetorA[i] + " Não é primo (Par) - Ciclo " + j);
                    break;
                } else {
                    for(int k = 3; k < vetorA[i]; k+=2) {
                        if(vetorA[i]%k == 0) {
                            System.out.println("> " + vetorA[i] + " presente na " + (i+1) + "ª posição não é primo.");;
                            // Linha de teste de ciclo - System.out.println(vetorA[i] + " Não é primo. (Por Divisão) - Ciclo " + k);
                            testePrimo = false;
                            break;
                        } /* (else de teste de ciclo) else {
                            System.out.println("Teste - Não primo ciclo " + k);
                        } */
                    }     
                } 
                if (testePrimo == true) {
                    // Linha de teste de ciclo - System.out.println(vetorA[i] + " É primo (Final) - Ciclo " + j); 
                    System.out.println("> " + vetorA[i] + " presente na " + (i+1) + "ª posição é primo.");
                }
                
                testePrimo = true;

            }
        }

        System.out.println("\n-------------------------------------------\n");

        sc.close();

    }
} 