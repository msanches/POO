
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela05 extends JFrame implements ActionListener {

    private JLabel lblNome, lblRgm;
    private JTextField txtnome, txtRgm;
    private JButton btnMostrar;
    private JPanel opcoes, mainGrid;
    private JRadioButton opSM, opAN, opLib, opPin;

    public Janela05() {
        lblRgm = new JLabel("RGM: ");
        txtRgm = new JTextField();
        lblNome = new JLabel("Nome: ");
        txtnome = new JTextField();
        btnMostrar = new JButton("Mostrar");

        //JPanel Principal
        mainGrid = new JPanel();
        mainGrid.setLayout(null);
        getContentPane().add(mainGrid);
        mainGrid.setBounds(10, 10, 450, 160);
        mainGrid.setBorder(BorderFactory.createTitledBorder("Dados do usuário"));
        
        //JPanel opcoes
        opcoes = new JPanel();
        opSM = new JRadioButton("São Miguel");
        opAN = new JRadioButton("Anália Franco");
        opLib = new JRadioButton("Liberdade");
        opPin = new JRadioButton("Pinheiros");

        getContentPane().setLayout(null);
        
        //O btnMostrar é adicionado ao contentPane Pai
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(20, 190, 100, 30);
        
        mainGrid.add(lblRgm);
        lblRgm.setBounds(10, 30, 40, 30);
        mainGrid.add(txtRgm);
        txtRgm.setBounds(60, 30, 170, 30);
        mainGrid.add(lblNome);
        lblNome.setBounds(10, 70, 40, 30);
        mainGrid.add(txtnome);
        txtnome.setBounds(60, 70, 370, 30);
        mainGrid.add(opcoes);
        
        //define layout do conteiner opcoes
        opcoes.setLayout(new GridLayout(1, 4));
        opcoes.setBounds(10, 100, 410, 40);
        //adicionar os radiobutton no componente
        opcoes.add(opSM);
        opcoes.add(opAN);
        opcoes.add(opLib);
        opcoes.add(opPin);
        
        //configurações da janela
        setTitle("Cadastro de Usuários");
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
