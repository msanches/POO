// VisualAwt.java. Layout de fluxo (FlowLayout).
// Exemplo de aplicativo com interface gráfica e componentes do pacote Awt.

import java.awt.*;

public class VisualAwt extends Frame {

    private Button btn1 = new Button("Calcular");

    private Label lbl1 = new Label("1o. valor:"),
            lbl2 = new Label("2o. valor:");

    private TextField txt1 = new TextField(6),
            txt2 = new TextField(6);

    CheckboxGroup cbg = new CheckboxGroup();

    private Checkbox //se comportam como radio buttons
            r1 = new Checkbox("Somar  ", cbg, true), //associados a um grupo
            r2 = new Checkbox("Multiplicar  ", cbg, false);

    private Checkbox //se comportam como check box
            ch1 = new Checkbox("Opção adicional", false),
            ch2 = new Checkbox("Outra opção", true);

    public VisualAwt() {
        setLayout(new FlowLayout()); // colocação de componentes na janela

        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(r1);
        add(r2);
        add(ch1);
        add(ch2);
        add(btn1);
        
    }

    public static void main(String args[]) {
        VisualAwt janela = new VisualAwt();
        janela.setSize(158, 240);
        janela.setLocation(200, 240);
        janela.setTitle("Cálculos");
        janela.setVisible(true);
    }
}