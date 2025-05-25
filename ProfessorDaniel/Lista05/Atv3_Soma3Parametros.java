package ProfessorDaniel.Lista05;

import java.util.Scanner;

public class Atv3_Soma3Parametros {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("> Digite 3 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println("> A soma dos números é " + somaParametros(num1, num2, num3));  

    }
    
    public static int somaParametros(int num1, int num2, int num3) {
        int soma = num1 + num2 + num3;
        return soma;
    }

}
