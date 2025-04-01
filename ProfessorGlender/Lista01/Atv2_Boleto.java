import java.util.Scanner;

public class Atv2_Boleto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double boleto1, boleto2, boleto3, boleto4, percentual14, salarioBruto;
        double totalBoletos, salarioLiquido, salarioFinal;

        System.out.println("Digite seus boletos (R$): ");
        boleto1 = sc.nextDouble();
        boleto2 = sc.nextDouble();
        boleto3 = sc.nextDouble();
        boleto4 = sc.nextDouble();

        System.out.println("Digite seu salário bruto (R$): ");
        salarioBruto = sc.nextDouble();

        percentual14 = 14.0 / 100.0;
        salarioLiquido = salarioBruto - (percentual14 * salarioBruto);
        totalBoletos = boleto1 + boleto2 + boleto3 + boleto4;
        salarioFinal = salarioLiquido - totalBoletos;

        System.out.printf("Seu total de boletos é: R$%.2f", totalBoletos);
        System.out.printf("\nSeu salário liquido é: R$%.2f", salarioLiquido);
        System.out.printf("\nSeu salário final é: R$%.2f", salarioFinal);

        sc.close();

    }

}