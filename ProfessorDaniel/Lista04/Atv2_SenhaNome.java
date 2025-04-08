package ProfessorDaniel.Lista04;

import java.util.Scanner;

public class Atv2_SenhaNome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String usuario, senha; 
        boolean erro = true;

        System.out.println("\n=== Digite seu nome de usuário: ===");
        usuario = sc.next();
        System.out.println("\n=== Digite sua senha: ===");
        senha = sc.next();

        if (senha.equals(usuario) ) {
            while (erro == true) {
                System.out.println("\n== SENHA INCORRETA - TENTE NOVAMENTE ==");        
                System.out.println("=== Digite seu nome de usuário: ===");
                usuario = sc.next();
                System.out.println("\n=== Digite sua senha: ===");
                senha = sc.next();
                if (senha != usuario) {
                    erro = false;
                }
            }
        }

        System.out.println("\n====== Seja bem-vindo! ======\n");

        sc.close();

    }
}
