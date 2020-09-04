import javax.swing.JOptionPane;

public class TestePoupanca {

    public static void main(String[] args) {                
        ContaPoupanca cp;
        
        float valorDep, rend, saldo, taxa;
        String agencia, num;
        
        agencia = JOptionPane.showInputDialog("Digite o número da agência");
        num = JOptionPane.showInputDialog("Digite o número da Conta Poupança");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
        taxa =  Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros"));
    
        cp = new ContaPoupanca(agencia, num, saldo, taxa);
        
        //Utilização dos métodos para o objeto do tipo Conta Poupança
        cp.imprimeDados();
        rend=cp.calculaRendimento();
        JOptionPane.showMessageDialog(null,"O rendimento é: " +rend);
        valorDep=Float.parseFloat(
                JOptionPane.showInputDialog("Digite o valor a ser depositado"));
        cp.depositar(valorDep);
        cp.imprimeDados();              
        
    }    
}
