/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 *
 * @author marco
 */
public class Aluno {
    private String rgm;
    private String nome;
    private float nota1;
    private float nota2;

    public Aluno() {
    }
    public Aluno(String rgm, String nome, float nota1, float nota2) {
        this.rgm = rgm;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public String getRgm() {
        return rgm;
    }
    public String getNome() {
        return nome;
    }
    public float getNota1() {
        return nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }  
}

