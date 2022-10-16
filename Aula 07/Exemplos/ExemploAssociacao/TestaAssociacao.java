/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class TestaAssociacao {
    public static void main(String[] args) {
        Curso c = new Curso(10, "ADS");
        Curso c1 = new Curso(11, "CCP");
        
        Disciplina d = new Disciplina("Marco", c);
        
        Disciplina d1 = new Disciplina("Flávio", c1);
        
        d1.imprimir();
    }
}
