package game.model;

import java.util.ArrayList;
import java.util.List;
import game.model.Jogos;

public class Carrinho {
    List<Jogos> jogoNoCarrinho;

    public Carrinho(){
        jogoNoCarrinho = new ArrayList<>();
    }
    public void adicionarJogo(Jogos jogos){
        jogoNoCarrinho.add(jogos);
    }

    public void removerJogo(Jogos jogos){
        jogoNoCarrinho.remove(jogos);
    }

    public void exibirCarrinho(){
        if (jogoNoCarrinho.isEmpty()){
            System.out.println("\nO carrinho está vazio.");
        }else{
            for (Jogos jogos : jogoNoCarrinho){
                jogos.visualizar();
                System.out.println("═════════════════════════════════");
            }
        }

    }

    public double calcularTotal(){
        double total = 0;
        for (Jogos jogos : jogoNoCarrinho){
            total+= jogos.getPreco();
        }
        return total;
    }

    public void finalizarCompra(){
        for (Jogos jogos : jogoNoCarrinho){
            jogos.vender();
        }
        jogoNoCarrinho.clear();
        System.out.println("Compra Realizada com sucesso!!");
    }
}
