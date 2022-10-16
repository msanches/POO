
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
public class Case {
    public static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma Opção: "
                + "\n1-Sacar"
                + "\n2-Depositar"
                + "\n3-Sair"));
        switch (op) {
            case 1:
                System.out.println("Você escolheu Sacar");
                break;
            case 2:
                System.out.println("Você escolheu Depositar");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Digite uma opção válida");
        }
    }
}
