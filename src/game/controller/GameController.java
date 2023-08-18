package game.controller;

import game.model.Carrinho;
import game.model.Console;
import game.model.Jogos;
import game.util.Cores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController implements game.repository.repository{

    private List<Jogos> todosJogos = new ArrayList<>();
    public Carrinho carrinho = new Carrinho();

    @Override
    public void todosJogos() {
        for (Jogos jogos : todosJogos){
            jogos.visualizar();
        }

    }
    @Override
    public void exibirCarrinho() {
       carrinho.exibirCarrinho();

    }

    @Override
    public void adicionar(Jogos jogos) {
        todosJogos.add(jogos);
    }

    @Override
    public void procurarPorNome(String nome) {
        Jogos jogos = buscarJogos(nome);

        if(jogos != null) {
            System.out.println(Cores.TEXT_GREEN + "\n\t\t╔═════════════════╗");
            System.out.println("\t\t║ Dados dos Jogos ║");
            System.out.println("\t\t╚═════════════════╝");
            jogos.visualizar();
        }else
            System.out.println(Cores.TEXT_GREEN+"O jogo não foi encontrado!!");

    }
    @Override
    public void adicionarJogo(String nome) {
        Jogos jogos = buscarJogos(nome);

        if(jogos != null) {
            carrinho.adicionarJogo(jogos);
            System.out.println(Cores.TEXT_GREEN+"O jogo foi Adicionado ao Carrinho!!");
        } else
            System.out.println(Cores.TEXT_GREEN+"O jogo não foi encontrado!!");

    }

    @Override
    public void removerJogo(String nome) {
        Jogos jogos = buscarJogos(nome);
        if(jogos != null) {
            carrinho.removerJogo(jogos);
            System.out.println(Cores.TEXT_GREEN+"O jogo foi Removido ao Carrinho!!");
        } else
            System.out.println(Cores.TEXT_GREEN+"O jogo não foi encontrado!!");

    }


    @Override
    public void finalizarCompra() {
        carrinho.finalizarCompra();

    }

    public static String gerarCodigo() {
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 16;i++){
            int indiceAle = random.nextInt(caracter.length());
            char caracterAle = caracter.charAt(indiceAle);
            codigo.append(caracterAle);
        }

        return codigo.toString();
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
    public List<Jogos> listarPorConsoles(int console) {
        List<Jogos> jogosPorConsole = new ArrayList<>();

        for(Jogos jogos : todosJogos){
            if(jogos instanceof Console){
                Console consoleGame = (Console) jogos;
                if (consoleGame.getConsoles() == console){
                    jogosPorConsole.add(consoleGame);
                }


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
    private Jogos buscarJogos(String nome){
        return todosJogos.stream()
                .filter(jogo -> jogo.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public void visualizar() {
    }
}

