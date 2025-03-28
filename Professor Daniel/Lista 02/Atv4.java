import java.util.Scanner;

public class Atv4 {

    public static void main(String[] args) {
        
        double precogasolina, litrogasolina, pagamento; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço da gasolina: ");
        precogasolina = sc.nextDouble();

        System.out.println("Quantos litros vai ser hoje campeão(ã)?");
        litrogasolina = sc.nextDouble();

        pagamento =  litrogasolina * precogasolina;

        System.out.println("Total a pagar: " + pagamento);

        sc.close();

    }

}

