public class Contato {

    private String nome;
    private String telefone;

    public Contato() {}

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void print() {
      System.out.println(nome + "\t" + telefone);
    }
}
