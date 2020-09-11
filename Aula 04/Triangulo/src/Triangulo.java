/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Triangulo {
    float base;
    float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calculaArea(){
        return (this.base * this.altura)/2;
    }
    
    public void imprimeDados(){
        System.out.println("A área do triângulo é: " + calculaArea());

    }
}
