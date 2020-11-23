/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class AlunoDAO {
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
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota1"));
                lista.add(aluno);
            }
            rs.close(); 
            pstmt.close();        
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString()); }
        return lista;
    }
}
