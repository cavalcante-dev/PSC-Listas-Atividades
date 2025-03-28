import java.util.Scanner;

public class Atv9_Desconto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double valor, valorDesconto, desconto;
        
        System.out.println("Digite o valor em Reais (R$), sem descontos: ");
        valor = sc.nextDouble();

        desconto = 15.00 / 100.00;
        valorDesconto = valor - (valor * desconto);

        System.out.printf("Total com Desconto: R$%.2f", valorDesconto);

        sc.close();

    }
    
}
