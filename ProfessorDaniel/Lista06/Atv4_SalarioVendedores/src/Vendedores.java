public class Vendedores {

    private String nome;
    private double salario;
    private double comissao;

    public Vendedores(String nome) {
        this.nome = nome;
        this.salario = 200;
        this.comissao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
