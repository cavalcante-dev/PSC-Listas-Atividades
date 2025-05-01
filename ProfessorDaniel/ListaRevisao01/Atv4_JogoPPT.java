package ProfessorDaniel.ListaRevisao01;

import java.util.Random;
import java.util.Scanner;

public class Atv4_JogoPPT {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int jogadaJogador, pontosJogador, pontosMaquina;  
        String escolhaJogador, escolhaMaquina;
        boolean erro = true;

        System.out.println("=== HUMANIDADE VS. MAQUINA === \n > Melhor de 3 < \n");

        for (int i = 0; i < 3; i++) {

            int jogadaMaquina = random.nextInt(3) + 1;

            System.out.println(jogadaMaquina);

            System.out.println("""
                === ESOLHA SUA JOGADA ===
                1. PEDRA
                2. PAPEL
                3. TESOURA
                4. DESISTIR :( 
                """);
            jogadaJogador = sc.nextInt();

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
        }

    }
}
