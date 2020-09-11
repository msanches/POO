/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4, 5);
        Triangulo t2 = new Triangulo();

        t2.altura = 6;
        t2.base = 8;

//        System.out.println("O triangulo 1, tem base: " + t1.base +
//                "\naltura: " + t1.altura +
//                "\ne a área é: " + t1.imprimeDados());
//
//        System.out.println("A área do triangulo 2 é: " + t2.imprimeDados());
        t2.imprimeDados();
        float teste = t1.calculaArea() + t2.calculaArea();
        System.out.println("" + teste);

    }
}
