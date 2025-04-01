import java.util.Scanner;

public class Atv2_ParImpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma, diferenca; 

        System.out.println("\n=== Digite 2 números: ===");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;
        diferenca = num1 - num2;

        System.out.println("\n= Resultados: =\n" 
            + " > " + num1 + " + " + num2 + " = " + soma + "\n"
            + " > " + num1 + " - " + num2 + " = " + diferenca
        );

        if (soma % 2 == 0) {
            System.out.println("\n== O resultado da soma é um número par. ==");
        } else {
            System.out.println("\n== O resultado da soma é um número ímpar. ==");
        }

        if (diferenca > 0) {
            System.out.println("== O resultado da diferença é um número positivo. == \n");
        } else if (diferenca < 0) {
            System.out.println("== O resultado da diferença é um número negativo. == \n");
        } else if (diferenca == 0) {
            System.out.println("== O resultado da diferença é igual a zero. == \n");
        }

        sc.close();

    }
}