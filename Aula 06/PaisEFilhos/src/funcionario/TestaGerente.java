/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author marco
 */
public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // podemos chamar métodos do Funcionario:
        gerente.setNome("João da Silva");

        // e também métodos do Gerente!
        gerente.setSenha(4231);
        gerente.setSalario(5000.0);
        
        System.out.println(gerente.getBonificacao());
    }
}
