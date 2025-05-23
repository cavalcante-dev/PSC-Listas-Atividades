package ProfessorDaniel.Lista05;

import java.util.Scanner;

public class NumeroTriangularII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        System.out.print("> Digite um número: ");
        valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            triangulacao(i);
            System.out.println("\n");
        }

    }

    public static void triangulacao(int num) {
        int impresso = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(impresso + "");
            impresso++;
        }
    } 
}
