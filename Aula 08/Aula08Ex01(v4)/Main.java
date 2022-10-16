import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Contato c;
        ContatoDAO a = new ContatoDAO();

        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção:"
                    + "\n1- Incluir"
                    + "\n2- Consultar"
                    + "\n3- Listar"
                    + "\n4- Sair", "Agenda de Contatos", 1));
            switch (op) {
                case 1:
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
                    if (a.seleciona(nome) == null) {
                        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone: ");
                        c = new Contato(nome, telefone);
                        if (a.inserir(c)) {
                            JOptionPane.showMessageDialog(null, "Registro incluído com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao incluir registro!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro já cadastrado");
                    }

                    break;
                case 2:
                    String query = JOptionPane.showInputDialog(null, "Digite o nome para pesquisar");
                    if (a.seleciona(query) == null) {
                        JOptionPane.showMessageDialog(null, "Registro não encontrado!!!");
                    } else {
                        a.seleciona(query).print();
                    }
                    break;

                case 3:
                    System.out.println("Nome\tTelefone");
//                    for (Contato ag : a.listaContatos()) {
//                        ag.print();
//                    }
                    a.listaContatos().forEach(contato -> {
                        contato.print();
                    });
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }

    }
}
