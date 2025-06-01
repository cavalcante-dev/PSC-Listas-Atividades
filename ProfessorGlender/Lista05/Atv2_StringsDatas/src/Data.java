import java.util.Scanner;

public class Data {

    Scanner sc = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){}

    public int verificarDia(int dia) {

        if (dia > 31 || dia < 0) {
            do {
                System.out.print("  >> DIA INVALIDO - INSIRA NOVAMENTE: ");
                dia = sc.nextInt();
            } while (dia > 31 || dia < 0);
        }

        return dia;
    }


    public int verificarMes(int mes) {

        if (mes > 12 || mes < 0) {
            do {
                System.out.print("  >> MÊS INVALIDO - INSIRA NOVAMENTE: ");
                mes = sc.nextInt();
            } while (mes > 12 || mes < 0);
        }

        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
