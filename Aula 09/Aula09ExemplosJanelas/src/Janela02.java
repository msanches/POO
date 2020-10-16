
import java.awt.GridLayout;
import javax.swing.*;

public class Janela02 extends JFrame {
    //atributos
    private JCheckBox escolha1;
    private JButton click;
    private JTextField campo;
    private JButton sair;
    
    public Janela02(){
        //instancia elementos
        escolha1 = new JCheckBox("Animado hoje?");
        click = new JButton("Escolha uma opção");
        campo = new JTextField();
        sair = new JButton("Sair");
        
        //define layout - grid com 2 linhas e 2 colunas
        getContentPane().setLayout(new GridLayout(2,2,5,5));
        //insere componentes no conteiner
        getContentPane().add(sair);
        getContentPane().add(click);
        getContentPane().add(escolha1);
        getContentPane().add(campo);
        
        //configurações da janela
        setTitle("Janela 02");
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
