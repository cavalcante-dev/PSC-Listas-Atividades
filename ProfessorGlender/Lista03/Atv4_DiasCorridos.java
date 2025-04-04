package ProfessorGlender.Lista03;
import java.util.Scanner;

public class Atv4_DiasCorridos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int dia1, dia2, mes1, mes2, ano1, ano2;

        System.out.println("\n==== Digite a primeira data para o calculo de dias decorridos (DD/MM/YY): ===");
        System.out.println("> Dia: ");
        dia1 = sc.nextInt();
        System.out.println("> Mês: ");
        mes1 = sc.nextInt();
        System.out.println("> Ano: ");
        ano1 = sc.nextInt();

        System.out.println("\n==== Digite a segunda data para o calculo de dias decorridos (DD/MM/YY): ===");
        System.out.println("> Dia: ");
        dia2 = sc.nextInt();
        System.out.println("> Mês: ");
        mes2 = sc.nextInt();
        System.out.println("> Ano: ");
        ano2 = sc.nextInt();

        //Condições de erro para as datas sendo digitadas erroneamente (dia, mês ou ano), se as datas são iguais ou se fevereiro tiver +29 dias. 
        
        if (ano1 > ano2 || dia1 > 30 || mes1 > 12 || dia2 > 30 || mes2 > 12 || dia1 < dia2 && ano1 == ano2 && mes1 == mes2 || mes1 < mes2 && ano1 == ano2 && mes1 == mes2) {
            boolean erro = true;
            while (erro == true) {    
                System.out.println("\n=== Dado incorretos - Tente Novamente ==");

                System.out.println("\n==== Digite a primeira data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia1 = sc.nextInt();
                System.out.println("> Mês: ");
                mes1 = sc.nextInt();
                System.out.println("> Ano: ");
                ano1 = sc.nextInt();

                System.out.println("\n==== Digite a segunda data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia2 = sc.nextInt();
                System.out.println("> Mês: ");
                mes2 = sc.nextInt();
                System.out.println("> Ano: ");
                ano2 = sc.nextInt();

                if (ano1 < ano2 || dia1 < 30 || mes1 < 12 || dia2 < 30 || mes2 < 12){
                    erro = false;
                }
            }
        } else if (mes1 == 2 && dia1 > 28 || mes2 == 2 && dia2 > 28) {
            boolean erro = true;
            while (erro == true) {  
                System.out.println("\n=== Dado incorretos - Tente Novamente ==");

                System.out.println("\n==== Digite a primeira data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia1 = sc.nextInt();
                System.out.println("> Mês: ");
                mes1 = sc.nextInt();
                System.out.println("> Ano: ");
                ano1 = sc.nextInt();

                System.out.println("\n==== Digite a segunda data para o calculo de dias decorridos (DD/MM/YY): ===");
                System.out.println("> Dia: ");
                dia2 = sc.nextInt();
                System.out.println("> Mês: ");
                mes2 = sc.nextInt();
                System.out.println("> Ano: ");
                ano2 = sc.nextInt();
                
                if (mes1 == 2 && dia1 < 29 || mes2 == 2 && dia2 < 29){
                    erro = false;
                }
            } 
        } else if (ano1 == ano2 && dia1 == dia2 && mes1 == mes2) {
            System.out.println("\n== As datas digitadas são iguais! 0 dias se passaram. ==\n");
        }

        System.out.println("\n=== DATA 01: " + dia1 + "/" + mes1 + "/" + ano1 + " ===");
        System.out.println("=== DATA 02: " + dia2 + "/" + mes2 + "/" + ano2 + " ===\n");

        //soma de dias do mês que vem primeiro, considerando se o ano inserido é bissexto;
  
        int diasAno, diasMes, diasRestantes1 = 0, diasRestantes2 = 0;

        if (mes1 < 2) {
            diasRestantes1 = 30 - dia1 + 1;
            System.out.println("Dias Restantes: " + diasRestantes1);
        } else if (mes1 >= 2) {
            if (ano1 %4 == 0 && ano1 %100 != 0 || ano1 %400 == 0) {
                diasRestantes1 = 29 + (mes1 * 30) + 1;
                System.out.println("Dias Restantes: " + diasRestantes1);
            } else {
                diasRestantes1 = 28 + (mes1 * 30) + 1;
                System.out.println("Dias Restantes: " + diasRestantes1);
            }
        }
 
        //soma de dias dos anos restantes entre Data 01 e Data 02;

        int anosTotais = ano2 - ano1;
        int diasEntre = anosTotais * 365;

        System.out.println(anosTotais);

        System.out.println(diasEntre);

        // calculo de anos bissextos entre Data 1 e Data 2;

        while (ano1 != ano2) {

            if (ano1 %4 == 0 && ano1 %100 != 0 || ano1 %400 == 0) {
                System.out.println(ano1 + " é bissexto.");
                diasEntre++;  
                ano1++;
            } else {
                System.out.println(ano1 + " não é bissexto.");
                ano1++;
            }

        }

        //adicionar um -1 a soma final referente ao ano inicial. 

        System.out.println(diasEntre);

    }
}
