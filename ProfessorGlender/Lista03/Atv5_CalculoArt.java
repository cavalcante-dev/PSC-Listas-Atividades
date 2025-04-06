package ProfessorGlender.Lista03;

import java.util.Scanner;

public class Atv5_CalculoArt {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int n;
        double p; 

        System.out.println("=== Digite o número a ser calculado. ===");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            p = Math.pow(i, i);
            System.out.println(i + "^" + i + " = " + p);
        }

        sc.close();

    }    
}