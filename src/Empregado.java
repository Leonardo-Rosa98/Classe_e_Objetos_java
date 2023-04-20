public class Empregado{
    private String nome;
    private char turno;
    private double salario;
    public void aumentaSalario(double aumento){
       this.salario += aumento;
    }

    public double calculaAdicionalNoturno(){
       if(turno == 'n')
          turno = 'N';
       if(turno == 'N')
          return salario + salario*0.3;
       return 0;
    }
    public void imprimeInformacoes(){
       System.out.println("Nome: "+nome);
       System.out.println("Turno: "+turno);
       System.out.println("Salário: "+salario);
       System.out.println("Adicional noturno: "+calculaAdicionalNoturno());
    }
    public Empregado(String nome){
       this.nome = nome;
    }
    public void setTurno(char turno){
       this.turno = turno;
    }
    public void setSalario(double salario){
       this.salario = salario;
    }
 }