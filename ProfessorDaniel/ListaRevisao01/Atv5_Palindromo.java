package ProfessorDaniel.ListaRevisao01;

public class Atv5_Palindromo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palindromo, reverso = "";
        
        System.out.println("> Insira sua palavra: ");
        palindromo = sc.next();

        for (int i = palindromo.length(); i >= 0; i--) {

            reverso = reverso + palindromo.charAt(i);
            
        }

    }
}
