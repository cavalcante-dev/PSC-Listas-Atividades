package ProfessorDaniel.ListaRevisao01;

import java.util.Scanner;

public class Atv2_MaiorIdade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("\n> Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("-----------------------");

        if (idade < 18) {
            System.out.println("===== O usuario é menor de idade ======\n");
        } else if (idade >= 18) {
            System.out.println("===== O usuario é maior de idade ====== \n");
        }

        sc.close();

    }
}