/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1.b;

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Exemplo1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de alunos:"));
        
        float[] nota = new float[num];
        String[] nome = new String[num];
        float soma = 0, media;

        for (int i = 0; i < num; i++) {
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do primeiro " + (i + 1) + "º aluno");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome[i]));
            soma += nota[i];
        }
        media = soma / nota.length;
        System.out.println("A média da turma foi: " + media);

        for (int i = 0; i < num; i++) {
            if (nota[i] > media) {
                System.out.println("Parabéns " + nome[i]);
            }
        }
    }
}
