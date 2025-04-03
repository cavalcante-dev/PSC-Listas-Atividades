package ProfessorGlender.Lista03;
import java.util.Scanner;

public class Atv4_DiasCorridos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int bissexto, dias1, dias2, mes1, mes2, ano1, ano2, diasFinal, anosDias, bissextoDias, anos = 0;

        System.out.println("\n==== Digite a primeira data para o calculo de dia decorridos: ===");
        System.out.println("> Dia: ");
        dias1 = sc.nextInt();
        System.out.println("> Mês: ");
        mes1 = sc.nextInt();
        System.out.println("> Ano: ");
        ano1 = sc.nextInt();
        
        /* 
        bissexto = anos % 3;

        for (bissextoDias = 0; bissexto != 0;) {
            bissextoDias += 1;
            bissexto %= anos / 3;
        }        
        
        diasFinal = anosDias + bissextoDias;
        
        System.out.println("Exitem " + diasFinal + " dias e " + " segundos em " + anos + " anos." );
        */
    }
}
