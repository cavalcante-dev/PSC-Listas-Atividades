package ProfessorGlender.Lista03; 

public class Atv1_Multiplos {
    public static void main(String[] args) {
        
        int [] num = {2, 3, 5} ;

        System.out.println("\n");

        for (int calculo : num) {
            int multiplos = 1000 / calculo;
            System.out.println("== Possuem entre 1 e 1000 - " + multiplos + " multiplos de " + calculo + " ==\n");
        }

        System.out.println("\n");

    }
}
