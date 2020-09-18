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
public class MainFuncionario {
    public static void main(String[] args) {
         Funcionario f = new Funcionario("Fulano", 3500, 1);
        
        System.out.println(f.print());
        
        if(f.calculaSalarioLiquido()<2500){
            JOptionPane.showMessageDialog(null, "O funcionário tem direito a vale refeição e vale alimentação");
        }
        else {
            JOptionPane.showMessageDialog(null, "O funcionário tem direito a vale refeição");
        }
    }
}
