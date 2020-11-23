package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AlunoDAO {

    /**
     * Devolve a lista de alunos cadastrados
     *
     * @return
     */
    public ArrayList<Aluno> listaAlunos() {
        ArrayList<Aluno> lista = new ArrayList<Aluno>();

        try {
            Connection con = Conecta.getConexao();            
            String sql = "SELECT * FROM dados ORDER BY rgm";
            PreparedStatement pstmt = con.prepareStatement(sql);            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setRgm(rs.getString("rgm"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCurso(rs.getString("curso"));
                lista.add(aluno);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
}
