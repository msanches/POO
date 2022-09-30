import javax.swing.JOptionPane;

public class TestePublicacao {
    public static void main(String[] args) {
        Publicacao p1;
        Revista p2;
        String a[] = new String[3];
        String e, t;
        
        t = JOptionPane.showInputDialog("Digite o título do livro");
        for(int i=0; i<a.length; i++){
            a[i] = JOptionPane.showInputDialog("Digite o nome do autor");
        }
        e = JOptionPane.showInputDialog("Digite o nome da editora");
        p1 = new Livro(t, a, e);
        p1.imprimir();
        
        p2 = new Revista();
        p2.leitura();
        p2.imprimir();
    }
}
