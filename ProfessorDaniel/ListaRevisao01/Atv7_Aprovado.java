package ProfessorDaniel.ListaRevisao01;
import java.util.Scanner;

public class Atv7_Aprovado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nomeAluno; 
        double[] notaAluno = new double[5];
        double somaNotas = 0, media;
        
        System.out.print("\n> Verificando a aprovação do(a) aluno(a): ");
        nomeAluno = sc.next();

        for (int i = 0; i < notaAluno.length; i++) {
            System.out.print("> Insira a " + (i+1) + "ª nota: ");
            notaAluno[i] = sc.nextDouble();      
            somaNotas += notaAluno[i];
        }

        media = somaNotas / 5; 

        if (media > 7) {
            System.out.println("\n=== ALUNO(A) " + nomeAluno + " APROVADO ===");
        } else if (media < 7) {
            System.out.println("\n=== ALUNO(A) " + nomeAluno + " REPROVADO ===");
        }

        sc.close();

    }
}
