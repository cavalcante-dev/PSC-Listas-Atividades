import java.util.Scanner;

public class Calculos {

    public int somarTemperaturas(int temperatura) {
        int somaTemperatura = 0;
        somaTemperatura += temperatura;
        return somaTemperatura;
    }

    public int validarMes(int mes) {

        Scanner sc = new Scanner(System.in);

        if (mes < 2) {
            do {

                System.out.print("""
                \n======= VALOR INVALIDO - TENTE NOVAMENTE =======
                > Insira quantos meses serão considerados para o calculo (Minimo 2):\s""");
                mes = sc.nextInt();

            } while (mes < 2);
        }

        return mes;

    }

}
