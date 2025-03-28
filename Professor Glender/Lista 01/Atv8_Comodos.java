import java.util.Scanner;

public class Atv8_Comodos {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double area1, area2, area3, largura1, comprimento1, largura2, comprimento2, largura3, comprimento3;
        int opcao;

        System.out.println("Quantos cômodos precisam ter sua área calculada? \n1 cômodo, 2 cômodos ou 3 cômodos?");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
            
            System.out.println("Digite a largura em Metros (m): ");
            largura1 = sc.nextDouble();
            System.out.println("Digite o comprimento em Metros (m): ");
            comprimento1 = sc.nextDouble();

            area1 = largura1 * comprimento1;
            System.out.printf("A area do cômodo é: %.2fm²", area1);

                break;
            case 2:
            
            //Comodo 1
            System.out.println("Digite a largura em Metros (m) do primeiro cômodo: ");
            largura1 = sc.nextDouble();
            System.out.println("Digite o comprimento em Metros (m) do primeiro cômodo: ");
            comprimento1 = sc.nextDouble();
            
            //Comodo 2
            System.out.println("Digite a largura em Metros (m) do segundo cômodo: ");
            largura2 = sc.nextDouble();
            System.out.println("Digite o comprimento em Metros (m) do segundo cômodo: ");
            comprimento2 = sc.nextDouble();

            area1 = largura1 * comprimento1;
            area2 = largura2 * comprimento2;

            System.out.printf("A area do primeiro cômodo é: %.2fm² \nA area do segundo cômodo é: %.2fm²", area1, area2);
                
                break;
            case 3:
    

            //Comodo 1
            System.out.println("Digite a largura em Metros (m) do primeiro cômodo: ");
            largura1 = sc.nextDouble();
            System.out.println("Digite o comprimento em Metros (m) do primeiro cômodo: ");
            comprimento1 = sc.nextDouble();
            
            //Comodo 2
            System.out.println("Digite a largura em Metros (m) do segundo cômodo: ");
            largura2 = sc.nextDouble();
            System.out.println("Digite o comprimento em Metros (m) do segundo cômodo: ");
            comprimento2 = sc.nextDouble();

            //Comodo 3
            System.out.println("Digite a largura em Metros (m) do terceiro cômodo: ");
            largura3 = sc.nextDouble();
            System.out.println("Digite o comprimento em Metros (m) do terceiro cômodo: ");
            comprimento3 = sc.nextDouble();

            area1 = largura1 * comprimento1;
            area2 = largura2 * comprimento2;
            area3 = largura3 * comprimento3;

            System.out.printf("A area do primeiro cômodo é: %.2fm² \nA area do segundo cômodo é: %.2fm² \nA area do terceiro cômodo é: %.2fm²", area1, area2, area3);
            
                break;
    
            default:

            System.out.println("Quantidade de cômodos inválida.");

                break;
        }
        
        sc.close();

    }
}