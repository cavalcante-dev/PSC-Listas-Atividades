import java.util.Scanner;

public class Atv1_Media {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Digite suas notas: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3; 

        System.out.printf("Sua média é: %.1f", media);

        sc.close();

    }
}