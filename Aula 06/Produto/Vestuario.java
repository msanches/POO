public class Vestuario extends Produto{
    private String nome;
    private String cor;
    private String tamanho;

    public Vestuario() {    }
    
    public Vestuario(String nome, String cor, String tamanho, int codigo, float valor) {
        super(codigo, valor);
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String print(){
        String saida = super.print();
        saida += "\nNome: " + nome;
        saida += "\nCor: " + cor;
        saida += "\nTamanho: " + tamanho;
        return saida;
    }
}
