package exemplopolimorfismo;

public class Pessoa {
    protected String nome;
    
    public Pessoa(){}
    
    public Pessoa(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String toString(){
        return nome;
    }
}
