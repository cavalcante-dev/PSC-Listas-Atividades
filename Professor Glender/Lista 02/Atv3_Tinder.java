import java.util.Scanner;

public class Atv3_Tinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int notaAltura, notaBeleza, notaCarisma;
        String nome; 

        System.out.println("\n== Digite o nome da sua pretendente: ==");
        nome = sc.next();

        System.out.println("\n== Nota para a Altura (0 a 10): == ");
        notaAltura = sc.nextInt();
        System.out.println("== Nota para a Beleza (0 a 10): ==");
        notaBeleza = sc.nextInt();
        System.out.println("== Nota para o Carisma (0 a 10): ==");
        notaCarisma = sc.nextInt();

        int conferencia = notaAltura + notaBeleza + notaCarisma;

        if (conferencia < 0 || conferencia > 30) {
            System.out.println("====== Notas digitadas inválidas. ======");
        } else {
            System.out.println(
                "\nNome: " + nome 
                + "\nAltura: " + notaAltura
                + "\nBeleza: " + notaBeleza
                + "\nCarisma: " + notaCarisma 
                + "\n_____________________________________________"
            );

            System.out.println("\n======= Situação final: =======");

            if (notaAltura > 7 && notaBeleza > 7 && notaCarisma > 7) {
                System.out.println("Excelente escolha, qualidades acima da média! \n");
            } else if (notaAltura > 7 && notaBeleza > 7 || notaCarisma > 7 && notaAltura > 7 || notaBeleza > 7 && notaCarisma > 7) {
                System.out.println("Ótima escolha, muitas qualidades! \n");
            } else if (notaAltura < 7 && notaCarisma < 7 && notaBeleza < 7) {
                System.out.println("Péssima escolha, vai pra próxima campeão.\n");
            } else if (notaAltura < 7 || notaCarisma < 7 || notaBeleza < 7) {
                System.out.println("Talves tenham opções melhores, escolha com sabedoria.\n");
            }
        }
        sc.close();
    }
}
