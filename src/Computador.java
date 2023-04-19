public class Computador{
    String marca;
    double velocidade;
    int ano_de_fabricacao;
    
    public Computador(String marca, double velocidade, int ano_de_fabricacao){
        this.marca = marca;
        this.velocidade = velocidade;
        this.ano_de_fabricacao = ano_de_fabricacao; 
    }

    public Computador(){
        this.marca = "null";
        this.velocidade = 0;
        this.ano_de_fabricacao = 0;

    }
}