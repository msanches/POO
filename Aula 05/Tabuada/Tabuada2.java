/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Tabuada2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int x = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}
