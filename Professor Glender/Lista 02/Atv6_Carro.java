import java.util.Scanner;

public class Atv6_Carro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int quilometros, litros, eficiencia;

        System.out.println("\n== Digite a quantidade de quilômetros (km) percorridos: ==");
        quilometros = sc.nextInt();
        System.out.println("== Digite a quantidade de combustivel gasto (l): ==");
        litros = sc.nextInt();

        eficiencia = quilometros / litros;

        System.out.println("\n== Seu carro consome " + eficiencia + "km/l ==");

        if (eficiencia < 8) {
            System.out.println("=== Parabéns! Seu carro é Econômico. ===\n");
        } else if (eficiencia > 8 || eficiencia < 12) {
            System.out.println("=== Parabéns! Seu carro é Moderado. ===\n");
        } else if (eficiencia > 12) {
            System.out.println("=== Parabéns! Seu carro é Eficiente. ===\n");
        }

        sc.close();
    }
}