package ProfessorDaniel.Lista04;

import java.util.Scanner;

public class Atv3_InfoValida {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String nome, estadoCivil, sexo;
        String nomeComparacao = "AAA";
        int idade; 
        double salario; 
        boolean erro = true;

        System.out.println("\n=== Digite seu nome: ===");
        nome = sc.next();

        if (nome.length() <= nomeComparacao.length()) {
            while (erro == true) {
                System.out.println("""
                                \n= NOME INVALIDO - TENTE NOVAMENTE =
                                === Digite seu nome: ===""");
                nome = sc.next();
                if (nome.length() > nomeComparacao.length()) {
                    erro = false;
                }
            }
            erro = true;
        }

        System.out.println("\n=== Digite sua idade: ===");
        idade = sc.nextInt();

        if (idade > 150) {
            while (erro == true) {
                System.out.println("""
                                \n= IDADE INVALIDA - TENTE NOVAMENTE =
                                === Digite sua idade: ===""");
                idade = sc.nextInt();
                if (idade > 0 && idade < 150) {
                    erro = false;
                }
            }
            erro = true;
        }

        System.out.println("\n=== Digite seu sálario: ===");
        salario = sc.nextDouble();
        
        if (salario < 0) {
            while (erro == true) {
                System.out.println("""
                                \n= SÁLARIO INVALIDO - TENTE NOVAMENTE =
                                === Digite sua sálario: ===""");
                salario = sc.nextInt();
                if (salario > 0) {
                    erro = false;
                }
            }
            erro = true;
        }

        System.out.println("""
                \n=== Selecione seu sexo ===
                > F. Feminino
                > M. Masculino""");
        sexo = sc.next();

        if (! sexo.equals("M") && ! sexo.equals("F")) {
            while (erro == true) {
                System.out.println("""
                                \n= SEXO INVALIDO - TENTE NOVAMENTE =
                                === Digite seu Sexo: ===
                                > F. Feminino
                                > M. Masculino""");
                sexo = sc.next();
                if (sexo.equals("M") || sexo.equals("F")) {
                    erro = false;
                }
            }
            erro = true;
        }

        System.out.println("""
                \n=== Selecione seu estado civil: ===
                > S. Solteiro
                > C. Casado
                > V. Viúvo
                > D. Divorciado """);
        estadoCivil = sc.next();
        
        if (! estadoCivil.equals("S") && ! estadoCivil.equals("C") && ! estadoCivil.equals("V") && ! estadoCivil.equals("D")) {
            while (erro == true) {
                System.out.println("""
                                \n= ESTADO CIVIL INVALIDO - TENTE NOVAMENTE =
                                === Selecione seu estado civil: ===
                                > S. Solteiro
                                > C. Casado
                                > V. Viúvo
                                > D. Divorciado """);
                estadoCivil = sc.next();
                if (estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")) {
                    erro = false;
                }
            }
            erro = true; 
        }


        System.out.println("\n=== Olá! " + nome + " ===" + 
                            "\n> IDADE: " + idade + 
                            "\n> SALARIO: " + salario + 
                            "\n> SEXO: " + sexo + 
                            "\n> ESTADO CIVIL: " + estadoCivil + "\n");

        sc.close();
        
    }
}
