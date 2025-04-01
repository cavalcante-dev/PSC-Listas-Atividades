import java.util.Scanner;

public class Atv4_Salario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double salarioBruto, salarioLiquido, valeRefeicao, descontoFolha, boleto1, boleto2, boleto3, boleto4, boletosFinal, salarioFinal; 

        System.out.println("\n==== Olá, João! ==== \n== Digite seu sálario do mês: ==");
        salarioBruto = sc.nextDouble();

        System.out.println("\n==== Digite seus boletos ==== \n== Boleto 1: ==");
        boleto1 = sc.nextDouble();
        System.out.println("\n==== Digite seus boletos ==== \n== Boleto 2: ==");
        boleto2 = sc.nextDouble();
        System.out.println("\n==== Digite seus boletos ==== \n== Boleto 3: ==");
        boleto3 = sc.nextDouble();
        System.out.println("\n==== Digite seus boletos ==== \n== Boleto 4: ==");
        boleto4 = sc.nextDouble();

        valeRefeicao = 12.5 / 100.0;
        descontoFolha = 6.0 / 100.0;

        salarioLiquido = salarioBruto - ((valeRefeicao + descontoFolha) * salarioBruto);
        boletosFinal = boleto1 + boleto2 + boleto3 + boleto4;
        salarioFinal = salarioLiquido - boletosFinal;

        if (salarioFinal > 0) {
            System.out.printf("\n== SALDO POSITIVO == \n== Conseguimos mais um mês, campeão!, pode guardar R$%.2f na poupança ==\n", salarioFinal);
        } else if (salarioFinal == 0) {
            System.out.println("\n== SALDO ZERADO == \n== Essa foi por pouco, deu tudo certo mas não sobrou um troco de pinga. ==\n");
        } else if (salarioFinal < 0) {
            System.out.println("\n== SALDO NEGATIVO == \n== É campeão, melhor começar a olhar uns bicos... Deu ruim dessa vez. ==\n");
        }

        sc.close();

    }
}
