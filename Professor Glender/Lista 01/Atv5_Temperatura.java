import java.util.Scanner;

public class Atv5_Temperatura {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double celcius, farenheit; 

        System.out.println("Digite a temperatura em Celcius (°C): ");
        celcius = sc.nextDouble();

        farenheit = 1.8 * celcius + 32;

        System.out.printf("A temperatura em Fahrenheit (F) é: %.0fF", farenheit);

        sc.close();

    }

}