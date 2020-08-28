
import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente conta, conta1;
                
        String n = JOptionPane.showInputDialog("Digite o nome do cliente:");
        
        float s = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta"));
        float l = Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da conta"));
        char t = JOptionPane.showInputDialog("Digite o tipo da conta (N ou E)").charAt(0);
        conta = new ContaCorrente(n, s, l, t);
        
        JOptionPane.showMessageDialog(null, "Nome: " + conta.nome
            + "\nTipo de conta: " + conta.tipo
            + "\nSaldo: " + conta.saldo
            + "\nLimite: " + conta.limite);
        
        n = JOptionPane.showInputDialog("Digite o nome do cliente:");
        s = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta"));
        t = JOptionPane.showInputDialog("Digite o tipo da conta (N ou E)").charAt(0);
        conta1 = new ContaCorrente(n, s, t);
        
        JOptionPane.showMessageDialog(null, "Nome: " + conta1.nome            
            + "\nTipo de conta: " + conta1.tipo
            + "\nSaldo: " + conta1.saldo
            + "\nLimite: " + conta1.limite);
    }
}
