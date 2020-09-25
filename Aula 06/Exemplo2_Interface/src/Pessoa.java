public class Pessoa {   
    private String nome;   
    private String endereco;   
       
    public Pessoa(String nome) {   
        this.nome = nome;   
    }
       
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public void serEndereco(String endereco) {
    	this.endereco = endereco;
    }
    
    public String getEndereco() {
    	return endereco;
    }
}  