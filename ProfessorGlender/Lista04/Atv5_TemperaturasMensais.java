package ProfessorGlender.Lista04;
import java.util.Scanner;

public class Atv5_TemperaturasMensais {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int [] temperatura = new int[12];

        System.out.println("\n=== Inisira o ano para iniciar a verificação: ===");
        int ano = sc.nextInt();

        System.out.println("\n===========================================================\n");

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("> Temperatura de " + meses[i] + " (em C°): ");
            temperatura[i] = sc.nextInt();
        }

        System.out.println("\n===========================================================\n");

        int maior = 0, menor = 1500;
        String maiorMes = "", menorMes = "";

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > maior) {
                maior = temperatura[i];
                maiorMes = meses[i];
            } else if (temperatura[i] < menor) {
                menor = temperatura[i];
                menorMes = meses[i];
            }
        }

        if (maior == menor) {
            System.out.println("=== Empate! Uau, como isso é possivél. ===");
        } else {
            System.out.println("> A maior temperatura do ano foi " + maior + "C° em " + maiorMes + "\n> A menor temperatura do ano foi " + menor + "C° em " + menorMes);    
        }
        
        System.out.println("\n===========================================================\n");

        sc.close();

    }
}