
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
            if(user.getAcesso() == "admin")
                JOptionPane.showMessageDialog(null, "Bem-vindo " + user.getNome()+
                                              "\nMenu Admin");
            else if(user.getAcesso() == "enfermeiro")
                JOptionPane.showMessageDialog(null, "Bem-vindo " + user.getNome()+
                                              "\nMenu Enfermeiro");
            else 
                JOptionPane.showMessageDialog(null, "Bem-vindo " + user.getNome()+
                                              "\nMenu Médico");
        } else {
            System.out.println("Dados incorretos");
        }

    }
}
