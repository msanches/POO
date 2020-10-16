
import javax.swing.*;
import java.awt.BorderLayout;

public class ExBorderLayout extends JFrame {    
    
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;
    
    public ExBorderLayout() {
        super("Janela 2.0");
        this.getContentPane().setLayout(new BorderLayout());
    }

    public void init() {
        texto = new JLabel("Mensagem:");
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        
        this.getContentPane().add(texto, BorderLayout.CENTER);
        this.getContentPane().add(salvar, BorderLayout.WEST);
        this.getContentPane().add(cancelar, BorderLayout.EAST);
        
        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        ExBorderLayout a = new ExBorderLayout();
        a.init();
    }    
}
