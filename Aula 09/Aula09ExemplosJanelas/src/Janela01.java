
import java.awt.FlowLayout;
import javax.swing.*;

public class Janela01 extends JFrame {
    //atributos
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;
    //construtor
    public Janela01(){
        //instanciar os compontentes
        texto = new JLabel("Botões");
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        
        //define layout
        FlowLayout layout = new FlowLayout();
        getContentPane().setLayout(layout);
        //muda o valor padrão do alinhamento - centralizado
        layout.setAlignment(FlowLayout.LEFT);
        
        
        //adiciona componentes na janela
        getContentPane().add(texto);
        getContentPane().add(salvar);
        getContentPane().add(cancelar);
        
        //configurações da janela
        setTitle("Exemplo 01 - Layout");
        setVisible(true);
        setSize(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
