package ProfessorDaniel.Lista05;

import java.util.Scanner;

public class Atv2_NumeroTriangularII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        System.out.print("> Digite um número: ");
        valor = sc.nextInt();

        triangulacao(valor);

    }

    public static void triangulacao(int num) {

        for (int i = 1; i <= num; i++) {
            int impresso = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(impresso + "");
                impresso++;
            }
            System.out.println("\n");
        }

    } 
}
