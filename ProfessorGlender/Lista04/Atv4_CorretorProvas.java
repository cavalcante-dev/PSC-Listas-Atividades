package ProfessorGlender.Lista04;
import java.util.Scanner;

public class Atv4_CorretorProvas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] nomeAluno, gabaritoAluno, gabaritoProva; 
        int aprovacaoPorCento;
        int [] nota;
        
        nota = new int[10];
        nomeAluno = new String[10];
        gabaritoAluno = new String[8];
        gabaritoProva = new String[8];

        System.out.println("=== Inisira o Gabarito da prova: ===");
        for (int i = 0; i < gabaritoProva.length; i++) {
            System.out.print("> Questão " + (i+1) + ": ");
            gabaritoProva[i] = sc.next();
        }

        System.out.println("\n==============================================");

        //Repetição responsável pela nota do aluno

        for (int i = 0; i < nomeAluno.length; i++) {
            System.out.println("\n=== Insira o nome do " + (i+1) + "º Aluno: ===");
            nomeAluno[i] = sc.next();

            //Repetição responsável pelo gabarito individual

            for (int j = 0; j < gabaritoAluno.length; j++) {
                System.out.print("> Resposta - Questão " + (j+1) + ": ");
                gabaritoAluno[j] = sc.next();    
                if (gabaritoAluno[j].equalsIgnoreCase(gabaritoProva[j])) {
                    nota[i]++;
                } 
            }
            System.out.println("Aluno: " + nomeAluno[i] + "\nNota: " + nota[i]);
        }

        /* 
        Coisas que faltam: 
        > Adicionar um ciclo de validação de nomes e notas
        > Adicionar o calculo de aprovação individual
        > Adicionar o calculo de porcentagem de aprovação
        > Adicionar um ciclo de validação de professor e matéria  
        */

        sc.close();
        
    }
}