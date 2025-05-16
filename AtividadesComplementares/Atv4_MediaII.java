package AtividadesComplementares;

import java.util.Scanner;

public class Atv4_MediaII {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] num = new int[2];

        for (int i = 0; i < num.length; i++) {
            System.out.print("> Digite o " + (i+1) + "º número: ");
            num[i] = sc.nextInt();
        }

        int media = mediaAritimetica(num[0], num[1]);
        System.out.println("=== A media dos números é: " + media + " ===\n");

    }

    public static int mediaAritimetica(int num1, int num2) {
        int media;
        media = (num1 + num2) / 2;
        return media;
    }


}
