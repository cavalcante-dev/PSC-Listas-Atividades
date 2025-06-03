import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome, sobrenome;
        int dia, mes, ano;
        double altura = 0, peso = 0;
        Pessoa[] pacientes = new Pessoa[10];
        Data data = new Data();

        System.out.println("""
                \n===== CALCULO DE IMC =====
                > Informe os dados do paciente com as seguintes informações:
                    - Nome e sobrenome
                    - Data de Nascimento (00/00/00)
                    - Altura (0,00m)
                    - Peso (0,00Kg)
                > A idade do paciente será calculada automaticamente pelo sistema.    
                > O calculo do IMC e a faixa de massa corporal será informado após
                todos os dados cadastrados.
                > Serão cadastrados 10 paciente. Para cancelar o cadastro insira o nome 
                e sobrenome do paciente anterior.""");

        for (int i = 0; i < pacientes.length; i++) {

            System.out.println("\n-----------------------------------------\n");

            System.out.print("> Insira o nome do paciente: ");
            nome = sc.next();
            System.out.print("> Insira o sobrenome do paciente: ");
            sobrenome = sc.next();

            if (i > 0) {
                if (nome.equalsIgnoreCase(pacientes[i-1].getNome()) && sobrenome.equalsIgnoreCase(pacientes[i-1].getSobrenome())) {
                    break;
                }
            }

            pacientes[i] = new Pessoa(nome, sobrenome);

            System.out.print("> Insira a data de nascimento do paciente: \n");
            System.out.print("  - Dia: ");
            dia = sc.nextInt();
            dia = data.verificarDia(dia);
            System.out.print("  - Mês: ");
            mes = sc.nextInt();
            mes = data.verificarMes(mes);
            System.out.print("  - Ano: ");
            ano = sc.nextInt();

            pacientes[i].setDataNascimento(dia, mes, ano);
            pacientes[i].calcularIdade();

            System.out.print("> Insira a altura do paciente: ");
            altura = sc.nextDouble();
            pacientes[i].setAltura(altura);

            System.out.print("> Insira o peso do paciente: ");
            peso = sc.nextDouble();
            pacientes[i].setPeso(peso);

        }

        System.out.println("\n-----------------------------------------\n");

        System.out.println("====== RESULTADOS =====\n");

        for (int i = 0; i < pacientes.length; i++) {

            if (pacientes[i] == null) {
                break;
            }

            System.out.println(
                    "--- CADASTRO " + (i+1) + " ---" +
                    "\n> Nome Completo: " + pacientes[i].getNome() + " " + pacientes[i].getSobrenome() +
                    "\n> Nome de Referencia: " + pacientes[i].getSobrenome() + ", " + pacientes[i].getNome().toUpperCase() +
                    "\n> Idade: " + pacientes[i].getIdade() +
                    "\n> Peso: " + pacientes[i].getPeso() + "KG" +
                    "\n> Altura: " + pacientes[i].getAltura() + "M");
            System.out.printf("> IMC: %.2f", pacientes[i].calcularIMC());
            System.out.println("\n> Classificação: " + pacientes[i].informarObesidade());

            System.out.println("\n-----------------------------------------\n");
        }

        sc.close();

    }
}