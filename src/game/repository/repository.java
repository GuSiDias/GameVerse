package game.repository;

import game.model.Jogos;

import java.util.List;

public interface repository {
    void todosJogos();
    void adicionar(Jogos jogos);
    void procurarPorNome(String nome);
    void finalizarCompra();
    List<Jogos> listarPorGenero(String genero);
    List<Jogos> listarPorConsoles();
    List<Jogos> listarPorPlataforma(int plataforma);



}
