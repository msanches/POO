/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Retangulo extends Triangulo {

    public Retangulo() {
    }

    public Retangulo(float base, float altura) {
        super(base, altura);
    }

    public float area() {
        return getAltura() * getBase();
    }

    public float perimetro() {
        return (getBase() * getAltura()) * 2;
    }

    public void mostra() {
        System.out.println("----------Retangulo----------" +
                "\nBase: " + getBase()
                + "\nAltura: " + getAltura()
                + "\nÁrea: " + area()
                + "\nPerimetro: " + perimetro());
    }
}
