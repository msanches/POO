
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class TestaPessoa {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(1234, 3, 2.1f, "Marco");

        a1.print();

        //Usando ArrayList
        List<Aluno> aluno = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            int rgm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o RGM"));
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
            float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 1"));
            float n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2"));
            aluno.add(new Aluno(rgm, n1, n2, nome));
        }

        aluno.forEach(a -> {
            a.print();
        });
    }
}
