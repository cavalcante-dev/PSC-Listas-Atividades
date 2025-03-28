import java.util.Scanner;

public class Atv1_Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, frequenciaPorCento, frequencia;

        System.out.println("\n=== Insira a nota do Aluno: ===");
        nota = sc.nextDouble();
        System.out.println("=== Insira a frequencia do aluno (%): ===");
        frequenciaPorCento = sc.nextDouble();

        frequencia = frequenciaPorCento / 100;

        if (nota > 10.0 && frequencia > 1.0) {
            System.out.println("\n== Valores de nota e/ou frequência inválidos. ==\n");
        } else if (nota >= 4.0 && nota <= 7 && frequencia >= 0.75) {
            System.out.println("\n== O Aluno está de recuperação. ==\n");
        } else if (nota < 4.0 || frequencia < 0.75) {
            System.out.println("\n== O Aluno foi reprovado! ==\n");
        } else if (nota >= 7.0 && frequencia >= 0.75){
            System.out.println("\n== O Aluno foi aprovado! ==\n");
        }

        sc.close();

    }
}