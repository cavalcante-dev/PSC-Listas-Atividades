import java.util.Scanner;

public class Atv6_Troco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double total, troco, valorMaria, produto1, produto2, produto3;

        System.out.println("Digite o valor dos três produtos em (R$): ");
        produto1 = sc.nextDouble();
        produto2 = sc.nextDouble();
        produto3 = sc.nextDouble();

        System.out.println("Digite o valor pago em (R$): ");
        valorMaria = sc.nextDouble();

        total = produto1 + produto2 + produto3;
        troco = valorMaria - total; 

        System.out.printf("Total da Compra: R$%.2f \nTroco: R$%.2f", total, troco);

        sc.close();

    }

}