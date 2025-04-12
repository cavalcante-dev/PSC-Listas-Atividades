package ProfessorDaniel.Lista04;

public class Atv4_Habitantes {
    public static void main(String[] args) {
        
        double taxaAnual1, taxaAnual2, populacao1, populacao2; 
        taxaAnual1 = 3.0 / 100.0; 
        taxaAnual2 = 1.5 / 100.0;
        populacao1 = 80000;
        populacao2 = 200000;

        double ano = 0;
        
        System.out.println("=== Ano " + ano + " ===" + 
        "\n> População País A = " + populacao1 +
        "\n> População País B = " + populacao2);

        for (int contador = 0; contador <= populacao2;) {
            populacao1 = populacao1 + (populacao1 * taxaAnual1);
            populacao2 = populacao2 + (populacao2 * taxaAnual2);
            int atual = (int)populacao1;
            contador = atual; 

            ano++;

            System.out.printf("""
                                \n=== Ano %.0f === 
                                > População País A = %.0f 
                                > População País B = %.0f \n""", ano, populacao1, populacao2);
        }

        System.out.println("\n=== Tempo para que a população do país A seja maior que do país B: " + ano + " anos ===\n");

    }
}
