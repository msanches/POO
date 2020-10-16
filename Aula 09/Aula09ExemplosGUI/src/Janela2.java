
import javax.swing.*;
import java.awt.*;

public class Janela2 extends JFrame {

    private JTextArea texto = new JTextArea("Não tem mundial?");

    public Janela2() {
        setTitle("Janela 2 - Pergunta valendo 1 ponto");
        setSize(450, 200);
        setLocationRelativeTo(null);//abre no centro da tela
        setVisible(true);
        texto.setForeground(Color.green);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(texto); //adiciona o texto à janela       
    }

    public static void main(String args[]) {
        new Janela2();
    }
}
