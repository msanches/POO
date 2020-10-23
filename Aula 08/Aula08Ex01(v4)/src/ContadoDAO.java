
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marco
 */
public class ContadoDAO implements Interface{

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
