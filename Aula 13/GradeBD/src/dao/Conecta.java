/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Conecta {
    public static Connection getConexao() {
        Connection con = null;
        String serverName = "sql158.main-hosting.eu";
        String myDataBase = "u485182729_alunos";
        String username = "u485182729_alunos";
        String password = "Sm123456";
        String driverName = "com.mysql.jdbc.Driver"; //caminho para a classe driver
        String url = "jdbc:mysql://" + serverName + "/" + myDataBase; //endereço do servidor
        try {
            Class.forName(driverName); //setando o driver para trabalhar  
            con = DriverManager.getConnection(url, username, password); //tento fazer a conexão      
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado" + e.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao Banco de Dados" + e.toString());
        }
        return con;
    }
}
