package ProfessorDaniel.Lista04;
import java.util.Scanner;

public class Atv8_Media {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.print("\n> Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("> Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.print("> Digite o terceiro número: ");
        num3 = sc.nextInt();

        System.out.print("> Digite o quarto número: ");
        num4 = sc.nextInt();

        System.out.print("> Digite o quinto número: ");
        num5 = sc.nextInt();

        int soma, media;

        soma = num1 + num2 + num3 + num4 + num5;
        media = soma / 5;

        System.out.println("\n=== A soma dos números digitados é: " + soma + " ===\n" +
                           "\n=== A média dos números digitados é: " + media + " ===\n" );
        
        sc.close();
        
    }
}
