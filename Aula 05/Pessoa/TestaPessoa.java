/**
 *
 * @author marco
 */
public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marian", 25, 1300);
        
        Pessoa p2 = new Pessoa();
        
        p2.setNome("Camila");
        p2.setIdade(18);
        p2.setRenda(18000);

        p1.imprimeDados();
        p2.imprimeDados();

    }
}
