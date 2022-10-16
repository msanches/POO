
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
public class Curso {

    String nome;
    int quantidadeDeAlunos;
    String turma;
    float mensalidade;

    public Curso() {
    }

    public Curso(String nome, int quantidadeDeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }

    public void cadastraCurso() {
        nome = JOptionPane.showInputDialog(null, "Digite o nome do curso");
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos"));
        turma = JOptionPane.showInputDialog(null, "Digite a turma");
        mensalidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da mensalidade"));        
    }

    public void imprimeDados() {
        System.out.println("Dados do curso:"
                + "\nNome: " + nome
                + "\nQuantidade de alunos: " + quantidadeDeAlunos
                + "\nTurma: " + turma
                + "\nTotal da Mensalidade: " + calculaTotalMensalidade()
                + "---------------------------------------------------F");
    }

    public float calculaTotalMensalidade() {
        return quantidadeDeAlunos * mensalidade;
    }
}
