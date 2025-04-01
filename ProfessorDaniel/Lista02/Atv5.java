import java.util.Scanner;

public class Atv5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double valorAlemanha, valorPortugal, valorItalia, valorTotal;
        int pessoasTotal;

        System.out.println("Digite o valor da viagem para Alemanha: ");
        valorAlemanha = sc.nextDouble();

        System.out.println("Digite o valor da viagem para Portugal: ");
        valorPortugal = sc.nextDouble();

        System.out.println("Digite o valor da viagem para Itália: ");
        valorItalia = sc.nextDouble();
        System.out.println("Digite quantas pessoas vão para a Eurotrip: ");
        pessoasTotal = sc.nextInt();        

        valorTotal = (valorItalia + valorPortugal + valorAlemanha) * pessoasTotal; 

        System.out.printf("O valor total da viagem para " + pessoasTotal + " pessoas é de %.2f", valorTotal);

        sc.close();

    }

}
