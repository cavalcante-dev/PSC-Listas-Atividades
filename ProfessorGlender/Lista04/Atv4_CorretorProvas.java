package ProfessorGlender.Lista04;
import java.util.Scanner;

public class Atv4_CorretorProvas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] nomeAluno, gabaritoAluno, gabaritoProva; 
        double taxaAprovacao, aprovados = 0;
        int [] nota;
        
        nota = new int[10];
        nomeAluno = new String[10];
        gabaritoAluno = new String[8];
        gabaritoProva = new String[8];

        System.out.print("\n=== Olá Progfessor! === \n> Digite seu nome: ");
        String nomeProfessor = sc.next();

        System.out.print("> Digite sua materia: ");
        String materia = sc.next();

        System.out.println("\n==============================================\n");

        System.out.println("=== Inisira o Gabarito da prova: ===");
        for (int i = 0; i < gabaritoProva.length; i++) {
            System.out.print("> Questão " + (i+1) + ": ");
            gabaritoProva[i] = sc.next();
        }

        System.out.println("\n==============================================");
 
        //Repetição responsável pela nota do aluno

        for (int i = 0, a = 0, r = 0 ; i < nomeAluno.length; i++) {
            System.out.println("\n=== Insira o nome do " + (i+1) + "º Aluno: ===");
            nomeAluno[i] = sc.next();

            System.out.println("\n");

            //Repetição responsável pelo gabarito individual

            for (int j = 0; j < gabaritoAluno.length; j++) {
                System.out.print("> Resposta - Questão " + (j+1) + ": ");
                gabaritoAluno[j] = sc.next();    
                if (gabaritoAluno[j].equalsIgnoreCase(gabaritoProva[j])) {
                    nota[i]++;
                } 
            }

            if (nota[i] >= 6) {
                aprovados++;
                System.out.println("\nAluno: " + nomeAluno[i] + "\nNota: " + nota[i] + "\nALUNO APROVADO!");
            } else if (nota[i] < 6) {
                System.out.println("\nAluno: " + nomeAluno[i] + "\nNota: " + nota[i] + "\nALUNO REPROVADO!"); 

            }

        }

        taxaAprovacao = (aprovados / nomeAluno.length) * 100.00;

        System.out.println("\n==============================================\n");

        System.out.println("=== Total de Alunos Aprovado - " + aprovados +  " ====");
        System.out.println("=== Taxa Final de Aprovação de " + taxaAprovacao + "% ===");

        System.out.println("\n==============================================\n");

        /* 
        Coisas que faltam: 
        > Adicionar o calculo de aprovação individual - Feito
        > Adicionar o calculo de porcentagem de aprovação
        > Adicionar um campo de validação de professor e matéria - Feito
        */

        sc.close();
        
    }
}