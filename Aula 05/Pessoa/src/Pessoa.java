
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
public class Pessoa {

    private String nome;
    private int idade;
    private double renda;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void imprimeDados() {
        JOptionPane.showMessageDialog(null, "<html><span style='color: blue'>Nome: </span>" + nome
            +"\nidade: " + idade
            +"\nrenda: " + renda);
    }
}
