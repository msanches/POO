
import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {                
        Scanner leitura = new Scanner(System.in);
        //instanciação dos objetos        
        
        Produto p = new Produto();
        Produto p1;
        
        float  porcentagem;
        //Utilização dos métodos para o objeto do tipo Produto
        p.cadastraDados();
        p.imprimeDados();
        System.out.println("Digite a porcentagem de lucro");
        porcentagem=leitura.nextFloat();        
        System.out.println("Preco Final do produto: " + p.calculaImposto(porcentagem));
        p1 = p.duplicar();
        p1.imprimeDados();
        p1.valor = 0.0f;
        System.out.println(p1.comparaCom(p));        
    }    
}
