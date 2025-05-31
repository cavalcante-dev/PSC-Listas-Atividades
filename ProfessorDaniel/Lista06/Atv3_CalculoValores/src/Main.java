import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Valores valores = new Valores();
        Scanner sc = new Scanner(System.in);
        double valor = 0;

        System.out.println("""
                ==== Calculo de Valores ====
                > Digite os valores desejados para os seguintes calculos: 
                   - Calculo de todos os valores.
                   - Média dos valores.
                   - Valores acima da média.
                   - Valores abaixo de sete. 
                > Digite -1 para finalizar inserção de valores.
                """);

        do {

            System.out.print("> Insira um valor: ");
            valor = sc.nextDouble();
            if (valor == -1) { break; }
            valores.setlistaValores(valor);

        } while(valor != -1);

        double somaValores = valores.somaValores();

        System.out.println(somaValores);

        double media = valores.calcularMedia();

        System.out.println(media);

        List<Double> valoresAcimaMedia = new ArrayList<>(valores.getAcimaMedia());

        System.out.println(valoresAcimaMedia);

    }
}