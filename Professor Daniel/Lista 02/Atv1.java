import java.util.Scanner;

public class Atv1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.println("Digite um número: ");
        num1 = sc.nextInt();

        System.out.println("Seu número é: " + num1);

        sc.close();
    }

}