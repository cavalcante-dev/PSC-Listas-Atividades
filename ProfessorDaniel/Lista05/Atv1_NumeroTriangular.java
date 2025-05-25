package ProfessorDaniel.Lista05;

import java.util.Scanner;

public class Atv1_NumeroTriangular {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        System.out.print("> Digite um número: ");
        valor = sc.nextInt();

        triangulacao(valor);

    }

    public static void triangulacao(int num) {

       for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println("\n");
        }

    } 

}
