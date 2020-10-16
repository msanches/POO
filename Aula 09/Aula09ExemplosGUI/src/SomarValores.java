
import javax.swing.*;
import java.awt.*;

public class SomarValores extends JFrame {
    JButton btn1 = new JButton("Somar");
    JLabel lbl1 = new JLabel("Digite valores:");
    JTextField txt1 = new JTextField(6),
            txt2 = new JTextField(6),
            txt3 = new JTextField(6),
            txt4 = new JTextField(6),
            txt5 = new JTextField(6),
            txt6 = new JTextField(6);
    JPanel p = new JPanel();

    public SomarValores() {
        getContentPane().setLayout(null);     // layout nulo
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().add(lbl1);
        lbl1.setBounds(40, 50, 94, 14);         // x,y,largura,altura

        p.setLayout(new GridLayout(2, 3));    // layout de grade
        p.add(txt1);
        p.add(txt2);
        p.add(txt3);
        p.add(txt4);
        p.add(txt5);
        p.add(txt6);

        getContentPane().add(p);
        p.setBounds(80, 120, 110, 50);
        //os objetos JTextField se ajustar�o ao tamanho deste painel

        getContentPane().add(btn1);
        btn1.setBounds(80, 280, 76, 23);
    }

    public static void main(String args[]) {
        SomarValores jan = new SomarValores();
        jan.setSize(370, 360);
        jan.setLocation(200, 200);
        jan.setTitle("Usando o layout de grade (GridLayout)");
        jan.setVisible(true);
    }
} 
