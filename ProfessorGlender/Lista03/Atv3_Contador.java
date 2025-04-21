package ProfessorGlender.Lista03;

public class Atv3_Contador {
    public static void main(String[] args) {

        for (int contador = 233; contador < 456;) {
            if (contador > 300 && contador < 400) {
                System.out.println(contador);
                contador += 3;
                //System.out.println("Teste Verdadeiro");        
            } else {
                System.out.println(contador);
                contador += 5;
            }
        }
        
    }
}