
import javax.swing.JOptionPane;

public class Revista extends Publicacao{
    private String editor;
    private String local;
    
    public Revista(){
        super("", "");
        editor = "";
        local = "";
    }

    public String getEditor() {   return editor;  }
    public String getLocal() {    return local;   }
    public void setEditor(String editor) {   this.editor = editor;   }
    public void setLocal(String local) {   this.local = local;   }

    public void leitura(){
        setTitulo(JOptionPane.showInputDialog("Digite o título do livro"));
        setDataPublicacao(JOptionPane.showInputDialog("Digite a data de publicação"));
        editor = JOptionPane.showInputDialog("Digite o nome do editor");
        local = JOptionPane.showInputDialog("Digite o local de publicação");
    }
    
    public void imprimir(){
        String saida = "Título: " + getTitulo();
        saida += "\nData de Publicação: " + getDataPublicacao();
        saida += "\nEditor: " + editor;
        saida += "\nLocal de Publicação: "+ local;
        JOptionPane.showMessageDialog(null, saida);
    }
}
