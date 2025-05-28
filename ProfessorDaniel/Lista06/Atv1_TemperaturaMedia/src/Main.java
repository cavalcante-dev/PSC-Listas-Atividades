import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Meses> meses = new ArrayList<>();
        Calculos calculo = new Calculos();
        int mesesConsiderados = 0;

        System.out.println("\n=== Calculo de Media de Temperatura Anual ===\n");
        System.out.print("> Insira quantos meses serão considerados para o calculo (Minimo 2): ");
        mesesConsiderados = sc.nextInt();
        mesesConsiderados = calculo.validarMes(mesesConsiderados);

        System.out.println("\n===========================\n");

        for (int i = 1; i <= mesesConsiderados; i++) {
            System.out.print("> Insira o " + i + "º mês: ");
            String mes = sc.next();
            System.out.print("> Insira a temperatura: ");
            int temperatura = sc.nextInt();
            meses.add(new Meses(mes, temperatura));
        }


        System.out.println("\n===========================\n");

        int somaTemperatura = 0;

        for (Meses a : meses) {
            somaTemperatura += calculo.somarTemperaturas(a.getTemperatura());
        }

        int media = somaTemperatura / meses.size();
        System.out.println("> MEDIA DE TEMPERATURA ANUAL: " + media);

        System.out.println("\n===========================\n");

        System.out.println("=== Temperaturas Maiores que a Media Anual ===\n");

        for (Meses a : meses) {
            if (a.getTemperatura() > media) {
                System.out.println("> Mês de " + a.getMes() + ": " + a.getTemperatura());;
            }
        }

    }

}