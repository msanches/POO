
import java.awt.BorderLayout;
import javax.swing.*;

public class Janela03 extends JFrame {
    //atributos
    private JButton botaoL;
    private JButton botaoO;
    private JButton botaoN;
    private JButton botaoS;
    private JButton botaoC;
    
    public Janela03(){
        //instancia compontentes
        botaoL = new JButton("Leste");
        botaoO = new JButton("Oeste");
        botaoN = new JButton("Norte");
        botaoS = new JButton("Sul");
        botaoC = new JButton("Centro");
        
        getContentPane().setLayout(new BorderLayout(3,3));
        
        getContentPane().add(botaoL, BorderLayout.EAST);
        getContentPane().add(botaoN, BorderLayout.NORTH);
        getContentPane().add(botaoC, BorderLayout.CENTER);
        getContentPane().add(botaoS, BorderLayout.SOUTH);
        getContentPane().add(botaoO, BorderLayout.WEST);
        
        //configurações da janela
        setTitle("Janela 03");
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
