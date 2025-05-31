import java.util.ArrayList;
import java.util.List;

public class Valores {

    private List<Double> listaValores = new ArrayList<>();
    private double somaValores = 0;
    private double media = 0;

    public List<Double> inverterValores() {
        List<Double> valoresInvertidos = this.listaValores;
        valoresInvertidos = valoresInvertidos.reversed();
        return valoresInvertidos;
    }

    public double somaValores() {
        double somaValores = 0;

        for (Double listaValores : this.listaValores) {
            somaValores += listaValores;
        }

        this.somaValores = somaValores;

        return somaValores;
    }

    public double calcularMedia() {
        double media;

        media = this.somaValores / listaValores.size();

        this.media = media;

        return media;
    }

    public List<Double> getAcimaMedia() {
        List<Double> valoresAcimaMedia = new ArrayList<>();

        for (int i = 0; i < this.listaValores.size(); i++) {
            if (this.listaValores.get(i) > this.media) {
                valoresAcimaMedia.add(this.listaValores.get(i));
            }
        }
        return valoresAcimaMedia;
    }

    public List<Double> getMenorSete() {
        List<Double> valoresMenorSete = new ArrayList<>();

        for (int i = 0; i < this.listaValores.size(); i++) {
            if (this.listaValores.get(i) < 7) {
                valoresMenorSete.add(this.listaValores.get(i));
            }
        }

        return new ArrayList<>(valoresMenorSete);
    }

    public double getSomaValores() {
        return somaValores;
    }

    public void setSomaValores(double somaValores) {
        this.somaValores = somaValores;
    }

    public void setlistaValores(double valor) {
        this.listaValores.add(valor);
    }

    public List<Double> getlistaValores() {
        return listaValores;
    }

}
