package ProfessorDaniel.Lista04;
import java.util.Scanner;

public class Atv5_HabitantesII {
    public static void main(String[] args) {

        int encerramento = 0;
        Scanner sc = new Scanner(System.in);

            do {
                
                double taxaAnual1, taxaAnual2, populacao1, populacao2;
                boolean erro = true; 

                System.out.println("\n=== Digite a população do País A: ===");
                populacao1 = sc.nextDouble();
                
                if (populacao1 < 0) {
                    while (erro = true) {        
                        System.out.println("\n== POPULAÇÃO INVÁLIDA - DIGITE NOVAMENTE ==" + 
                                        "\n=== Digite a população do País A: ===");
                        populacao1 = sc.nextDouble();
                        if (populacao1 > 0) {
                            erro = false;
                        }
                    }
                    erro = true; 
                }  

                System.out.println("\n=== Digite a porcentagem de crescimento: ===");
                taxaAnual1 = sc.nextDouble();

                
                System.out.println("\n=== Digite a população do País B: ===");
                populacao2 = sc.nextDouble();

                
                if (populacao2 < 0) {
                    while (erro = true) {        
                        System.out.println("\n== POPULAÇÃO INVÁLIDA - DIGITE NOVAMENTE ==" + 
                                        "\n=== Digite a população do País A: ===");
                        populacao2 = sc.nextDouble();
                        if (populacao2 > 0) {
                            erro = false;
                        }
                    }
                    erro = true; 
                }  

                System.out.println("\n=== Digite a porcentagem de crescimento: ===");
                taxaAnual2 = sc.nextDouble();
        
                if (taxaAnual1 < taxaAnual2) {
                    System.out.println("\n=== País A nunca irá alcançar a população do País B ===\n");
                    break;
                } else if (populacao1 > populacao2) {
                    System.out.println("\n=== País A já possui uma população maior que o País B ===\n");
                    break;
                } else if (populacao1 == populacao2) {
                    System.out.println("\n=== País A já possui uma população igual ao País B ===\n");
                    break;
                } 

                double taxaPorCento1 = taxaAnual1 / 100.0; 
                double taxaPorCento2 = taxaAnual2 / 100.0;

                double ano = 0;
                
                System.out.println("\n=== Ano " + ano + " ===" + 
                "\n> População País A = " + populacao1 +
                "\n> População País B = " + populacao2);

                for (int contador = 0; contador <= populacao2;) {
                    populacao1 = populacao1 + (populacao1 * taxaPorCento1);
                    populacao2 = populacao2 + (populacao2 * taxaPorCento2);
                    int atual = (int)populacao1;
                    contador = atual; 

                    ano++;

                    System.out.printf("""
                                        \n=== Ano %.0f === 
                                        > População País A = %.0f 
                                        > População País B = %.0f \n""", ano, populacao1, populacao2);
                }

                System.out.println("\n=== Tempo para que a população do país A seja maior que do país B: " + ano + " anos ===\n");

                System.out.println("=== Deseja realizar outro calculo? ===" + 
                                    "\n1. Sim" + 
                                    "\n2. Não\n");
                encerramento = sc.nextInt();
                
                } while (encerramento != 2);
                
                System.out.println("=== Muito obrigado por utilizar nosso programa! ===\n");

                sc.close();
    }
}
