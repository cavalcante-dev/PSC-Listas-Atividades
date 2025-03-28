import java.util.Scanner;

public class Atv7_Euro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double real, euro, conversao;

        System.out.println("Digite o valor em Reais (BRL): ");
        real = sc.nextDouble();

        System.out.println("Digite a taxa de conversão em Euro (EUR): ");
        conversao = sc.nextDouble();

        euro = real * conversao; 

        System.out.printf("Valor em Reais (BRL): R$%.2f \nValor em Euro (EUR): %.2f", real, euro);

        sc.close();
        
    }

}