public class MainEmpregado{
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("Leonardo");
        empregado1.setSalario(1500.00);
        empregado1.setTurno('n');
        empregado1.calculaAdicionalNoturno();
        empregado1.imprimeInformacoes();



    }
}