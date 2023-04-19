
public class ContaCorrente{
        int numeroDaConta;
        double saldoAtual;

    public int getNumeroDaConta(){
        return numeroDaConta;

    }

    public double getSaldoAtual(){
        return saldoAtual;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
                
    }

    public void setSaldoAtual(double saldoAtual){
        this.saldoAtual = saldoAtual;
    }
    
    @Override
    public String toString(){
        return "Numero da conta: " + numeroDaConta + 
                "\nSaldo atual: " + saldoAtual;
    }
}

