package ProfessorGlender.Lista03;

import java.util.Scanner;

public class Atv6_Pesquisa {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int sexo, corOlhos, corCabelos, idade = 0;
        int maiorIdade = 0, menorIdade = 1500;
        int loiras = 0;
        boolean erro = true, condicao = false;

        do {

            System.out.println("\n=== Insira a idade - (Digite -1 para finalizar a pesquisa.) ===");
            idade = sc.nextInt();

            //Mensagem de erro para casa o usuario digite algum numero inválido - valido para todas as perguntas;
            if (idade == -1) {
                break;
            } else if (idade < 0) {
                do {          
                    System.out.println("""
                            === Valor Inválido - Tente Novamente. ==
                            === Insira a idade - (Digite -1 para finalizar a pesquisa.) ===""");
                    idade = sc.nextInt();
                    if (idade > 0) {
                        erro = false;
                    }
                } while (erro == true);
            }
            
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            System.out.println("""

                               === Qual o sexo? ===
                               > 1. Masculino
                               > 2. Feminino""");
            sexo = sc.nextInt();
            if (sexo > 2) {
                do {          
                    System.out.println("""

                        === Valor Inválido - Tente Novamente. ==
                        === Qual o sexo? ===
                        > 1. Masculino
                        > 2. Feminino""");
                    sexo = sc.nextInt();
                    if (sexo > 0 && sexo < 3) {
                        erro = false;
                    }
                } while (erro == true);
            }

            System.out.println("""

                               === Qual a cor dos olhos? ===
                               > 1. Azuis
                               > 2. Verdes
                               > 3. Castanhos""");
            corOlhos = sc.nextInt();
            if (corOlhos > 3) {
                do {          
                    System.out.println("""

                        === Valor Inválido - Tente Novamente. ==
                        === Qual a cor dos olhos? ===
                        > 1. Azuis
                        > 2. Verdes
                        > 3. Castanhos""");
                    corOlhos = sc.nextInt();
                    if (corOlhos > 0 && corOlhos < 4) {
                        erro = false;
                    }
                } while (erro == true);
            }
            
            System.out.println("""

                               === Qual a cor dos cabelos? ===
                               > 1. Louros
                               > 2. Castanhos
                               > 3. Pretos""");
            corCabelos = sc.nextInt();
            if (corCabelos > 3) {
                do {          
                    System.out.println("""

                        === Valor Inválido - Tente Novamente. ==
                        === Qual a cor dos cabelos? ===
                        > 1. Louros
                        > 2. Castanhos
                        > 3. Pretos""");
                    corCabelos = sc.nextInt();
                    if (corCabelos > 0 && corCabelos < 4) {
                        erro = false;
                    }
                } while (erro == true);
            }

            if (sexo == 2 && corOlhos == 2 && corCabelos == 1 && idade > 18 && idade < 35) {
                loiras++;
            }
            
        } while (condicao == false);

        System.out.println("""
                           \n=== Resultado da Pesquisa === 
                           _________________________________\n """ +
                           "\n=== Maior idade inserida: " + maiorIdade + 
                           "\n=== Menor idade inserida: " + menorIdade + 
                           "\n=== Quantida de mulheres loiras e de olhos verdes entre 18 e 35 anos: " + loiras + " ===\n");
        
    }
}