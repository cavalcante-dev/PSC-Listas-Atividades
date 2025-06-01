public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = nome;
        this.altura = 0;
        this.peso = 0;
        this.imc = 0;
    }

    public double calcularIMC() {
        this.imc = this.peso / (this.altura * 2);
        return this.imc;
    }

    public void informarObesidade() {
        if (this.imc < 18.5) {
            System.out.println("  > Abaixo do peso");
        } else if (this.imc >= 18.5 && this.imc <= 24.9) {
            System.out.println("  > Peso normal");
        } else if (this.imc >= 25 && this.imc <= 29.9) {
            System.out.println("  > Sobrepeso");
        } else if (this.imc >= 30 && this.imc <= 34.9) {
            System.out.println("  > Obesidade: Grau 1");
        } else if (this.imc >= 35 && this.imc <= 39.9) {
            System.out.println("  > Obesidade: Grau 2");
        } else if (this.imc > 40) {
            System.out.println("  > Obesidade: Grau 3");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
