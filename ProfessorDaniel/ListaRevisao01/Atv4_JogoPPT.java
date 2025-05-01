package ProfessorDaniel.ListaRevisao01;

import java.util.Random;
import java.util.Scanner;

public class Atv4_JogoPPT {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int jogadaJogador, pontosJogador = 0, pontosMaquina = 0;
        int[] escolhaJogadorNum = new int[3], escolhaMaquinaNum = new int[3]; //armazena a escolha do jogador em cada rodada  
        String [] escolhaJogador = {"Pedra", "Papel", "Tesoura"}, escolhaMaquina = {"Pedra", "Papel", "Tesoura"};
        boolean erro = true;

        System.out.println("\n=== HUMANIDADE VS. MAQUINA === \n > Melhor de 3 <");

        for (int i = 0; i < 3; i++) {

            int jogadaMaquina = random.nextInt(3) + 1;
            escolhaMaquinaNum[i] = jogadaMaquina;

            System.out.println("""

                === ESOLHA SUA JOGADA ===
                1. PEDRA
                2. PAPEL
                3. TESOURA
                4. DESISTIR :( 
                """);
            jogadaJogador = sc.nextInt();

            //valida a escolha do jogador
            if (jogadaJogador < 1 || jogadaJogador > 4) {
                    do {
                        System.out.println("\n=== SEU PAMONHA SÃO SÓ 4 OPÇÕES - TENTE NOVAMENTE ===\n");
                        System.out.println("""

                            === ESOLHA SUA JOGADA ===
                            1. PEDRA
                            2. PAPEL
                            3. TESOURA
                            4. DESISTIR :( 
                            """);
                        jogadaJogador = sc.nextInt();
                        if (!(jogadaJogador < 1 || jogadaJogador > 4)) {
                            erro = false;
                        }    
                    } while (erro == true);                
            } 
            if (jogadaJogador == 4) {
                System.out.println("=== VITÓRIA DAS MAQUINAS ===");
                break;
            } 

            escolhaJogadorNum[i] = jogadaJogador;
        }

        //resultados

        System.out.println("\n------------------------------------\n");

        for (int i = 0; i < 3; i++) {
            
            System.out.println("\n=== RODADA " + (i+1) + " ===");

            if (escolhaJogadorNum[i] == escolhaMaquinaNum[i]) {
                System.out.println("=== EMPATE NA RODADA - NINGUÉM GANHA PONTOS ===");
            } else if (escolhaJogadorNum[i] == 1 && escolhaMaquinaNum[i] == 3) {
                System.out.println("> Escolha das Máquinas: " + escolhaMaquina[2] + "\n> Escolha do jogador: " + escolhaJogador[0]);
                pontosJogador++;
            } else if (escolhaJogadorNum[i] == 2 && escolhaMaquinaNum[i] == 1) {
                System.out.println("> Escolha das Máquinas: " + escolhaMaquina[0] + "\n> Escolha do jogador: " + escolhaJogador[1]);
                pontosJogador++;
            } else if (escolhaJogadorNum[i] == 3 && escolhaMaquinaNum[i] == 2) {
                System.out.println("> Escolha das Máquinas: " + escolhaMaquina[1] + "\n> Escolha do jogador: " + escolhaJogador[2]);
                pontosJogador++;
            }  else if (escolhaJogadorNum[i] == 3 && escolhaMaquinaNum[i] == 1) {
                System.out.println("> Escolha das Máquinas: " + escolhaMaquina[0] + "\n> Escolha do jogador: " + escolhaJogador[2]);
                pontosMaquina++;
            } else if (escolhaJogadorNum[i] == 1 && escolhaMaquinaNum[i] == 2) {
                System.out.println("> Escolha das Máquinas: " + escolhaMaquina[1] + "\n> Escolha do jogador: " + escolhaJogador[0]);
                pontosMaquina++;
            } else if (escolhaJogadorNum[i] == 2 && escolhaMaquinaNum[i] == 3) {
                System.out.println("> Escolha das Máquinas: " + escolhaMaquina[2] + "\n> Escolha do jogador: " + escolhaJogador[1]);
                pontosMaquina++;
            }
        }

        System.out.println("\n------------------------------------\n");

        System.out.println("=== PONTUAÇÃO FINAL ===" + "\n> Máquinas: " + pontosMaquina + "\n> Humanidade: " + pontosJogador);

        if (pontosMaquina > pontosJogador) {
            System.out.println("\n=== VITÓRIA DAS MAQUINAS ===\n");
        } else if (pontosMaquina < pontosJogador) {
            System.out.println("\n=== VITÓRIA DO JOGADOR ===\n");
        } else if (pontosMaquina == pontosJogador) {
            System.out.println("=== EMPATE - TODO MUNDO SAIU FELIZ ===\n");
        }

    }
}
