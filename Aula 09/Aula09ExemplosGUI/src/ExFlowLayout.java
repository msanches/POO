
import javax.swing.*;
import java.awt.FlowLayout;

public class ExFlowLayout extends JFrame {

    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public ExFlowLayout() {
        super("Janela 2.0");
        this.getContentPane().setLayout(new FlowLayout());
    }

    public void init() {
        texto = new JLabel("Mensagem:");
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");

        this.getContentPane().add(texto);
        this.getContentPane().add(salvar);
        this.getContentPane().add(cancelar);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        ExFlowLayout a = new ExFlowLayout();
        a.init();
    }
}
