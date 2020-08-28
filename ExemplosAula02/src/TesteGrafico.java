import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class TesteGrafico {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2;

        String n = JOptionPane.showInputDialog(null, "Digite o nome");
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade"));
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a renda"));

        p2 = new Pessoa(n, i, r);

        System.out.println("Nome" + p1.nome
                + "\nIdade" + p1.idade
                + "\nRenda" + p1.renda);

        System.out.println("Nome" + p2.nome
                + "\nIdade" + p2.idade
                + "\nRenda" + p2.renda);
    }
}
