import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tribunal tribunalValidacao = new Tribunal();
        List<Suspeito> listaSuspeitos = new ArrayList<>();
        String nome;
        int resposta;
        int finalizar = 0;

        System.out.println("""
                    
                    ==== ORIENTAÇÕES PARA O INVESTIGADOR ==== 
                    
                    Etapa de perguntas: 
                    > O interrogado terá apenas 2 opções de respostas, "Sim" ou "Não". 
                    > Marque em seu formulário o número 1 para "Sim" e o número 2 para "Não". 
                    > As respostas serão contabilizadas automaticamente ao final do preenchimento. """);

        System.out.println("\n=====================================================\n");

        System.out.println("==== Vamos começar o interrogatório: ====");

        do {

            System.out.print("\n> Insira o nome do interrogado: ");
            nome = sc.next();
            Suspeito suspeito = new Suspeito(nome);
            listaSuspeitos.add(suspeito);

            System.out.print("""
                    \n> Telefonou para a vítima?
                    1. Sim
                    2. Não
                    Resposta:\s""");
            resposta = sc.nextInt();
            resposta = tribunalValidacao.validarResposta(resposta);
            suspeito.setResposta(resposta);

            System.out.print("""
                    \n> Esteve no local do crime?
                    1. Sim
                    2. Não
                    Resposta:\s""");
            resposta = sc.nextInt();
            resposta = tribunalValidacao.validarResposta(resposta);
            suspeito.setResposta(resposta);

            System.out.print("""
                    \n> Mora perto da vítima?
                    1. Sim
                    2. Não
                    Resposta:\s""");
            resposta = sc.nextInt();
            resposta = tribunalValidacao.validarResposta(resposta);
            suspeito.setResposta(resposta);

            System.out.print("""
                    \n> Devia para a vítima?
                    1. Sim
                    2. Não
                    Resposta:\s""");
            resposta = sc.nextInt();
            resposta = tribunalValidacao.validarResposta(resposta);
            suspeito.setResposta(resposta);

            System.out.print("""
                    \n> Já trabalhou com a vítima?
                    1. Sim
                    2. Não
                    Resposta:\s""");
            resposta = sc.nextInt();
            resposta = tribunalValidacao.validarResposta(resposta);
            suspeito.setResposta(resposta);

            System.out.print("""
                    \n> Finalizar interrogatorios?
                    1. Sim
                    2. Não
                    Resposta:\s""");
            finalizar = sc.nextInt();
            finalizar = tribunalValidacao.validarResposta(finalizar);

        } while (finalizar != 1);

        Tribunal tribunal = new Tribunal(listaSuspeitos);
        tribunal.definirCulpa();

        System.out.println("\n=====================================================\n");

        tribunal.definirJulgamento();

        sc.close();

    }
}