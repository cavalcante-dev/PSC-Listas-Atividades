package ProfessorDaniel.ListaRevisao01;
import java.util.Scanner;

public class Atv5_Palindromo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palindromo, reverso = "";
        
        System.out.print("\n> Insira sua palavra: ");
        palindromo = sc.next();

        for (int i = palindromo.length() - 1; i >= 0; i--) {
            reverso += palindromo.charAt(i);            
        }

        System.out.println("\n--------------------------------------\n");

        if (reverso.equalsIgnoreCase(palindromo)) {
            System.out.println("> " + palindromo + "\n> " + reverso + "\n=== SUA PALAVRA É UM PÁLINDROMO ===\n");
        } else {
            System.out.println("> " + palindromo + "\n> " + reverso + "\n=== SUA PALAVRA NÃO É UM PÁLINDROMO ===\n");
        }

    }
}
