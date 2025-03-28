import java.util.Scanner;

public class Atv5_Bonus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double tempoServico, salarioAtual, salarioFinal, bonusCinco, bonusDez;

        bonusCinco = 5.0 / 100.0;
        bonusDez = 10.0 / 100.0;

        System.out.println("\n==== Digite o salário atual do Funcionário (R$): ====");
        salarioAtual = sc.nextDouble();
        System.out.println("==== Digite o tempo de serviço do Funcionário: ====");
        tempoServico = sc.nextDouble();

        if (tempoServico < 0 || salarioAtual < 0) {
            System.out.println("\n=== Dados Inválidos. ===\n");
        } else if (tempoServico < 5) {
            System.out.println("\n === Funcionário não eligivel para bônus de tempo de serviço. ===\n");            
        } else if (tempoServico >= 5) {
            salarioFinal = salarioAtual + (salarioAtual * bonusCinco);
            System.out.printf("=== Parabéns! Pelo seu tempo de serviço seu salário aumento para R$%.2f ===\n", salarioFinal);
        } else if (tempoServico >= 10) {
            salarioFinal = salarioAtual + (salarioAtual * bonusDez);
            System.out.printf("=== Parabéns! Pelo seu tempo de serviço seu salário aumento para R$%.2f ===\n", salarioFinal);
        }
        
        sc.close();

    }
}
