import java.util.Random;
import java.util.Scanner;

public class Atv7_Adivinha {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int tentativa;
        Random random = new Random();
        int acerto = random.nextInt((10 - 1) + 1) + 1;

        System.out.println("\n=== Qual número será gerado pelo programa? (1 a 10): ===");
        tentativa = sc.nextInt();
 
        System.out.println("\n= Número gerado: " + acerto + " =");

        if (acerto == tentativa) {
            System.out.println("=== Parabéns, você acertou o número!! ===\n");
        } else if (tentativa > 10 || tentativa < 1) {
            System.out.println("=== Tentativa inválida, número fora de padrão. ===\n");
        } else if (acerto != tentativa) {
            if (acerto > tentativa) {
                System.out.println("=== Mais sorte da próxima vez, " + tentativa + " é menor do que " + acerto + "! Continue tentando. ===\n");
            } else if (acerto < tentativa) {
                System.out.println("=== Mais sorte da próxima vez, " + tentativa + " é maior do que " + acerto + "! Continue tentando. ===\n");
            }
        } 

        sc.close();

    }
}
