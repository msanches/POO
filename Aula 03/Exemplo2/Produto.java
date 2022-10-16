
import javax.swing.JOptionPane;

public class Produto {
    //Atributos
    String marca;
    float valor;
    
    //Construtores
    public Produto(){    
    }     

    public Produto(String marca, float valor) {
        this.marca = marca;
        this.valor = valor;
    }        
   
    void imprimeDados(){
          JOptionPane.showMessageDialog(null,"Dados do Produto: " +
                "\nMarca: "+ marca + 
                "\nValor: "+ valor);
    }       
    float calculaImposto(float p){
        return valor*p/100;
    }
    
    public Produto maiorValor(Produto p) {
	if(valor > p.valor)
            return this;
	else
            return p;
    }
    
    public boolean comparaCom(Produto p){
        return valor == p.valor;
    }


}
