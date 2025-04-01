package ProfessorGlender.Lista03;
import java.util.Scanner;

public class Atv2_prog03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;

        System.out.println("\n=== Digite o valor a ser calculado o valor fatorial: ===");
        num1 = sc.nextInt();

        System.out.print("\n=== " + num1 + "! = ");

        int fator = num1;

        while (num1 > 1) {
            System.out.print(num1 + " * ");
            fator = fator * (num1 - 1);
            num1--;
        }

        System.out.println("1 = " + fator + " ===\n");
        
        sc.close();
    }
}