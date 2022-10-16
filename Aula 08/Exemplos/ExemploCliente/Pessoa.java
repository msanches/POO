
import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String fone;   
    Pessoa(){}
    Pessoa(String n, String f){
        nome=n;
        fone=f;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }  
    public void print(){
        JOptionPane.showMessageDialog(null,"Dados \nNome: " 
                                            + nome + "\nTelefone: "+ fone);
    }    
}
