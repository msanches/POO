
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
public class TestaAluno {
    public static void main(String[] args) {
        int qtdeAlunos, qtdeNotas;
        float mediaGeral = 0;
        Aluno alunos[]; //declaração do vetor de objetos do tipo Aluno
        
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos da turma"));
        alunos = new Aluno[qtdeAlunos];//instancia o vetor de objetos do tipo Aluno
        
        for(int i = 0; i < alunos.length; i++){
            qtdeNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de notas do aluno " + (i+1)));
            //intancia o objeto na posição do vetor
            //instancia para cada objeto o vetor de notas
            alunos[i] = new Aluno(qtdeNotas);
            alunos[i].leitura();
            mediaGeral += alunos[i].calculaMedia();
            alunos[i].print();
        }
        System.out.printf("Media geral da turma: %.2f\n", mediaGeral/qtdeAlunos);
//        System.out.println("Media geral da turma: "+ mediaGeral/qtdeAlunos);
    }
}
