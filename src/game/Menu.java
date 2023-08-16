package game;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import game.util.Cores;
import game.model.Jogos;
import game.model.Console;
import game.model.Pc;
import game.controller.GameController;

public class Menu {
    public static void main(String[] args){
        int op;

        GameController jogos = new GameController();
        Scanner read = new Scanner(System.in);
        jogos.adicionar (new Console("Def Jam", "Luta", 58.99, 15, 2, 1));
        jogos.adicionar(new Console("The Last of Us", "Ação", 89.99, 10, 2, 2));
        jogos.adicionar(new Console("Mario Kart 8", "Corrida", 49.99, 20, 2, 4));
        jogos.adicionar(new Console("Call of Duty", "Tiro", 69.99, 8, 2, 1));
        jogos.adicionar(new Console("FIFA 22", "Esporte", 79.99, 12, 2, 3));
        jogos.adicionar(new Console("Assassin's Creed Valhalla", "Aventura", 74.99, 2, 2, 2));
        jogos.adicionar(new Console("Animal Crossing", "Simulação", 54.99, 18, 2, 4));
        jogos.adicionar(new Console("Resident Evil Village", "Horror", 64.99, 7, 2, 1));
        jogos.adicionar(new Console("The Witcher 3", "RPG", 59.99, 11, 2, 3));
        jogos.adicionar(new Console("Grand Theft Auto V", "Ação", 39.99, 25, 2, 1));
String genero = "Ação";

        List<Jogos> jogosPorGenero = jogos.listarPorGenero(genero);

        for(Jogos jogo : jogosPorGenero){
            jogo.visualizar();
        }


     do{

             System.out.println(Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND);
             System.out.println("    _____                      _   _                   \s");
             System.out.println("   |  __ \\                    | | | |                  \s");
             System.out.println("   | |  \\/ __ _ _ __ ___   ___| | | | ___ _ __ ___  ___\s");
             System.out.println("   | | __ / _` | '_ ` _ \\ / _ \\ | | |/ _ \\ '__/ __|/ _ \\");
             System.out.println("   | |_\\ \\ (_| | | | | | |  __| \\_/ /  __/ |  \\__ \\  __/");
             System.out.println("    \\____/\\__,_|_| |_| |_|\\___|\\___/ \\___|_|  |___/\\___|");
             System.out.println( Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+
                                 "                                                        ");
             System.out.println("  ╔═════════════════════════════════════════════════════╗");
             System.out.println("  ║                 1-Listar todos os jogos             ║");
             System.out.println("  ║                 2-Pesquisar Jogos                   ║");
             System.out.println("  ║                 3-Carrinho                          ║");
             System.out.println("  ║                 4-Sobre                             ║");
             System.out.println("  ║                 0-Sair                              ║");
             System.out.println("  ╚═════════════════════════════════════════════════════╝");
             System.out.print("  Escolha uma opção: " + Cores.TEXT_RESET);

             try {
             op = read.nextInt();
         }catch(InputMismatchException e){
             System.err.println("\nExceção: " + e);
             read.nextLine();
             System.out.println("\nDigite valores inteiros!");
             op = 6;
         }


         switch (op){
             case 1:
                 System.out.println("\n\n\n"+Cores.TEXT_GREEN);
                 System.out.println("╔═══════════════════════╗");
                 System.out.println("║ Listar todos os jogos ║");
                 System.out.println("╚═══════════════════════╝");
                 break;
             case 2:
                 System.out.println("\n\n\n"+Cores.TEXT_GREEN);
                 System.out.println("╔════════════════╗");
                 System.out.println("║ Pesquisar Jogo ║");
                 System.out.println("╚════════════════╝");
                 break;
             case 3:
                 System.out.println("\n\n\n"+Cores.TEXT_GREEN);
                 System.out.println("╔══════════╗");
                 System.out.println("║ Carrinho ║");
                 System.out.println("╚══════════╝");
                 break;
             case 0:
                 System.out.print("\nQuer realmente sair do sistema (s/n)");
                 char sn = read.next().toUpperCase().charAt(0);
                 if (sn == 'N') op=1;
                 break;
             default:
                 System.out.println("\nOpção Inválida!!");
         }
     }while (op!=0);
        System.out.println("\n\nAté a próxima aventura! Lembre-se, o jogo nunca acaba, apenas pausa.\n");
    }

}

