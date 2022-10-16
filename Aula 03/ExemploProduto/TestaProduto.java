/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class TestaProduto {

    public static void main(String[] args) {
        String temp;// dado primitivo

        temp = "Motorola";

        Produto p = new Produto(); //instanciando um objeto
        p.marca = "Samsung";
        p.fabricante = "Apple";
        p.cod_barras = "12345";
        p.preco = 1000;

        Produto p2 = new Produto("Apple", temp, "1233", 1100);
//        p2 = p;
        p2.cod_barras = "1";
        p.imprime();

        System.out.println("Produto1: " + p.marca + "\n" + p.fabricante + "\n" + p.cod_barras);
        System.out.println("Produto2: " + p2.marca + "\n" + p2.fabricante + "\n" + p2.cod_barras);
//        System.out.println("A variável temp = " + temp);
    }

}
