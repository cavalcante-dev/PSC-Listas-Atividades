package ProfessorDaniel.ListaRevisao01;

import java.util.Scanner;

public class Atv1_ParImpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("\n> Digite um número: ");
        num = sc.nextInt();

        System.out.println("-----------------------");

        if (num %2 == 0) {
            System.out.println("===== " + num + " é par. =====\n");
        } else if (num %2 != 0) {
            System.out.println("===== " + num + " é impar. =====\n");
        }

        sc.close();

    }
}
