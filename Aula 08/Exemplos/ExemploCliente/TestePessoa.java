
import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Fulano", "123-456", 125.40f);
        c1.setNome("Cliente1"); //exemplo de utilização do método da superclasse
        c1.print();
        JOptionPane.showMessageDialog(null, "Juros: " + c1.calculaJuros(1.5f));
        
        Fornecedor f1 = new Fornecedor("Empresa XX", "3456-8979", 1500.89f);
        f1.calculaImpostos(12.5f);
        f1.print(); 
    }    
}
