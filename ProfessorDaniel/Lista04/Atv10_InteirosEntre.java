package ProfessorDaniel.Lista04;

import java.util.Scanner;

public class Atv10_InteirosEntre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB;

        System.out.print("> Digite o primeiro número: ");
        numA = sc.nextInt();
        System.out.print("> Digite o segundo número: ");
        numB = sc.nextInt();

        int maior = 0, menor = 0;

        if (numA > numB) {
            maior = numA;
            menor = numB;           
        } else if (numB > numA){
            maior = numB;
            menor = numA;
        }

        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
        }
        
    }   
}
