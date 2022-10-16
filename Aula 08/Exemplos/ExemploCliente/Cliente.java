
import javax.swing.JOptionPane;
public class Cliente extends Pessoa {
    private float valorDivida;
    Cliente(){}
    Cliente(String n, String f, float vd){
        super(n,f);
        valorDivida=vd;
    }
    public float getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    public void print(){
        super.print();
        JOptionPane.showMessageDialog(null, "\nValor da Divida: " + valorDivida);
    }
    public float calculaJuros(float tx){
        return valorDivida*tx/100;
    }
}
