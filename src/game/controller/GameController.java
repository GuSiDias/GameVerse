package game.controller;

import game.model.Carrinho;
import game.model.Console;
import game.model.Jogos;

import java.util.ArrayList;
import java.util.List;

public class GameController implements game.repository.repository{

    private List<Jogos> todosJogos = new ArrayList<>();
    private Carrinho carrinho;

    @Override
    public void todosJogos() {
        for (Jogos jogos : todosJogos){
            jogos.visualizar();
        }

    }

    @Override
    public void adicionar(Jogos jogos) {
        todosJogos.add(jogos);
    }

    @Override
    public void procurarPorNome(String nome) {
        Jogos jogos = buscarJogos(nome);

        if(jogos != null)
            jogos.visualizar();
        else
            System.out.println("O jogo não foi encontrado!!");

    }

    @Override
    public void finalizarCompra() {
        carrinho.finalizarCompra();
        System.out.println("Compra realizada com sucesso!!");

    }

    @Override
    public List<Jogos> listarPorGenero(String genero) {
        List<Jogos> jogosPorGenero = new ArrayList<>();
        for(Jogos jogos : todosJogos){
            if (jogos.getGenero().equalsIgnoreCase(genero)){
                jogosPorGenero.add(jogos);
            }

        }
        return jogosPorGenero;
    }

    @Override
    public List<Jogos> listarPorConsoles() {
        List<Jogos> jogosPorConsole = new ArrayList<>();

        for(Jogos jogos : todosJogos){
            if(jogos instanceof Console){
                Console console = (Console) jogos;
                jogosPorConsole.add(console);
            }
        }
        return jogosPorConsole;
    }

    @Override
    public List<Jogos> listarPorPlataforma(int plataforma) {
        List<Jogos> jogosPorPlataforma = new ArrayList<>();
        for(Jogos jogos : todosJogos){
            if (jogos.getPlataforma() == plataforma){
                jogosPorPlataforma.add(jogos);
            }

        }
        return jogosPorPlataforma;

    }
    public Jogos buscarJogos(String nome){
        for (Jogos jogos : todosJogos){
            if(jogos.getNome().equalsIgnoreCase(nome)){
                return jogos;
            }

        }
        return null;
    }
}
