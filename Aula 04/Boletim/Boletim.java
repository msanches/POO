/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Boletim {

    double n1;
    double n2;
    double media;

    //Construtor
    public Boletim(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //métodos
    void imprimeBoletim() {
        calculaMedia();
        JOptionPane.showMessageDialog(null, "Dados do Boletim: "
                + "\nNota 1: " + n1
                + "\nNota 2: " + n2
                + "\nMedia: " + media
                + "\nConceito: " + verificaConceito());

    }

    void calculaMedia() {
        media = (n1 + n2) / 2;
    }

    String verificaConceito() {
        String conceito = "";
        if (media >= 8 && media <= 10) {
            conceito = "A";
        } else if (media >= 6) {
            conceito = "B";
        } else if (media >= 4) {
            conceito = "C";
        } else {
            conceito = "D";
        }
        return conceito;
    }
}
