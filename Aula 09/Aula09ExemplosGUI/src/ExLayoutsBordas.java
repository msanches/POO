// ExLayoutsBordas.java: demonstramos a utilização de 'layouts' e exemplos 
// de diferentes "bordas". 

 
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory; 
import javax.swing.border.*;

public class ExLayoutsBordas extends JFrame {
	
	JPanel 
	    p1 = new JPanel (),
	    p2 = new JPanel (),
	    p3 = new JPanel (),
	    p4 = new JPanel (null);
	    
	JButton
	    b1 = new JButton("Botão 1"),
	    b2 = new JButton("Botão 2"),
	    b3 = new JButton("Botão 3"),
	    b4 = new JButton("Botão 4"),
	    b5 = new JButton("Botão 5"),
	    b6 = new JButton("Botão 6"),
	    b7 = new JButton("Btn 7"),
	    b8 = new JButton("Btn 8"),
	    b9 = new JButton("Btn 9"),
	    b10 = new JButton("Btn 10");

public ExLayoutsBordas() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

	    p1.setLayout(new FlowLayout());
	    p2.setLayout(new FlowLayout());
	    p3.setLayout(new GridLayout(2,2,50,40)); 
	    //dois construtores da classe GridLayout:
	    //  public GridLayout(int rows,int cols, int hgap,int vgap)
	    //  public GridLayout(int rows,int cols)
	    //  experimente com:
	    //  p3.setLayout(new GridLayout(4,1)); -> 4 linhas e 1 coluna, sem 'gaps' 
	    
	    //mais detalhes sobre bordas, consulte "How to Use Borders" 
	    //na ajuda do site da Oracle. 
	    
	    //"etched" significa "gravada"
	    //"raised" significa "elevada" ou levantada
	    //"lowered" significa "afundada"
	    //"bevel" significa "chanfrada"
	    
	    //"RaisedBevelBorder" significa "borda chanfrada levantada".
	    //Usar método createLoweredBevelBorder() para criar "bordas
	    //chanfradas afundadas".Veja todos os métodos na ajuda da
	    //classe BorderFactory ("fábrica de bordas").

	    p1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
	    p2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	    p3.setBorder(BorderFactory.createRaisedBevelBorder());
	    p4.setBorder(BorderFactory.createTitledBorder("Exemplos de painéis com diferentes bordas e layouts  "));

        //colocamos os objetos de cada painel:
             
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2.add(b4);
        p2.add(b5);
        p2.add(b6);

        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        
        //agora o painel principal p4, composto pelos outros três painéis;
        //como p4 tem layout nulo, especificamos os tamanhos e posições
        //dos painéis p1, p2, p3:
        
        p4.add(p1);
        p1.setBounds(40,40,200,80);
        p4.add(p2);
        p2.setBounds(330,40,100,200);
        p4.add(p3);
        p3.setBounds(80,180,200,200);
        
        //e na janela só adicionaremos o painel principal:
        
        getContentPane().setLayout(null); 
        getContentPane().add(p4); 
        p4.setBounds(10,10,500,400);
        
}//do método construtor

public static void main (String args[]){
     ExLayoutsBordas jan = new ExLayoutsBordas();
     jan.setSize(530,450);
     jan.setLocation(100,100);	
     jan.setTitle("Quatro painéis com bordas...");
     jan.setVisible(true);	
     jan.setResizable(false);  //para proibir redimensionar esta janela 
}

}//da classe