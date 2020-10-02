
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marco
 */
public class TestaForma {

    public static void main(String[] args) {
//        Circunferencia c = new Circunferencia(14.9f);
//        Retangulo r = new Retangulo(20, 20);

        float raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o raio de circunferência em cm"));
        Circunferencia c = new Circunferencia(raio);

        c.area();
        c.perimetro();
        c.mostra();

        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do retângulo em cm"));
        float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do retângulo em cm "));

        Retangulo r = new Retangulo(altura, base);

        r.area();
        r.perimetro();
        r.mostra();

    }
}
