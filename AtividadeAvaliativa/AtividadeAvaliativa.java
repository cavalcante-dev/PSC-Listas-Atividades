/* 
 * AUTORES: 
 * - LEANDRO CAVALCANTE RODRIGUES (325122860)
 * - MIGUEL ALCHAAR GOMES (325122974)
*/

package AtividadeAvaliativa;
import java.util.Scanner;

public class AtividadeAvaliativa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Iniciando variaveis que serão usuadas em todo o código. 

        String[][] rodada1 = {{"A", "C", "E", "G", "I", "K", "M", "O"}, {"B", "D", "F", "H", "J", "L", "N", "P"}};
        String[][] rodada2 = new String[2][4];
        String[][] rodada3 = new String[2][2];
        String[][] rodada4 = new String[2][1];
        String[] vencedorRodada = new String[8];
        String vencedorFinal = "";
        int[][] gols = new int[8][8];
        int Ex = 0; //Contador Externo (Variaveis "In" - se configuram como Contador Interno)
        boolean erro = true; //Variavel para aplicação de erro. 


        System.out.println("=== OITAVAS DE FINAL ===");
    
        //Resultados rodada 1.

        for (int In = 0; In < 8; In++) {
            System.out.println("\n=== Insira o placar do " + (In+1) + "º jogo ===");
            System.out.print("> TIME " + rodada1[Ex][In] + " = ");
            gols[Ex][In] = sc.nextInt();

            // Condição de validação do valor de GOL (Entre 0 a 20)
            if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                while (erro = true) {
                    System.out.println("== Placar Invalido - Tente Novamente ==");
                    System.out.print("> TIME " + rodada1[Ex][In] + " = ");
                    gols[Ex][In] = sc.nextInt();
                    if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                        break;
                    }
                }   
            }

            System.out.print("> TIME " + rodada1[(Ex + 1)][In] + " = ");
            gols[(Ex + 1)][In] = sc.nextInt();

            if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                while (erro = true) {
                    System.out.println("== Placar Invalido - Tente Novamente ==");
                    System.out.print("> TIME " + rodada1[(Ex + 1)][In] + " = ");
                    gols[(Ex + 1)][In] = sc.nextInt();
                    if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                        break;
                    }
                }   
            }

            //Validação novamente caso o usuario insira um empate na rodada (Repete o laço até o valor estar correto)

            if (gols[(Ex + 1)][In] == gols[Ex][In]) {

                while (erro == true) {
                    System.out.println("\n=== EMPATE INVALIDO - Insira o placar do " + (In+1) + "º jogo novamente ===");
                    System.out.print("> TIME " + rodada1[Ex][In] + " = ");
                    gols[Ex][In] = sc.nextInt();

                    // Condição de validação do valor de GOL (Entre 0 a 20)
                    if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                        while (erro = true) {
                            System.out.println("== Placar Invalido - Tente Novamente ==");
                            System.out.print("> TIME " + rodada1[Ex][In] + " = ");
                            gols[Ex][In] = sc.nextInt();
                            if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                                break;
                            }
                        }   
                    }

                    System.out.print("> TIME " + rodada1[(Ex + 1)][In] + " = ");
                    gols[(Ex + 1)][In] = sc.nextInt();

                    if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                        while (erro = true) {
                            System.out.println("== Placar Invalido - Tente Novamente ==");
                            System.out.print("> TIME " + rodada1[Ex][In] + " = ");
                            gols[(Ex + 1)][In] = sc.nextInt();
                            if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                                break;
                            }
                        }   
                    }

                    if (gols[(Ex + 1)][In] != gols[Ex][In]) {
                        break;
                    }
                }
            }

            // TESTE DE RODADA - System.out.println("\nRESULTADO: \n" + "> " + rodada1[Ex][In] + " = " + gols[Ex][In] + "\n> " + rodada1[(Ex + 1)][In] + " = " + gols[(Ex + 1)][In]);

            if (gols[Ex][In] > gols[(Ex + 1)][In]) {
                vencedorRodada[In] = rodada1[Ex][In]; 
            } else if (gols[Ex][In] < gols[(Ex + 1)][In]) {
                vencedorRodada[In] = rodada1[(Ex + 1)][In]; 
            }   

            System.out.println("> Vencendor da Rodada: " + vencedorRodada[In]);

        } 
        

        // ARMAZENA VENCEDORES EM NOVA TABELA DE RODADA
        // System.out.println("\n-------------------\n");

        for (int In = 0; In < rodada2[Ex].length; In++) {
            rodada2[Ex][In] = vencedorRodada[In];
            // System.out.println(rodada2[Ex][In]);
        }

        System.out.println("\n-------------------\n");
        
        for (int In = 0; In < rodada2[(Ex + 1)].length; In++) {
            rodada2[(Ex + 1)][In] = vencedorRodada[(In + 4)];
            // System.out.println(rodada2[(Ex + 1)][In]);
        }

        //Resultados rodada 2

        System.out.println("\n=== QUARTAS DE FINAL ===");
        
        for (int In = 0; In < 4; In++) {
            System.out.println("\n=== Insira o placar do " + (In+1) + "º jogo ===");
            System.out.print("> TIME " + rodada2[Ex][In] + " = ");
            gols[Ex][In] = sc.nextInt();

            // Condição de validação do valor de GOL (Entre 0 a 20)
            if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                while (erro = true) {
                    System.out.println("== Placar Invalido - Tente Novamente ==");
                    System.out.print("> TIME " + rodada2[Ex][In] + " = ");
                    gols[Ex][In] = sc.nextInt();
                    if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                        break;
                    }
                }   
            }

            System.out.print("> TIME " + rodada2[(Ex + 1)][In] + " = ");
            gols[(Ex + 1)][In] = sc.nextInt();

            if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                while (erro = true) {
                    System.out.println("== Placar Invalido - Tente Novamente ==");
                    System.out.print("> TIME " + rodada2[(Ex + 1)][In] + " = ");
                    gols[(Ex + 1)][In] = sc.nextInt();
                    if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                        break;
                    }
                }   
            }

            //Validação novamente caso o usuario insira um empate na rodada (Repete o laço até o valor estar correto)

            if (gols[(Ex + 1)][In] == gols[Ex][In]) {

                while (erro == true) {
                    System.out.println("\n=== EMPATE INVALIDO - Insira o placar do " + (In+1) + "º jogo novamente ===");
                    System.out.print("> TIME " + rodada2[Ex][In] + " = ");
                    gols[Ex][In] = sc.nextInt();

                    // Condição de validação do valor de GOL (Entre 0 a 20)
                    if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                        while (erro = true) {
                            System.out.println("== Placar Invalido - Tente Novamente ==");
                            System.out.print("> TIME " + rodada2[Ex][In] + " = ");
                            gols[Ex][In] = sc.nextInt();
                            if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                                break;
                            }
                        }   
                    }

                    System.out.print("> TIME " + rodada2[(Ex + 1)][In] + " = ");
                    gols[(Ex + 1)][In] = sc.nextInt();

                    if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                        while (erro = true) {
                            System.out.println("== Placar Invalido - Tente Novamente ==");
                            System.out.print("> TIME " + rodada2[Ex][In] + " = ");
                            gols[(Ex + 1)][In] = sc.nextInt();
                            if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                                break;
                            }
                        }   
                    }

                    if (gols[(Ex + 1)][In] != gols[Ex][In]) {
                        break;
                    }
                }
            }

            // TESTE DE RODADA - System.out.println("\nRESULTADO: \n" + "> " + rodada1[Ex][In] + " = " + gols[Ex][In] + "\n> " + rodada1[(Ex + 1)][In] + " = " + gols[(Ex + 1)][In]);

            if (gols[Ex][In] > gols[(Ex + 1)][In]) {
                vencedorRodada[In] = rodada2[Ex][In]; 
            } else if (gols[Ex][In] < gols[(Ex + 1)][In]) {
                vencedorRodada[In] = rodada2[(Ex + 1)][In]; 
            }   

            System.out.println("> Vencendor da Rodada: " + vencedorRodada[In]);
        }

        System.out.println("\n-------------------\n");

        for (int In = 0; In < rodada3[Ex].length; In++) {
            rodada3[Ex][In] = vencedorRodada[In];
            // System.out.println(rodada3[Ex][In]);
        }

        // System.out.println("\n-------------------\n");
        
        for (int In = 0; In < rodada3[(Ex + 1)].length; In++) {
            rodada3[(Ex + 1)][In] = vencedorRodada[(In + 2)];
            // System.out.println(rodada3[(Ex + 1)][In]);
        }

        
        //Resultados rodada 3

        System.out.println("=== SEMI FINAL ===");
        
        for (int In = 0; In < 2; In++) {
            System.out.println("\n=== Insira o placar do " + (In+1) + "º jogo ===");
            System.out.print("> TIME " + rodada3[Ex][In] + " = ");
            gols[Ex][In] = sc.nextInt();

            // Condição de validação do valor de GOL (Entre 0 a 20)
            if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                while (erro = true) {
                    System.out.println("== Placar Invalido - Tente Novamente ==");
                    System.out.print("> TIME " + rodada3[Ex][In] + " = ");
                    gols[Ex][In] = sc.nextInt();
                    if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                        break;
                    }
                }   
            }

            System.out.print("> TIME " + rodada3[(Ex + 1)][In] + " = ");
            gols[(Ex + 1)][In] = sc.nextInt();

            if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                while (erro = true) {
                    System.out.println("== Placar Invalido - Tente Novamente ==");
                    System.out.print("> TIME " + rodada3[(Ex + 1)][In] + " = ");
                    gols[(Ex + 1)][In] = sc.nextInt();
                    if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                        break;
                    }
                }   
            }

            //Validação novamente caso o usuario insira um empate na rodada (Repete o laço até o valor estar correto)

            if (gols[(Ex + 1)][In] == gols[Ex][In]) {

                while (erro == true) {
                    System.out.println("\n=== EMPATE INVALIDO - Insira o placar do " + (In+1) + "º jogo novamente ===");
                    System.out.print("> TIME " + rodada3[Ex][In] + " = ");
                    gols[Ex][In] = sc.nextInt();

                    // Condição de validação do valor de GOL (Entre 0 a 20)
                    if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                        while (erro = true) {
                            System.out.println("== Placar Invalido - Tente Novamente ==");
                            System.out.print("> TIME " + rodada3[Ex][In] + " = ");
                            gols[Ex][In] = sc.nextInt();
                            if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                                break;
                            }
                        }   
                    }

                    System.out.print("> TIME " + rodada3[(Ex + 1)][In] + " = ");
                    gols[(Ex + 1)][In] = sc.nextInt();

                    if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                        while (erro = true) {
                            System.out.println("== Placar Invalido - Tente Novamente ==");
                            System.out.print("> TIME " + rodada3[Ex][In] + " = ");
                            gols[(Ex + 1)][In] = sc.nextInt();
                            if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                                break;
                            }
                        }   
                    }

                    if (gols[(Ex + 1)][In] != gols[Ex][In]) {
                        break;
                    }
                }
            }

            // TESTE DE RODADA - System.out.println("\nRESULTADO: \n" + "> " + rodada1[Ex][In] + " = " + gols[Ex][In] + "\n> " + rodada1[(Ex + 1)][In] + " = " + gols[(Ex + 1)][In]);

            if (gols[Ex][In] > gols[(Ex + 1)][In]) {
                vencedorRodada[In] = rodada3[Ex][In]; 
            } else if (gols[Ex][In] < gols[(Ex + 1)][In]) {
                vencedorRodada[In] = rodada3[(Ex + 1)][In]; 
            }   

            System.out.println("> Vencendor da Rodada: " + vencedorRodada[In]);
        }

        System.out.println("\n-------------------\n");

        for (int In = 0; In < rodada4[Ex].length; In++) {
            rodada4[Ex][In] = vencedorRodada[In];
            // System.out.println(rodada4[Ex][In]);
        }

        // System.out.println("\n-------------------\n");
        
        for (int In = 0; In < rodada4[(Ex + 1)].length; In++) {
            rodada4[(Ex + 1)][In] = vencedorRodada[(In+1)];
            // System.out.println(rodada4[(Ex + 1)][In]);
        }

    //Resultados rodada 4

            System.out.println("=== FINAL ===");
            
            for (int In = 0; In < 1; In++) {
                System.out.println("\n=== Insira o placar do " + (In+1) + "º jogo ===");
                System.out.print("> TIME " + rodada4[Ex][In] + " = ");
                gols[Ex][In] = sc.nextInt();

                // Condição de validação do valor de GOL (Entre 0 a 20)
                if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                    while (erro = true) {
                        System.out.println("== Placar Invalido - Tente Novamente ==");
                        System.out.print("> TIME " + rodada4[Ex][In] + " = ");
                        gols[Ex][In] = sc.nextInt();
                        if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                            break;
                        }
                    }   
                }

                System.out.print("> TIME " + rodada4[(Ex + 1)][In] + " = ");
                gols[(Ex + 1)][In] = sc.nextInt();

                if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                    while (erro = true) {
                        System.out.println("== Placar Invalido - Tente Novamente ==");
                        System.out.print("> TIME " + rodada4[(Ex + 1)][In] + " = ");
                        gols[(Ex + 1)][In] = sc.nextInt();
                        if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                            break;
                        }
                    }   
                }

                //Validação novamente caso o usuario insira um empate na rodada (Repete o laço até o valor estar correto)

                if (gols[(Ex + 1)][In] == gols[Ex][In]) {

                    while (erro == true) {
                        System.out.println("\n=== EMPATE INVALIDO - Insira o placar do " + (In+1) + "º jogo novamente ===");
                        System.out.print("> TIME " + rodada4[Ex][In] + " = ");
                        gols[Ex][In] = sc.nextInt();

                        // Condição de validação do valor de GOL (Entre 0 a 20)
                        if (gols[Ex][In] < 0 || gols[Ex][In] > 20) {
                            while (erro = true) {
                                System.out.println("== Placar Invalido - Tente Novamente ==");
                                System.out.print("> TIME " + rodada4[Ex][In] + " = ");
                                gols[Ex][In] = sc.nextInt();
                                if (gols[Ex][In] >= 0 && gols[Ex][In] <= 20) {
                                    break;
                                }
                            }   
                        }

                        System.out.print("> TIME " + rodada4[(Ex + 1)][In] + " = ");
                        gols[(Ex + 1)][In] = sc.nextInt();

                        if (gols[(Ex + 1)][In] < 0 || gols[(Ex + 1)][In] > 20) {
                            while (erro = true) {
                                System.out.println("== Placar Invalido - Tente Novamente ==");
                                System.out.print("> TIME " + rodada4[Ex][In] + " = ");
                                gols[(Ex + 1)][In] = sc.nextInt();
                                if (gols[(Ex + 1)][In] >= 0 && gols[(Ex + 1)][In] <= 20) {
                                    break;
                                }
                            }   
                        }

                        if (gols[(Ex + 1)][In] != gols[Ex][In]) {
                            break;
                        }
                    }
                }

                // TESTE DE RODADA - System.out.println("\nRESULTADO: \n" + "> " + rodada1[Ex][In] + " = " + gols[Ex][In] + "\n> " + rodada1[(Ex + 1)][In] + " = " + gols[(Ex + 1)][In]);

                if (gols[Ex][In] > gols[(Ex + 1)][In]) {
                    vencedorFinal = rodada4[Ex][In]; 
                } else if (gols[Ex][In] < gols[(Ex + 1)][In]) {
                    vencedorFinal = rodada4[(Ex + 1)][In]; 
                }   
            }

            System.out.println("\n---------------------------------------------\n");
            System.out.println("=== VENCENDOR DO CAMPEONATO " + vencedorFinal + " ===\n");

            sc.close();

    }
}