import java.util.ArrayList;
import java.util.List;

public class Suspeito {

    private String nome;
    private String culpa;
    private List<Integer> resposta = new ArrayList<>();
    private int parcelaCulpa;

    public Suspeito(String nome) {
        this.nome = nome;
        culpa = "Inocente";
        parcelaCulpa = 0;
    }

    public String getCulpa() {
        return culpa;
    }

    public void setCulpa(String culpa) {
        this.culpa = culpa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getResposta() {
        return new ArrayList<>(resposta);
    }

    public void setResposta(int resposta) {
        this.resposta.add(resposta);
    }

    public int getParcelaCulpa() {
        return parcelaCulpa;
    }

    public void setParcelaCulpa(int parcelaCulpa) {
        this.parcelaCulpa = parcelaCulpa;
    }

}
