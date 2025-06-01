import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome, sobrenome;
        int idade = 0;
        double altura = 0, peso = 0;

        System.out.println("""
                \n===== CALCULO DE IMC =====
                > Informe os dados do paciente com as seguintes informações:
                    - Nome e sobrenome
                    - Idade
                    - Altura (0,00m)
                    - Peso (0,00Kg)
                > O calculo do IMC e a faixa de massa corporal será informado após
                todos os dados cadastrados.""");

        System.out.println("\n-----------------------------------------\n");

        System.out.print("> Insira o nome do paciente: ");
        nome = sc.next();
        System.out.print("> Insira o sobrenome do paciente: ");
        sobrenome = sc.next();

        Pessoa paciente = new Pessoa(nome, sobrenome);

        System.out.print("> Insira a idade do paciente: ");
        idade = sc.nextInt();
        paciente.setIdade(idade);

        System.out.print("> Insira a altura do paciente: ");
        altura = sc.nextDouble();
        paciente.setAltura(altura);

        System.out.print("> Insira o peso do paciente: ");
        peso = sc.nextDouble();
        paciente.setPeso(peso);

        System.out.println("\n-----------------------------------------\n");

        System.out.printf(
                "====== RESULTADOS =====" +
                "\n> IMC do paciente: %.2f" +
                "\n> Faixa de massa corporal: \n", paciente.calcularIMC());

        paciente.informarObesidade();

        System.out.println("\n-----------------------------------------\n");

        sc.close();

    }
}