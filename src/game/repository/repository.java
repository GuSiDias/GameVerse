package game.repository;

import game.model.Jogos;

import java.util.List;

public interface repository {
    void todosJogos();

    void exibirCarrinho();

    void adicionar(Jogos jogos);
    void procurarPorNome(String nome);
    void adicionarJogo(String nome);
    void removerJogo(String nome);
    void finalizarCompra();
    List<Jogos> listarPorGenero(String genero);
    List<Jogos> listarPorConsoles(int console);
    List<Jogos> listarPorPlataforma(int plataforma);



}
