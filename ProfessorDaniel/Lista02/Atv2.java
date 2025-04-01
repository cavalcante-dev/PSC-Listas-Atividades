import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {
        
        int num1, num2, soma, subtr, multip;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;
        subtr = num1 - num2;
        multip = num1 * num2; 

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtr);
        System.out.println("Multiplicação: " + multip);

        sc.close();

    }

}