import java.util.Scanner;

public class Atv3_Segundos {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        int bissexto, anos, diasFinal, anosDias, bissextoDias, segundosAno;

        System.out.println("Digite uma quantidade de anos para o calculo dos segundos: ");
        anos = scan.nextInt();

        // Linhas de código para se considerar anos bissextos. 
        anosDias = anos * 365;
        bissexto = anos % 3;

        for (bissextoDias = 0; bissexto != 0;) {
            bissextoDias += 1;
            bissexto %= anos / 3;
        }

        diasFinal = anosDias + bissextoDias;
        segundosAno = 60 * 60 * 24 * diasFinal;

        System.out.println("Exitem " + diasFinal + " dias e " + segundosAno + " segundos em " + anos + " anos." );

        scan.close();

    }

}
