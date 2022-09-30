public class Roupa  extends Vestuario{
    private String tecido;

    public Roupa() {    }

    public Roupa(String tecido, String nome, String cor, String tamanho, int codigo, float valor) {
        super(nome, cor, tamanho, codigo, valor);
        this.tecido = tecido;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    
    public String print(){
        String saida = "Dados do roupa:" + super.print();
        saida += "\nTecido: " + tecido;
        return saida;
    }
}
