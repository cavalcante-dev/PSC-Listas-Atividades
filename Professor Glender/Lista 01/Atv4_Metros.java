import java.util.Scanner;

public class Atv4_Metros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double metros, pes, polegadas, centimetros; 

        System.out.println("Digite a altura em Metros (m): ");
        metros = sc.nextDouble();

        centimetros = metros * 100;
        pes = centimetros / 30.48; 
        polegadas = centimetros / 2.54;

        System.out.printf("Altura em Polegadas: %.2f \nAltura em Pés: %.2f", polegadas, pes);

        sc.close();

    }
}
