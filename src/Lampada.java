public class Lampada{
    boolean ligada;
    boolean desligada;

    public Lampada(boolean ligada, boolean desligada){
        this.ligada = ligada;
        this.desligada = desligada;
    }
    
    public Lampada(boolean ligada){
        this.ligada = true;
    }

    public Lampada(){
        this.ligada = false;   

    }
}