/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class TestaVendedor {

    public static void main(String[] args) {
        Vendedor v = new Vendedor(3000, 3000, "Alcides2.0", 1);
        v.calcularSalario();
        v.imprimirDados();
        
        Vendedor v2 = new Vendedor(1200, 2000, "Luiz", 1);
        v2.calcularSalario();
        v2.imprimirDados();        
    }
}
