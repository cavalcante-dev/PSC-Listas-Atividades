import java.util.List;
import java.util.Scanner;

public class Tribunal extends Main{

    private List<Suspeito> listaSuspeitos;

    public Tribunal() {
        this.listaSuspeitos = null;
    }

    public Tribunal(List<Suspeito> listaSuspeitos) {
        this.listaSuspeitos = listaSuspeitos;
    }


    public void printRespostas() {

        for (Suspeito s : listaSuspeitos) {
            System.out.println("\n> Suspeito " + s.getNome());
            for (int i = 0; i < s.getResposta().size(); i++) {
                System.out.println("> Resposta da " + (i+1) + "ª pergunta: " + s.getResposta().get(i));
            }
        }

    }

    public int validarResposta(int resposta) {

        Scanner sc = new Scanner(System.in);

        if (!(resposta == 1 || resposta == 2)) {
            do {
                System.out.print("> RESPOSTA INVÁLIDA - INSIRA NOVAMENTE: ");
                resposta = sc.nextInt();
            } while (!(resposta == 1 || resposta == 2));
        }

        return resposta;

    }

    public void definirCulpa() {

        int parcelaCulpa = 0;

        for (Suspeito s : listaSuspeitos) {

            parcelaCulpa = 0;

            for (int i = 0; i < s.getResposta().size(); i++) {
                if (s.getResposta().get(i) == 1) {
                    parcelaCulpa++;
                }
            }

            s.setParcelaCulpa(parcelaCulpa);

            if (s.getParcelaCulpa() == 2) {
                s.setCulpa("Suspeita");
            } else if (s.getParcelaCulpa() == 3 || s.getParcelaCulpa() == 4) {
                s.setCulpa("Cúmplice");
            } else if (s.getParcelaCulpa() == 5) {
                s.setCulpa("Assassino");
            }

        }

    }

    public void definirJulgamento() {

        System.out.println("==== RESULTADOS DO JULGAMENTO ====\n");

        for (Suspeito s : listaSuspeitos) {
            System.out.println("> Suspeito: " + s.getNome());
            System.out.println("== DECLARADO " + s.getCulpa() + " ==\n");
        }

    }


}
