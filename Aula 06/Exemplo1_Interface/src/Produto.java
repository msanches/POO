
import javax.swing.JOptionPane;

public class Produto implements Imprimivel, Seguranca  {
    private String descricao;
    private int quantidade; 
    public Produto(String d,int q) {
            descricao = d;
            quantidade = q;
    }
    public String formatoString()  {
            String resp = "Descrição:" + descricao;
            resp += nlin + "Qtde:" + quantidade;
            return resp;
    }
    public void formatoSystemOut() {
            String resp = "Descrição:" + descricao;
            resp += nlin + "Qtde:" + quantidade;
            System.out.print(resp); 
    }

    @Override
    public boolean validar() {
        if(quantidade<0){
            JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
            return false;
        }
        else if(descricao.equals("") || descricao.length()<3){
            JOptionPane.showMessageDialog(null, "Informe uma descrição válida");
            return false;
        }
        else return true;
    }
}