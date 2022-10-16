import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Login user;
        String nome, password;

        nome = JOptionPane.showInputDialog(null, "Digite o nome de usuário");
        password = JOptionPane.showInputDialog(null, "Digite a senha");

        user = new Login(nome, password);
        System.out.println("" + user.teste());
        if (user.autentica()) {
            System.out.println("Bem-vindo " + user.getNome()
                    + "\nSeus privilégios de acesso são: " + user.getAcesso());
        } else {
            System.out.println("Dados incorretos");
        }

    }
}

