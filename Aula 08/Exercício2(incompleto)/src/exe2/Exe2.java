/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2;

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int qtde = 5;
        float[] notas = new float[qtde];
        float soma, media;
        soma = 0;
        
        for(int i = 0; i < notas.length; i++){
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota : " + (i+1)));
            soma += notas[i]; //acumulador
        }
        media = soma / notas.length;
        System.out.println("A média é : " + media);        
    }
    
}
