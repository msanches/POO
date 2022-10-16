/**
 *
 * @author marco
 */
public class Produto {

    String marca;
    String fabricante;
    String cod_barras;
    float preco;

    Produto() {
    }

    public Produto(String marca, String fabricante, String cod_barras, float preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }
    
    
    void imprime(){
        System.out.println("Olá mundo");
    }
}
