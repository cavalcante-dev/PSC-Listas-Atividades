package ProfessorGlender.Lista03;

import java.util.Scanner;

public class Atv7_DoseModao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dose, simNao = 0, adicionalDose = 0;
        double conta, dezPorCento = 10.0 / 100.0, totalConta, finalConta;

        System.out.println("\n=== Digite o valor da conta: ===");
        conta = sc.nextDouble();

        System.out.println("=== Digite o valor da dose: ===");
        dose = sc.nextInt();

        while (simNao != 2) {
                
            System.out.println("""
                \n=== Tocar mais um modão? ===
                > 1. Sim
                > 2. Não""");
            simNao = sc.nextInt();

            if (simNao == 1) {
                adicionalDose++;
            }

        }

        totalConta = (conta + (adicionalDose * dose));
        finalConta = totalConta + (totalConta * dezPorCento);

        System.out.printf("\n=== Fala chefe, a conta deu R$%.2f. Vai ser débito ou crédito? ===", finalConta);
        System.out.println("\n");

        sc.close();
     }
}

