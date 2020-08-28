/**
 *
 * @author marco
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Marco";
        p.idade = 25;
        
        Caes c = new Caes();
        c.nome = "Caramelo";
        c.idade = 7;
        
        System.out.println("A pessoa " + p.nome + " tem " + p.idade + " de idade");
        System.out.println("O cão " + c.nome + " tem " + c.idade + " de idade");
        
    }

}
