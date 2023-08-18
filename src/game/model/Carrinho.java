package game.model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import game.model.Jogos;
import game.controller.GameController;
import game.repository.repository;
import game.util.Cores;

public class Carrinho {

    private ArrayList<Jogos> jogoNoCarrinho = new ArrayList<>();

    public void adicionarJogo(Jogos jogos) {
        jogoNoCarrinho.add(jogos);
    }

    public void removerJogo(Jogos jogos){
        jogoNoCarrinho.remove(jogos);
    }


    public double calcular(){
        double total = 0;
        for (Jogos jogos : jogoNoCarrinho){
            total+= jogos.getPreco();
        }
        return total;
    }
    public String formatoTotal(){
        NumberFormat nf =  NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatMoeda = nf.format(calcular());
        return formatMoeda;
    }

    public void exibirCarrinho(){
        if (jogoNoCarrinho.isEmpty()){
            System.out.println(Cores.TEXT_GREEN+"\nO carrinho está vazio.");
        }else{

            for (Jogos jogos : jogoNoCarrinho){
                jogos.visualizar();
            }
            System.out.println(Cores.TEXT_GREEN+"\t\tTotal: "+this.formatoTotal());
        }

    }

    public void finalizarCompra(){
        System.out.println(Cores.TEXT_GREEN +"\n\t\t╔════════════╗");
        System.out.println("\t\t║ Gift Cards ║");
        System.out.println("\t\t╚════════════╝");
        for (Jogos jogos : jogoNoCarrinho){
            jogos.vender();
            jogos.visualizar(true);
        }
        jogoNoCarrinho.clear();
        System.out.println(Cores.TEXT_GREEN+"Compra Realizada com sucesso!!");
    }
}
