import java.util.ArrayList;
import java.util.List;

public class Calculos {

    private double novePorCento = 9.0 / 100.0;

    public void calcularComissao(List<Vendedores> listaVendedores) {

        for (Vendedores vendedor : listaVendedores) {
            double salarioFinal = vendedor.getSalario() + (vendedor.getComissao() * this.novePorCento);
            vendedor.setSalario(salarioFinal);
        }

    }

    public List<Integer> checarSalario(List<Vendedores> listaVendedores) {

        List<Integer> faixaSalario = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            faixaSalario.add(0);
        }

        for (Vendedores vendedor : listaVendedores) {
            int contador = 0;
            if (vendedor.getSalario() >= 200 && vendedor.getSalario() <= 299) {
                contador = faixaSalario.get(0);
                contador++;
                faixaSalario.remove(0);
                faixaSalario.add(0, contador);
            } else if (vendedor.getSalario() >= 300 && vendedor.getSalario() <= 399) {
                contador = faixaSalario.get(1);
                contador++;
                faixaSalario.remove(1);
                faixaSalario.add(1, contador);
            } else if (vendedor.getSalario() >= 400 && vendedor.getSalario() <= 499) {
                contador = faixaSalario.get(2);
                contador++;
                faixaSalario.remove(2);
                faixaSalario.add(2, contador);
            } else if (vendedor.getSalario() >= 500 && vendedor.getSalario() <= 599) {
                contador = faixaSalario.get(3);
                contador++;
                faixaSalario.remove(3);
                faixaSalario.add(3, contador);
            } else if (vendedor.getSalario() >= 600 && vendedor.getSalario() <= 699) {
                contador = faixaSalario.get(4);
                contador++;
                faixaSalario.remove(4);
                faixaSalario.add(4, contador);
            } else if (vendedor.getSalario() >= 700 && vendedor.getSalario() <= 799) {
                contador = faixaSalario.get(5);
                contador++;
                faixaSalario.remove(5);
                faixaSalario.add(5, contador);
            } else if (vendedor.getSalario() >= 800 && vendedor.getSalario() <= 899) {
                contador = faixaSalario.get(6);
                contador++;
                faixaSalario.remove(6);
                faixaSalario.add(6, contador);
            } else if (vendedor.getSalario() >= 900 && vendedor.getSalario() <= 999) {
                contador = faixaSalario.get(7);
                contador++;
                faixaSalario.remove(7);
                faixaSalario.add(7, contador);
            } else if (vendedor.getSalario() >= 1000) {
                contador = faixaSalario.get(8);
                contador++;
                faixaSalario.remove(8);
                faixaSalario.add(8, contador);
            }
        }

        return faixaSalario;

    }

}
