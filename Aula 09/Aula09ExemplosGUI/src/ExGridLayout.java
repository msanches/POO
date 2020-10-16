
import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.GridLayout;

public class ExGridLayout extends JFrame {    
    
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;
    
    public ExGridLayout() {
        super("Janela 2.0");
        this.getContentPane().setLayout(new GridLayout(2, 2));
    }

    public void init() {
        texto = new JLabel("Mensagem:");
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        
        this.getContentPane().add(texto);
        this.getContentPane().add(salvar);
        this.getContentPane().add(cancelar);
        
        setSize(600, 300);
        setVisible(true);
    }    
    
    public static void main(String args[]) {
        ExGridLayout a = new ExGridLayout();
        a.init();
    }
}
