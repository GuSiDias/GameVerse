
# GameVerse - Projeto Java

Bem-vindo ao projeto GameVerse em Java! A proposta desse projeto de e-commerce foi feita pela Generation e é um exemplo de uma aplicação que permite cadastrar, buscar e adicionar jogos ao carrinho de compras. O objetivo é demonstrar conceitos de programação orientada a objetos em Java.

## Diagrama de classes

![Diagrama de classes](https://i.imgur.com/kV50ohP.png)

## Funcionalidades

O projeto possui as seguintes funcionalidades:

- Cadastrar jogos com informações como nome, gênero, preço, estoque e plataforma.
- Cadastrar jogos específicos para consoles e pc, com informações adicionais sobre os consoles.
- Visualizar informações detalhadas de jogos e jogos para consoles.
- Buscar jogos pelo nome.
- Adicionar jogos ao carrinho de compras.
- Exibir o carrinho de compras com jogos selecionados.
- Calcular o total da compra no carrinho.
- Finalizar a compra, vendendo os jogos e limpando o carrinho.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

### `game.model.Jogos`

Classe base que representa um jogo comum.

Atributos:
- Nome
- Gênero
- Preço
- Estoque
- Plataforma
- Codigo

### `game.model.Pc`

Classe que herda de `Jogos` e representa um jogo específico para pc.

Atributos adicionais:
- Distribuidor compatíveis

### `game.model.Console`

Classe que herda de `Jogos` e representa um jogo específico para consoles.

Atributos adicionais:
- Consoles compatíveis

### `game.model.Carrinho`

Classe que gerencia o carrinho de compras.

Funcionalidades:
- Adicionar jogos ao carrinho
- Remover jogos do carrinho
- Exibir jogos no carrinho
- Calcular o total da compra

### `game.controller.GameController`

A classe `GameController` implementa a interface `gamerepository` e oferece métodos para gerenciar os jogos na loja.

Métodos:
- `todosJogos()`: Retorna a lista de todos os jogos cadastrados.
- `adicionar(Jogos jogos)`: Adiciona um jogo à lista de jogos cadastrados.
- `procurarPorNome(String nome)`: Busca e exibe detalhes de um jogo pelo nome.
- `exibirCarrinho()`: Retorna a lista de todos os jogos que estão no carrinho.
- `adicionarJogo(String nome)`: Busca um jogo pelo nome e o adiciona ao carrinho de compras.
- `removerJogo(String nome)`: Busca um jogo pelo nome e o remove do carrinho de compras.
- `finalizarCompra()`: Finalizar compra do carrinho e depois limpa os jogos do carrinho.
- `List<Jogos> listarPorGenero(String genero)`: Filtra os jogos pelo genêro e adiciona a listarPorGenero.
- `List<Jogos> listarPorConsole(int console)`: Filtra os jogos pelo console e adiciona a listarPorConsole.
- `List<Jogos> listarPorPlataforma(int plataforma)`: Filtra os jogos pela plataforma e adiciona a listarPorPlataforma.
- `static String gerarCodigo()`: Cria 16 caracter aleatorios e insere em uma String.


## Exemplos

Aqui estão alguns exemplos de interações que você pode ter com o programa:

1. Cadastrar um jogo para PC:
   - Nome: Minecraft
   - Gênero: Sandbox
   - Preço: 29.99
   - Estoque: 20
   - Plataforma: 1 (PC)
   - Distribuidor: 3(Origin)
   
2. Cadastrar um jogo para console:
   - Nome: The Last of Us Part II
   - Gênero: Ação e Aventura
   - Preço: 59.99
   - Estoque: 15
   - Plataforma: 2 (Console)
   - Console: 2 (PlayStation 5)
   
3. Buscar um jogo pelo nome:
   - Informe o nome do jogo: Minecraft
   - Visualizar detalhes do jogo encontrado.

4. Adicionar um jogo ao carrinho:
   - Informe o nome do jogo: Minecraft
   - Jogo adicionado ao carrinho.

5. Exibir o carrinho de compras:
   - Visualização detalhada dos jogos no carrinho.

6. Finalizar a compra:
  - Compra realizada com sucesso!

   ## Como Usar

 1- Clone este repositório para sua máquina local.

 2- Abra o projeto em sua IDE Java (por exemplo, Eclipse, IntelliJ, NetBeans, etc.).

3- Compile e execute a classe principal `menu` para iniciar o programa.

4- Siga as opções do menu para lista de jogos, buscar jogos, adicionar ao carrinho, exibir carrinho e finalizar a compra.


## Autor

- [@GuSi](https://www.linkedin.com/in/gustavo-silva-3a3316199)


