/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1.a;

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        String nome1, nome2, nome3;

        nome1 = JOptionPane.showInputDialog(null, "Digite o nome do primeiro aluno");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome1));

        nome2 = JOptionPane.showInputDialog(null, "Digite o nome do segundo aluno");
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome2));

        nome3 = JOptionPane.showInputDialog(null, "Digite o nome do terceiro aluno");
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome3));

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média da turma foi: " + media);
        if (nota1 > media) {
            System.out.println("Parabéns " + nome1);
        }
        if (nota2 > media) {
            System.out.println("Parabéns " + nome2);
        }
        if (nota3 > media) {
            System.out.println("Parabéns " + nome3);
        }
    }
}
