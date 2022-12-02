package heranca;

public class Jogador extends  Pessoa{

    protected  boolean aindaJoga= false;

    public void dizerAindaJoca(){
        System.out.println("Dizer se ainda joga" + aindaJoga);
    }
}
