package ProfessorGlender.Lista04;
import java.util.Scanner;

public class Atv8_ControleVendas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int [][] vendas = new int[12][4];
        int [] somaMes = new int[12];
        int somaAno = 0;

        System.out.println("\n==== RELÁTORIO DE VENDAS NO ANO ====");
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("\n=== Faturamento Semanal de " + meses[i] + " ===");
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("> Valor de vendas da " + (j+1) + "º semana do mês: ");
                vendas[i][j] = sc.nextInt();
            }
            for (int j = 0; j < vendas[i].length; j++) {
                somaMes[i] += vendas[i][j];
            }
            System.out.println("\n> Soma do mês: " + somaMes[i]);
        }

        for (int i = 0; i < somaMes.length; i++) {
            somaAno += somaMes[i];
        }

        System.out.println("\n=============================================\n");
        
        System.out.println("> Rendimento Anual: " + somaAno);

        System.out.println("\n=============================================\n");

        sc.close();

    }
}
