package game;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import game.util.Cores;
import game.model.Jogos;
import game.model.Console;
import game.model.Carrinho;
import game.model.Pc;
import game.controller.GameController;

public class Menu {
    public static void main(String[] args){
        int op,plat,console;
        String nome = "FIFA 22",nome1,genero;
        char sn;

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
        jogos.adicionar(new Console("DarkSouls 2", "RPG", 59.99, 11, 2, 3));
        jogos.adicionar(new Console("Grand Theft Auto V", "Ação", 39.99, 25, 2, 1));
        jogos.adicionar(new Pc("Cyberpunk 2077", "RPG", 49.99, 10, 1, 1));
        jogos.adicionar(new Pc("The Sims 4", "Simulação", 39.99, 15, 1, 3));
        jogos.adicionar(new Pc("Diablo III", "RPG", 29.99, 8, 1, 2));
        jogos.adicionar(new Pc("World of Warcraft", "MMORPG", 14.99, 5, 1, 1));
        jogos.adicionar(new Pc("Civilization VI", "Estratégia", 44.99, 12, 1, 3));
        jogos.adicionar(new Pc("Stardew Valley", "Simulação", 19.99, 20, 1, 4));
        jogos.adicionar(new Pc("The Witcher 3", "RPG", 49.99, 11, 1, 1));
        jogos.adicionar(new Pc("Portal 2", "Puzzle", 9.99, 7, 1, 2));
        jogos.adicionar(new Pc("Counter-Strike", "Tiro", 0.00, 2, 1, 1));
        jogos.adicionar(new Pc("Cities: Skylines", "Simulação", 29.99, 15, 1, 3));
        jogos.adicionar(new Pc("DOOM Eternal", "Ação", 39.99, 6, 1, 2));
        jogos.adicionar(new Pc("Sid Meier's Civilization V", "Estratégia", 29.99, 9, 1, 4));


        jogos.adicionarJogo(nome);




     do{


             System.out.println("  "+Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND+"  _____                      _   _                   \s "+Cores.TEXT_RESET );
             System.out.println("  "+Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND+" |  __ \\                    | | | |                  \s "+Cores.TEXT_RESET);
             System.out.println("  "+Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND+" | |  \\/ __ _ _ __ ___   ___| | | | ___ _ __ ___  ___\s "+Cores.TEXT_RESET);
             System.out.println("  "+Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND+" | | __ / _` | '_ ` _ \\ / _ \\ | | |/ _ \\ '__/ __|/ _ \\ "+Cores.TEXT_RESET);
             System.out.println("  "+Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND+" | |_\\ \\ (_| | | | | | |  __| \\_/ /  __/ |  \\__ \\  __/ "+Cores.TEXT_RESET);
             System.out.println("  "+Cores.TEXT_BLACK + Cores.ANSI_GREEN_BACKGROUND+"  \\____/\\__,_|_| |_| |_|\\___|\\___/ \\___|_|  |___/\\___| "+Cores.TEXT_RESET);
             System.out.print(  Cores.TEXT_GREEN);
             System.out.println("  ╔════════════════════════════════════════════════════╗");
             System.out.println("  ║                 1-Lista todos os jogos             ║");
             System.out.println("  ║                 2-Pesquisar Jogos                  ║");
             System.out.println("  ║                 3-Carrinho                         ║");
             System.out.println("  ║                 0-Sair                             ║");
             System.out.println("  ╚════════════════════════════════════════════════════╝");
             System.out.print("  Escolha uma opção: " +Cores.TEXT_RESET);
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
                 System.out.println("\t\t\t╔══════════════════════╗");
                 System.out.println("\t\t\t║ Lista todos os jogos ║");
                 System.out.println("\t\t\t╚══════════════════════╝");
                 System.out.println(Cores.TEXT_GREEN + "\n\n\t\t╔═════════════════╗");
                 System.out.println("\t\t║ Dados dos Jogos ║");
                 System.out.println("\t\t╚═════════════════╝");
                 jogos.todosJogos();
                 System.out.print("\nQuer comprar algum desses jogos? (s/n)");
                  sn = read.next().toUpperCase().charAt(0);

                 if (sn == 'S') {
                     System.out.println(" Digite o nome do jogo: ");
                     read.nextLine();
                     nome1 = read.nextLine();
                     jogos.adicionarJogo(nome1);
                 }
                 keyPress();
                 break;
             case 2:

                 do{
                     System.out.println("\n\n\n"+Cores.TEXT_GREEN);
                     System.out.println("\t\t\t\t\t╔════════════════╗");
                     System.out.println("\t\t\t\t\t║ Pesquisar Jogo ║");
                     System.out.println("\t\t\t\t\t╚════════════════╝");
                     System.out.println("  ╔════════════════════════════════════════════════════╗");
                     System.out.println("  ║                 1-Pequisar por nome                ║");
                     System.out.println("  ║                 2-Lista por Genero                 ║");
                     System.out.println("  ║                 3-Lista por Plataforma             ║");
                     System.out.println("  ║                 4-Voltar                           ║");
                     System.out.println("  ╚════════════════════════════════════════════════════╝");
                     System.out.print("  Escolha uma opção: " );
                     try {
                         op = read.nextInt();
                     }catch(InputMismatchException e){
                         System.err.println("\nExceção: " + e);
                         read.nextLine();
                         System.out.println("\nDigite valores inteiros!");
                         op = 6;
                     }
                     switch (op){
                         case 1 -> {
                             System.out.println("\t\t╔═════════════════════╗");
                             System.out.println("\t\t║  Pequisar por nome  ║");
                             System.out.println("\t\t╚═════════════════════╝");
                             System.out.println("  Entre com o nome do jogo: ");
                             read.nextLine();
                              nome1 = read.nextLine();

                             jogos.procurarPorNome(nome1);

                             System.out.print("\n\tQuer comprar esse jogo? (s/n)");
                             sn = read.next().toUpperCase().charAt(0);

                             if (sn == 'S')
                                 jogos.adicionarJogo(nome1);


                             keyPress();

                         }
                         case 2 -> {
                             System.out.println("\n\t\t╔════════════════════╗");
                             System.out.println("\t\t║  Lista por Genêro  ║");
                             System.out.println("\t\t╚════════════════════╝");
                             System.out.println("  Entre com o genêro do jogo: ");
                             read.nextLine();
                             genero = read.nextLine();

                             System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                             System.out.println("\t\t║ Dados dos Jogos ║");
                             System.out.println("\t\t╚═════════════════╝");
                             List<Jogos> jogosPorGenero = jogos.listarPorGenero(genero);
                             for(Jogos jogo : jogosPorGenero){
                                 jogo.visualizar();
                             }

                             System.out.print("\nQuer comprar algum desses jogos? (s/n)");
                              sn = read.next().toUpperCase().charAt(0);

                             if (sn == 'S') {
                                 System.out.println(" Digite o nome do jogo: ");
                                  read.nextLine();
                                  nome1 = read.nextLine();
                                  jogos.adicionarJogo(nome1);
                             }


                             keyPress();

                         }
                         case 3 -> {
                             System.out.println("\n\t╔════════════════════════╗");
                             System.out.println("\t║  Lista por Plataforma  ║");
                             System.out.println("\t╚════════════════════════╝");
                             System.out.println("  \t╔═══════════════════════╗");
                             System.out.println("  \t║       1-PC            ║");
                             System.out.println("  \t║       2-Console       ║");
                             System.out.println("  \t╚═══════════════════════╝");
                             System.out.print("  \tEscolha uma opção: " );
                             try {
                                 plat = read.nextInt();
                             }catch(InputMismatchException e){
                                 System.err.println("\nExceção: " + e);
                                 read.nextLine();
                                 System.out.println("\nDigite valores inteiros!");
                                 plat = 3;
                             }
                             switch (plat){
                                 case 1 -> {
                                     System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                                     System.out.println("\t\t║ Dados dos Jogos ║");
                                     System.out.println("\t\t╚═════════════════╝");
                                     List<Jogos> jogosPorPlataforma = jogos.listarPorPlataforma(1);
                                     for(Jogos jogo : jogosPorPlataforma){
                                         jogo.visualizar();
                                     }

                                     System.out.print("\nQuer comprar algum desses jogos? (s/n)");
                                      sn = read.next().toUpperCase().charAt(0);

                                     if (sn == 'S') {
                                         System.out.println(" Digite o nome do jogo: ");
                                         read.nextLine();
                                         nome1 = read.nextLine();
                                         jogos.adicionarJogo(nome1);
                                     }


                                     keyPress();
                                 }
                                 case 2 ->{
                                     System.out.println("\n\t╔═════════════════════╗");
                                     System.out.println("\t║  Lista por Console  ║");
                                     System.out.println("\t╚═════════════════════╝");
                                     System.out.println("  \t╔══════════════════════╗");
                                     System.out.println("  \t║       1-Xbox         ║");
                                     System.out.println("  \t║       2-PS5          ║");
                                     System.out.println("  \t║       3-PS4          ║");
                                     System.out.println("  \t║       4-Nintendo     ║");
                                     System.out.println("  \t╚══════════════════════╝");
                                     System.out.print("  \tEscolha uma opção: " );
                                     try {
                                         console = read.nextInt();
                                     }catch(InputMismatchException e){
                                         System.err.println("\nExceção: " + e);
                                         read.nextLine();
                                         System.out.println("\nDigite valores inteiros!");
                                         console = 5;
                                     }
                                     switch (console){
                                         case 1 ->{
                                             System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                                             System.out.println("\t\t║ Dados dos Jogos ║");
                                             System.out.println("\t\t╚═════════════════╝");
                                             List<Jogos> jogosPorConsole = jogos.listarPorConsoles(console);
                                             for(Jogos jogo : jogosPorConsole){
                                                 jogo.visualizar();
                                             }

                                             System.out.print("\nQuer comprar algum desses jogos? (s/n)");
                                              sn = read.next().toUpperCase().charAt(0);

                                             if (sn == 'S') {
                                                 System.out.println(" Digite o nome do jogo: ");
                                                 read.nextLine();
                                                 nome1 = read.nextLine();
                                                 jogos.adicionarJogo(nome1);
                                             }
                                             keyPress();

                                         }
                                         case 2 ->{
                                             System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                                             System.out.println("\t\t║ Dados dos Jogos ║");
                                             System.out.println("\t\t╚═════════════════╝");
                                             List<Jogos> jogosPorConsole2 = jogos.listarPorConsoles(console);
                                             for(Jogos jogo : jogosPorConsole2){
                                                 jogo.visualizar();
                                             }

                                             System.out.print("\n\tQuer comprar algum desses jogos? (s/n)");
                                              sn = read.next().toUpperCase().charAt(0);

                                             if (sn == 'S') {
                                                 System.out.println(" Digite o nome do jogo: ");
                                                 read.nextLine();
                                                 nome1 = read.nextLine();
                                                 jogos.adicionarJogo(nome1);
                                             }
                                             keyPress();
                                         }

                                         case 3 ->{
                                             System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                                             System.out.println("\t\t║ Dados dos Jogos ║");
                                             System.out.println("\t\t╚═════════════════╝");
                                             List<Jogos> jogosPorConsole3 = jogos.listarPorConsoles(console);
                                             for(Jogos jogo : jogosPorConsole3){
                                                 jogo.visualizar();
                                             }

                                             System.out.print("\nQuer comprar algum desses jogos? (s/n)");
                                              sn = read.next().toUpperCase().charAt(0);

                                             if (sn == 'S') {
                                                 System.out.println(" Digite o nome do jogo: ");
                                                 read.nextLine();
                                                 nome1 = read.nextLine();
                                                 jogos.adicionarJogo(nome1);
                                                }
                                             keyPress();

                                         }
                                         case 4 ->{
                                             System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                                             System.out.println("\t\t║ Dados dos Jogos ║");
                                             System.out.println("\t\t╚═════════════════╝");
                                             List<Jogos> jogosPorConsole4 = jogos.listarPorConsoles(console);
                                             for(Jogos jogo : jogosPorConsole4){
                                                 jogo.visualizar();
                                             }

                                             System.out.print("\n\tQuer comprar algum desses jogos? (s/n)");
                                              sn = read.next().toUpperCase().charAt(0);

                                             if (sn == 'S') {
                                                 System.out.println(" Digite o nome do jogo: ");
                                                 read.nextLine();
                                                 nome1 = read.nextLine();
                                                 jogos.adicionarJogo(nome1);
                                               }
                                             keyPress();

                                         }
                                     }
                                 }

                             }

                             System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                             System.out.println("\t\t║ Dados dos Jogos ║");
                             System.out.println("\t\t╚═════════════════╝");
                             List<Jogos> jogosPorGenero1 = jogos.listarPorPlataforma(1);
                             for(Jogos jogo : jogosPorGenero1){
                                 jogo.visualizar();
                             }

                             System.out.print("\nQuer comprar algum desses jogos? (s/n)");
                              sn = read.next().toUpperCase().charAt(0);

                             if (sn == 'S') {
                                 System.out.println(" Digite o nome do jogo: ");
                                 read.nextLine();
                                 nome1 = read.nextLine();
                                 jogos.adicionarJogo(nome1);
                             }


                             keyPress();

                         }
                     }

                 }while(op!=4);
                 keyPress();


                 break;
             case 3:

                 do {
                     System.out.println("\n\n\n"+Cores.TEXT_GREEN);
                     System.out.println("\t\t\t╔══════════╗");
                     System.out.println("\t\t\t║ Carrinho ║");
                     System.out.println("\t\t\t╚══════════╝");

                     System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
                     System.out.println("\t\t║ Dados dos Jogos ║");
                     System.out.println("\t\t╚═════════════════╝");
                     jogos.exibirCarrinho();

                     System.out.println("\n"+Cores.TEXT_GREEN);
                     System.out.println(" \t\t ╔════════════════════════════════╗");
                     System.out.println(" \t\t ║         1-Remover jogo         ║");
                     System.out.println(" \t\t ║         2-Finalizar Compra     ║");
                     System.out.println(" \t\t ║         3-Voltar               ║");
                     System.out.println(" \t\t ╚════════════════════════════════╝");
                     System.out.print(" \t\t Escolha uma opção: " );
                     try {
                         op = read.nextInt();
                     }catch(InputMismatchException e){
                         System.err.println("\nExceção: " + e);
                         read.nextLine();
                         System.out.println("\nDigite valores inteiros!");
                         op = 6;
                     }
                     switch (op){
                         case 1 -> {
                             System.out.println("\n\t\t╔════════════════════╗");
                             System.out.println("\t\t║    Remover Jogo    ║");
                             System.out.println("\t\t╚════════════════════╝");
                             System.out.print("  Qual o nome do jogo que você deseja remover: " );
                             read.nextLine();
                             nome1 = read.nextLine();


                             System.out.print("\nQuer mesmo remover o jogo? (s/n)");
                              sn = read.next().toUpperCase().charAt(0);
                             if (sn == 'S')
                                 jogos.removerJogo(nome1);
                             keyPress();
                         }
                         case 2 -> {
                             System.out.println("\n\t\t╔════════════════════╗");
                             System.out.println("\t\t║  Finalizar Compra  ║");
                             System.out.println("\t\t╚════════════════════╝");

                             System.out.print("\nQuer finalizar a compra? (s/n)");
                              sn = read.next().toUpperCase().charAt(0);

                             if (sn == 'S')
                                 jogos.finalizarCompra();
                             keyPress();
                         }
                     }


                 }while (op !=3);

                 keyPress();
                 break;
             case 0:
                 System.out.print("\nQuer realmente sair do sistema (s/n)");
                  sn = read.next().toUpperCase().charAt(0);
                 keyPress();
                 if (sn == 'N') op=1;
                 break;
             default:
                 System.out.println("\nOpção Inválida!!");
                 keyPress();
         }
     }while (op!=0);
        System.out.println("\n\nAté a próxima aventura! Lembre-se, o jogo nunca acaba, apenas pausa.\n");
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_GREEN + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println(Cores.TEXT_GREEN +"Você pressionou uma tecla diferente de enter!");

        }
    }

}

