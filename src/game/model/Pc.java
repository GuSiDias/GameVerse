package game.model;

import game.util.Cores;

public class Pc extends Jogos{

    private int distribuidor;


    public Pc(String nome, String genero, double preco, int estoque, int plataforma, int distribuidor) {
        super(nome, genero, preco, estoque, plataforma);
        this.distribuidor = distribuidor;
    }

    public int getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(int distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        String distribuidor = "";
        switch(this.distribuidor){
            case 1:
                distribuidor = "Steam";
                break;
            case  2:
                distribuidor = "Epic Games";
                break;
            case  3:
                distribuidor = "Origin";
                break;
            case  4:
                distribuidor = "Uplay";
                break;
        }
        System.out.println(Cores.TEXT_GREEN+" \t\tDistribuidor: "+distribuidor);
        System.out.println("\t\t═══════════════════════");
    }
}
