package game.model;

public class Console extends Jogos{

    private int consoles;

    public Console(String nome, String genero, double preco, int estoque, int plataforma, int consoles) {
        super(nome, genero, preco, estoque, plataforma);
        this.consoles = consoles;
    }

    public int getConsoles() {
        return consoles;
    }

    public void setConsoles(int consoles) {
        this.consoles = consoles;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        String consoles = "";
        switch(this.consoles){
            case 1:
                consoles = "Xbox";
                break;
            case  2:
                consoles = "PS5";
                break;
            case  3:
                consoles = "PS4";
                break;
            case  4:
                consoles = "Nintendo";
                break;
        }
        System.out.println(" Consoles: "+consoles);

    }
}
