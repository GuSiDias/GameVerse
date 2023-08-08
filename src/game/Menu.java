package game;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        int op;
        String menu =
             """
                     ======================================
                                    GameVerse
                     ======================================
                               1-Criar Conta
                               2-Adicionar Jogo
                               3-Listar todos os jogos
                               4-Carrinho
                               5-Apagar Jogo
                               6-Atualizar Dados da Conta
                               7-Apagar conta
                               0-Sair
                     =======================================
                     Entre com a opção desejada:\s
                     """;

        Scanner read = new Scanner(System.in);

     do{
         System.out.print(menu);
         op = read.nextInt();

         switch (op){
             case 1:
                 System.out.println("\nCriar Conta\n\n");
                 break;
             case 2:
                 System.out.println("\nAdicionar Jogo\n\n");
                 break;
             case 3:
                 System.out.println("\nListar todos os jogos\n\n");
                 break;
             case 4:
                 System.out.println("\nCarrinho\n\n");
                 break;
             case 5:
                 System.out.println("\nApagar jogo\n\n");
                 break;
             case 6:
                 System.out.println("\nAtualizar Dados da Conta\n\n");
                 break;
             case 7:
                 System.out.println("\nApagar conta\n\n");
                 break;
             case 0:
                 System.out.print("\nQuer realmente sair do sistema (s/n)");
                 String sn = read.next();
                 if (sn.equalsIgnoreCase("N")){
                     op=1;
                 }
                 break;
             default:
                 System.out.print("\nOpção Inválida!!");
         }
     }while (op!=0);
        System.out.println("\n\nAté a próxima aventura! Lembre-se, o jogo nunca acaba, apenas pausa.\n");
    }
}
