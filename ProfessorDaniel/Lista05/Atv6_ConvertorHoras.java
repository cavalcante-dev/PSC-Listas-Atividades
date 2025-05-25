import java.util.Scanner;

public class Atv6_ConvertorHoras {
   public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int horas, minutos;
        boolean encerramento = true;
        String condicao;

        do {
            
            System.out.println("\n==== Convertor de horas - 24hrs para AM/PM ====");

            System.out.print("> Digite as horas: ");
            horas = sc.nextInt();
            horas = verificarHora(horas);

            System.out.print("> Digite os minutos: ");
            minutos = sc.nextInt();
            minutos = verificarMinutos(minutos);

            int horasConvertidas = converterHoras(horas);
            char AMPM = retornarAMPM(horas);

            System.out.println("\n> HORARIO CONVERTIDO: " + horasConvertidas + ":" + minutos + " " + AMPM + "M");
            
            System.out.println("\n-----------------------------------------\n");

            System.out.println("""
                > Desejar realizar outra operação?
                > SIM
                > NÃO""");
            condicao = sc.next();

            encerramento = encerrarOperacao(condicao);

        } while (encerramento);
    
   } 
   
   public static int converterHoras(int horas) {
    
        int [] referencia = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int [] horasAMPM = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        if (horas > 12) {

            for (int i = 0; i < 12; i++) {
                if (horas == referencia[i]) {
                    horas = horasAMPM[i];
                }
            }
            return horas;

        } else {
            return horas;
        }

   }

   public static char retornarAMPM(int horas) {

        char AMPM; 

        if (horas < 12) {
            AMPM = 'A';
            return AMPM; 
        } else {
            AMPM = 'P';
            return AMPM;
        }

   }

   public static boolean encerrarOperacao(String condicao) {
    
        if (condicao.equalsIgnoreCase("sim")) {
            return true;
        } else if (condicao.equalsIgnoreCase("não") || condicao.equalsIgnoreCase("nao")) {
            return false;
        } else {
             return true;
        }

   }

   public static int verificarHora(int horas) {
        
        Scanner sc = new Scanner(System.in);

        if ((horas > 24 || horas < 0)) {    
            while (horas > 24 || horas < 0) {
                System.out.println("==== HORA INVALIDA - TENTE NOVAMENTE ====");
                System.out.print("> Digite as horas: ");
                horas = sc.nextInt();
            }
        }
        return horas;

   }

   
   public static int verificarMinutos(int minutos) {
        
        Scanner sc = new Scanner(System.in);

        if ((minutos > 59 || minutos < 0)) {    
            while (minutos > 59 || minutos < 0) {
                System.out.println("==== MINUTO INVALIDO - TENTE NOVAMENTE ====");
                System.out.print("> Digite os minutos: ");
                minutos = sc.nextInt();
            }
        }
        return minutos;

   }

}
