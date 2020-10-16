
import javax.swing.*;
import java.awt.*;

public class Janela1 extends JFrame {

    public Janela1() {
        setTitle("Exemplo Janela 1");
        setSize(300, 200);
        setLocation(350, 200);
        setLocationRelativeTo(null);//abre no centro da tela
        setVisible(true);
        getContentPane().setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Janela1();
    }
}
