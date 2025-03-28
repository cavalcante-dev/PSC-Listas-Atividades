import java.util.Scanner;

public class Atv8_Financiamentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, setentaPorCento, salarioReferencia, prestacao;

        System.out.println("\n=== Digite seu sálario em R$: ===");
        salario = sc.nextDouble();

        System.out.println("=== Digite o valor da prestação em R$: ===");
        prestacao = sc.nextDouble();

        setentaPorCento = 70 / 100;
        salarioReferencia = salario - (salario * setentaPorCento);

        if (salarioReferencia < prestacao) {
            System.out.printf("\n===== SOLICITAÇÃO NEGADA ==== \n=== A prestação de R$%.2f ultrapassa o limite de financiamento. ===\n", prestacao);
        } else if (salarioReferencia >= prestacao) {
            System.out.printf("\n===== SOLICITAÇÃO APROVADA ==== \n=== A prestação de R$%.2f está no limite de financiamento. ===\n", prestacao);
        }

        sc.close();

    }
}