package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author marco
 */
public class Conecta {
    /**
     * Devolve a conex�o com o banco de dados
     *
     * @return
     */
    public static Connection getConexao() {
        Connection con = null;
        String serverName = "sql158.main-hosting.eu";
        String myDataBase = "u485182729_alunos";
        String username = "u485182729_alunos";
        String password = "Sm123456";
        String driverName = "com.mysql.jdbc.Driver"; //caminho para a classe driver

        try {
            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver n�o encontrado " + e.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
        }

        return con;
    }
}
