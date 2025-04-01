import java.util.Scanner;

public class Desafio_Extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int valor; 

        System.out.println("Digite o valor inserido: ");
        valor = sc.nextInt();

        valor = valor %= 100;
        System.out.println("Quantidade de notas de 100: " + valor);
        
        valor = valor %= 50;
        System.out.println("Quantidade de notas de 50: " + valor);
        
        valor = valor %= 20;
        System.out.println("Quantidade de notas de 20: " + valor);
        
        valor = valor %= 10;
        System.out.println("Quantidade de notas de 10: " + valor);
        
        valor = valor %= 5;
        System.out.println("Quantidade de notas de 5: " + valor);
        
        valor = valor %= 2;
        System.out.println("Quantidade de notas de 2: " + valor);
        
        valor = valor %= 1;
        System.out.println("Quantidade de notas de 1: " + valor);
    
    /*      int [] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) { 
            int quantidadeNotas = valor / nota;
            if (quantidadeNotas > 0) {
                System.out.println("Notas de R$ " + nota + ",00: " + quantidadeNotas);
                valor %= nota; 
            }
        } */

        sc.close();

    }       
}
