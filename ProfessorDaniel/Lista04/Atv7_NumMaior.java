package ProfessorDaniel.Lista04;

import java.util.Scanner;

public class Atv7_NumMaior {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.print("\n> Digite o primeiro número: ");
        numeros[0] = sc.nextInt();

        System.out.print("> Digite o segundo número: ");
        numeros[1] = sc.nextInt();

        System.out.print("> Digite o terceiro número: ");
        numeros[2] = sc.nextInt();

        System.out.print("> Digite o quarto número: ");
        numeros[3] = sc.nextInt();

        System.out.print("> Digite o quinto número: ");
        numeros[4] = sc.nextInt();

        int maior = 0;

        for (int i : numeros) {
            if (i > maior) {
                maior = i;
            }
        }

        System.out.println("\n=== O maior número digitado é: " + maior + " ===\n" );
        
        sc.close();
        
    }
}
