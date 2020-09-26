/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Aluno extends Pessoa{
    private int rgm;
    private float nota1, nota2;

    public Aluno(int rgm, float nota1, float nota2) {
        this.rgm = rgm;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(int rgm, float nota1, float nota2, String nome) {
        super(nome);
        this.rgm = rgm;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getRgm() {
        return rgm;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    
    public void print() {
        System.out.println("Nome: " + getNome() + "\nRGM: " + rgm + "\nResultado: " + resultado());
    }
    
    
    //Método para cálculo da média
    public double media() {
        double media = nota1 + nota2;

        return media;
    }

    //Método para exibição da situação do aluno
    public String resultado() {
        if (media() >= 6) {
            return "Aprovado";
        } else if (media() < 3) {
            return "Reprovado";
        } else {
            return "Avaliação final";
        }
    }
    
}
