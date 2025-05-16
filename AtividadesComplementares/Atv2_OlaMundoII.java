package AtividadesComplementares;

public class Atv2_OlaMundoII {

    public static void main(String[] args) {
        olaMundo("Olá ", "Mundo");
    }

    public static void olaMundo(String palavra1, String palavra2) {
        for (int i = 0; i < 3; i++) {
            System.out.println(palavra1 + palavra2);
        }
    }

}