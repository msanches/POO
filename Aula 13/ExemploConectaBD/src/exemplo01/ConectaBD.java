/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo01;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author marco
 */
public class ConectaBD {
    /**
     * @param args the command line arguments
     */
    static String driverName = "com.mysql.jdbc.Driver";
    static String dataBase = "u485182729_alunos";
    static String user = "u485182729_alunos";
    static String password = "Sm123456";
    static String serverName = "sql158.main-hosting.eu";

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Carregando o driver JDBC... ");
            Class.forName(driverName);
            System.out.println("Driver carregado com sucesso!!!");
            System.out.println("Conectando ao banco de dados...");
            String url = "jdbc:mysql://" + serverName + "/" + dataBase;
            Connection con = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conexão efetuada com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Falha na conexão: " + e.toString());
        }
    }
}
