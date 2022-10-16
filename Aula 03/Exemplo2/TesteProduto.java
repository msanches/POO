
import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {                
        Produto p;
        
        String marca;
        float valor,valorImp, porc;
        marca = JOptionPane.showInputDialog("Digite a marca do produto");
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto"));
     
        p= new Produto(marca, valor);
        
        p.imprimeDados();
        porc=Float.parseFloat(
                JOptionPane.showInputDialog("Digite a porcentagem de imposto"));
        valorImp=p.calculaImposto(porc);
        JOptionPane.showMessageDialog(null,"Imposto a pagar: " + valorImp);
        
    }    
}
