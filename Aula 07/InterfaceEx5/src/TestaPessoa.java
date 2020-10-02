/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class TestaPessoa {
    public static void main(String[] args) {
        Cliente c = new Cliente(1000, "Joaquim", "99901-9090");
        System.out.println(c.imprimirDados());

        Fornecedor f = new Fornecedor(300, "Manoel", "91222-2131");
        System.out.println(f.imprimirDados());

    }
}
