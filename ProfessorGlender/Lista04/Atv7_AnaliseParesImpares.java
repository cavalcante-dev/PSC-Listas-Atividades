package ProfessorGlender.Lista04;
import java.util.Scanner;

public class Atv7_AnaliseParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[6], pares = new int[6], impares = new int[6];
        int somaPares = 0, somaImpares = 0;

        System.out.println("\n=== Digite 6 números: ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("> "+ (i+1) + "º Número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n=============================\n");

        System.out.println("==== RELATÓRIO ===\n");

        System.out.println("==== NÚMEROS PARES ====");
        for (int i = 0, j = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("> Número " + numeros[i] + " na posição " + (i+1));
                pares[j] = numeros[i];
                j++;
            }
        }

        for (int i = 0; i < pares.length; i++) {
            //System.out.println("\n> Soma pares = " + somaPares + " + " + pares[i]);
            somaPares += pares[i];
            //System.out.println("> Soma pares: " + somaPares + "\n> " + i + "º Ciclo. \n");
        }

        System.out.println("\n> Soma dos pares: " + somaPares);

        System.out.println("\n------------------------------\n");

        System.out.println("==== NÚMEROS IMPARES ====");
        for (int i = 0, j = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("> Número " + numeros[i] + " na posição " + (i+1));
                impares[j] = numeros[i];
                j++;
            }
        }

        
        for (int i = 0; i < pares.length; i++) {
            //System.out.println("\n> Soma impares = " + somaImpares + " + " + impares[i]);
            somaImpares += impares[i];
            //System.out.println("> Soma impares: " + somaImpares + "\n> " + i + "º Ciclo. \n");
        }

        System.out.println("\n> Soma dos Impares: " + somaImpares);
        
        System.out.println("\n=============================\n");

        sc.close();

    }
}
