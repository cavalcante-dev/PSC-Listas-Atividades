import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Valores valores = new Valores();
        Scanner sc = new Scanner(System.in);
        double valor = 0;

        System.out.println("""
                ========== Calculo de Valores ==========
                
                > Digite os valores desejados para os seguintes calculos: 
                   
                   - Quantidade de valores inseridos. 
                   - Listagem dos valores informados.
                   - Listagem inversa dos valores informados.
                   - Calculo de todos os valores.
                   - Média dos valores.
                   - Valores acima da média.
                   - Valores abaixo de sete. 
                   
                > Digite -1 para finalizar inserção de valores.""");

        System.out.println("\n---------------------------------------------\n");

        do {

            System.out.print("> Insira um valor: ");
            valor = sc.nextDouble();
            if (valor == -1) { break; }
            valores.setlistaValores(valor);

        } while(valor != -1);

        System.out.println("\n========== RESULTADOS ==========\n");

        System.out.println("> Número de valoes inseridos: " + valores.getlistaValores().size());

        System.out.println("> Valores na ordem que foram inseridos: " + valores.getlistaValores());

        System.out.println("> Valores na ordem inversa que foram inseridos: " + valores.inverterValores());

        System.out.println("> Soma total dos valores: " + valores.somaValores());

        System.out.println("> Média dos valores: " + valores.calcularMedia());

        System.out.println("> Valores maiores que a média: " + valores.getAcimaMedia());

        System.out.println("> Valores menores que sete: " + valores.getMenorSete());

        System.out.println("\n===== Programa encerrado. Tenha um bom dia! =====\n");


    }
}