/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class MainCurso {

    public static void main(String[] args) {
        Curso c1 = new Curso();
        Curso c2 = new Curso("CCP", 40, "2ºA", 600);
        
        c1.cadastraCurso();
        c1.imprimeDados();
        c2.imprimeDados();
    }

}
