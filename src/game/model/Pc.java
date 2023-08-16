package game.model;

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
        System.out.println(" Distribuidor: "+distribuidor);
    }
}
