package ProfessorDaniel.Lista05;

import java.util.Scanner;

public class Atv4_PositivoNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("> Digite um número: ");
        num = sc.nextInt();
        
        System.out.println(postivoNegativo(num));
        
    }

    public static char postivoNegativo(int num) {
        char resultado = 'F';
        if (num > 0) {
            resultado = 'P';
            return resultado;
        } else if (num <= 0) {
            resultado = 'N';
            return resultado;
        }
        return resultado;
    }

}
