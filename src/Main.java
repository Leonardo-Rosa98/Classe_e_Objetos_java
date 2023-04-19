
public class Main{
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3  = new ContaCorrente();

        conta1.setNumeroDaConta(125008);
        conta1.setSaldoAtual(1500.00);
    
        conta2.setSaldoAtual(8000.07);
        conta2.setNumeroDaConta(88990);
    
        conta3.setNumeroDaConta(456456);
        conta3.setSaldoAtual(90587.05);
        
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

    }
}