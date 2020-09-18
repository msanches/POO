import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marco
 */
public class MainAdivinhe {
    public static void main(String[] args) {
        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();
        int num = gerador.nextInt(20);
        int x, i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            i++;
            System.out.println("Digite um número entre 0 e 20:");
            x = sc.nextInt();
            if (x == num) {
                System.out.println("Parabéns, você acertou em " + i + " tentativas");
            } else if (x < num) {
                System.out.println("O número pensado é maior");
            } else {
                System.out.println("O número pensado é menor");
            }
        } while (x != num);
    }
}
