
import java.awt.GridLayout;
import javax.swing.*;

public class Janela04 extends JFrame{
    private JLabel rotulo;
    private JTextField txtnome;
    private JButton btnsalvar;
    private JPanel opcoes;
    private JCheckBox op1;
    private JCheckBox op2;
    private JCheckBox op3;
    
    public Janela04(){
        rotulo = new JLabel("Nome: ");
        txtnome = new JTextField();
        btnsalvar = new JButton("Salvar");
        opcoes = new JPanel();
        op1 = new JCheckBox("Notícias");
        op2 = new JCheckBox("Esportes");
        op3 = new JCheckBox("Games");
        
        getContentPane().setLayout(null);
        //define layout do conteiner JPanel
        opcoes.setLayout(new GridLayout(2,2));
        
        getContentPane().add(rotulo);
        //define posicionamento e tamanho do componente
        rotulo.setBounds(10, 30, 40, 30);
        getContentPane().add(txtnome);
        txtnome.setBounds(60,30,170,30);
        getContentPane().add(btnsalvar);
        btnsalvar.setBounds(80,80,100,30);
        getContentPane().add(opcoes);
        opcoes.setBounds(40,130,170,60);
        //adicionar componente no JPanel
        opcoes.add(op1);
        opcoes.add(op2);
        opcoes.add(op3);
        //configurações da janela
        setTitle("Janela 04");
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
