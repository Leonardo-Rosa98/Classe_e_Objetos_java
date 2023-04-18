public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean ligado;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;   
    }

    public void liga(){
        ligado = true;
        System.out.println("O carro está ligado!");
    }

    public void desligar(){
        ligado = false;
        System.out.println("O carro está desloigado!");
    }
}
