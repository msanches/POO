
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marco
 */
public class TestaLogin {

    public static void main(String[] args) {
        Login user;
        String nome, password;

        nome = JOptionPane.showInputDialog(null, "Digite o nome de usuário");
        password = JOptionPane.showInputDialog(null, "Digite a senha");

        user = new Login(nome, password);
        if (user.autentica()) {
            System.out.println("Bem-vindo " + user.getNome()
                    + "\nSeus privilégios de acesso são: " + user.getAcesso());
        } else {
            System.out.println("Dados incorretos");
        }

    }
}
