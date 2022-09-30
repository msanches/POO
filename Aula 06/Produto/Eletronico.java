public class Eletronico extends Produto{
    private String descricao;
    private int voltagem;

    public Eletronico() {   }
    public Eletronico(String descricao, int voltagem, int codigo, float valor) {
        super(codigo, valor);
        this.descricao = descricao;
        this.voltagem = voltagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    public String print(){
        String saida = super.print();
        saida += "\nDescrição: " + descricao;
        saida += "\nVoltagem: " + voltagem;
        return saida;
    }
    
}
