package ProfessorDaniel.Lista04;

import java.util.Scanner;

public class Atv1_NotaInvalida {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        boolean erro = true;

        System.out.println("\n=== Digite um valor de 0 a 10. ===");
        num1 = sc.nextInt();

        if (num1 < 0 || num1 > 10) {
            while (erro == true) {         
                System.out.println("\n= VALOR INVÁLIDO - TENTE NOVAMENTE = \n=== Digite um valor de 0 a 10. ===");
                num1 = sc.nextInt();
                if (num1 >= 0 && num1 <= 10) {
                    erro = false;
                }
            }
        }

        System.out.println("\n=== Parabéns! ===\n");
        
        sc.close();

    }
}
