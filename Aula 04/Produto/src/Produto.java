import java.util.Scanner;

public class Produto {
    //Atributos
    String marca;    
    float valor;
    
    //Métodos
    void cadastraDados(){
        Scanner leitura = new Scanner(System.in);        
        System.out.println("Digite a marca do produto");
        marca = leitura.nextLine();
        System.out.println("Digite o valor do produto");
        valor = leitura.nextFloat();
    }     
    void imprimeDados(){
          System.out.println("Dados do Produto: " +                
                "\nMarca: "+ marca + 
                "\nValor: "+ valor);
    }       
    float calculaImposto(float porcentagem){
        return valor+valor*porcentagem/100;
    }
    public Produto duplicar() {
            Produto p = new Produto();
            p.marca = this.marca;
            p.valor = this.valor;
            return p;
    }
    
    public boolean comparaCom(Produto p){
        return valor == p.valor;
    }
}
