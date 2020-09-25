
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristiane
 */
public class Usuario implements Seguranca, Imprimivel {
    private String nomeUsuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean validar() {
        if(!(nomeUsuario.equals("")||senha.equals("")))
            return true;
        else
            return false;                   
    }

    @Override
    public String formatoString() {
        return "Usuário: " + nomeUsuario+" | Senha: " + senha;
    }

    @Override
    public void formatoSystemOut() {
        JOptionPane.showMessageDialog(null, "Usuário: " + nomeUsuario + "\nSenha: " + senha);
    }
    
}
