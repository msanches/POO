import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements Interface{

    ArrayList<Contato> agenda = new ArrayList<>();

    @Override
    public boolean inserir(Contato c) {
        agenda.add(c);
        return true;
    }

    @Override
    public List<Contato> listaContatos() {
        return agenda;
    }

    @Override
    public Contato seleciona(String q) {
        Contato contato = null;
        for (Contato c : agenda) {
            if (q.equals(c.getNome())) {
                return c;
            }
        }
        return contato;
    }

}
