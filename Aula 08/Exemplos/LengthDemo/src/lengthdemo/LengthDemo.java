/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthdemo;

/**
 *
 * @author marco
 */
public class LengthDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = new int[10];
        int[] numeros = {1, 2, 3};
        int[][] tabela = {//tabela de tamanho variável
            {1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        System.out.println("O tamanho da lista é: " + lista.length);
        System.out.println("O tamanho de numeros é: " + numeros.length);
        System.out.println("O tamanho da tabela é: " + tabela.length);
        System.out.println("O tamanho da tabela [0] é: " + tabela[0].length);
        System.out.println("O tamanho da tabela [1] é: " + tabela[1].length);
        System.out.println("O tamanho da tabela [2] é: " + tabela[2].length);

        for (int i = 0; i < lista.length; i++) {
            lista[i] = i * i;
        }

        System.out.println("A lista ao quadrado : ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " - ");
        }
    }

}
