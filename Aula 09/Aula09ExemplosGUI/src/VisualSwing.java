// VisualSwing.java. Layout de fluxo (FlowLayout).
// Exemplo de aplicativo com interface gráfica e componentes do pacote Swing.

import javax.swing.*;
import java.awt.*;

public class VisualSwing extends JFrame {

    private JButton btn1 = new JButton("Calcular");

    private JLabel lbl1 = new JLabel("1o. valor:"),
            lbl2 = new JLabel("2o. valor:");

    private JTextField txt1 = new JTextField(6),
            txt2 = new JTextField(6);

    ButtonGroup grupo = new ButtonGroup();

    private JRadioButton r1 = new JRadioButton("Somar", true), //previamente selecionado
            r2 = new JRadioButton("Multiplicar");

    private JCheckBox ch1 = new JCheckBox("Opção adicional"),
            ch2 = new JCheckBox("Outra opção", true);

    public VisualSwing() {
        getContentPane().setLayout(new FlowLayout()); //layout
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().add(lbl1);
        getContentPane().add(txt1);
        getContentPane().add(lbl2);
        getContentPane().add(txt2);
        grupo.add(r1); //no mesmo grupo
        grupo.add(r2); //no mesmo grupo
        getContentPane().add(r1);
        getContentPane().add(r2);
        getContentPane().add(ch1);
        getContentPane().add(ch2);
        getContentPane().add(btn1);
    }

    public static void main(String args[]) {
        VisualSwing janela = new VisualSwing();
        janela.setSize(160, 240);
        janela.setLocation(200, 240);
        janela.setTitle("Cálculos");
        janela.setVisible(true);
        janela.setResizable(false);  //para proibir redimensionar esta janela
    }
}