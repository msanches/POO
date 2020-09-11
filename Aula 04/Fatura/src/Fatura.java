import javax.swing.JOptionPane;

public class Fatura {
    float valor;
    int pontuacao;
    String tipoconta;
    
    //construtores sobrecarregados
    public Fatura() { 
        valor = 0;
        pontuacao = 0;
        tipoconta = "Normal";
    }
    public Fatura(float valor, int pontuacao, String tipoconta) {
        this.valor = valor;
        this.pontuacao = pontuacao;
        this.tipoconta = tipoconta;
    }
    //métodos sobrecarregados
    public Fatura somaCom(int pont) {
        Fatura resp = new Fatura();
        resp.pontuacao=pontuacao + pont;
        return resp;
    }
    
    public Fatura somaCom(int pont, float val) {
        Fatura resp = new Fatura();
        resp.pontuacao = pontuacao+pont;
        resp.valor = valor + val;
        return resp;
    }
    
    public Fatura somaCom(Fatura fat) {
        Fatura resp = new Fatura();
        resp.valor = valor+ fat.valor;
        return resp;
    }
    
    public void print(){
        JOptionPane.showMessageDialog(null,
                "Dados da Fatura: " +
                "\nValor: " + valor+
                "\nPontuação: " + pontuacao+
                "\nTipo de Conta: " + tipoconta);
    }
}
