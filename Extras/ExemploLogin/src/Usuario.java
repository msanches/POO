/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Usuario {
    private String userName;
    private String pass;
    private String acesso;
    
    private String[][] users = {{"marco@email.com", "123", "admin"}, {"jose@email.com", "123", "medico"} };
    public Usuario() {
    }

    public Usuario(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public String getAcesso() {
        return acesso;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean autentica() {
        for (int i = 0; i < users.length; i++) {
            if (users[i][0].equals(userName) && users[i][1].equals(pass)) {
                acesso = users[i][2];
                return true;
            }
        }
        return false;
    }
}
