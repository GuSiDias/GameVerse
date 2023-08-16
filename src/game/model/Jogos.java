package game.model;

import game.util.Cores;

import java.text.NumberFormat;

public class  Jogos {

    private String nome;
    private String genero;
    private double preco;
    private int estoque;
    private int plataforma;
    private String codigo;


    public Jogos(String nome, String genero, double preco, int estoque, int plataforma) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.estoque = estoque;
        this.plataforma = plataforma;
        this.codigo = game.controller.GameController.gerarCodigo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(int plataforma) {
        this.plataforma = plataforma;
    }
    public String formatoMoeda(){
        NumberFormat nf =  NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatMoeda = nf.format(preco);
        return formatMoeda;
    }
    public boolean temEstoque() {
        return estoque > 0;
    }
    public void vender() {
        if (temEstoque()) {
            estoque--;
        } else {
            System.out.println(nome+"esta com estoque esgotado para este jogo.");
        }
    }

    public void visualizar(){

        String plataforma = "";

        switch (this.plataforma) {
            case 1:
                plataforma = "PC";
                break;
            case 2:
                plataforma = "Console";
                break;
        }


            System.out.println(Cores.TEXT_GREEN + "╔═══════════════╗");
            System.out.println("║ Dados do Jogo ║");
            System.out.println("╚═══════════════╝");
            System.out.println(" Nome: " + nome);
            System.out.println(" Genêro: " + genero);
            System.out.println(" Preço: " + this.formatoMoeda());
            System.out.println(" Estoque: " + estoque + " Unidades");
            System.out.println(" Plataforma: " + plataforma + Cores.TEXT_RESET);

        }

        public void visualizar(boolean gift){

            if(gift){
                System.out.println(Cores.TEXT_GREEN +"╔═══════════╗");
                System.out.println("║ Gift Card ║");
                System.out.println("╚═══════════╝");
                System.out.println(" Codigo: "+codigo+Cores.TEXT_RESET);
            }
            else {

                visualizar();
            }




    }

}
