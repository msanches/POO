/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author marco
 */
public class Eventos extends JFrame implements ActionListener {

    JLabel L1;
    JButton B1, B2;
    int i1 = 0, i2 = 0;

    public Eventos() {

        //getContentPane().setLayout(new FlowLayout());
        setTitle("Eventos de Acao");
        setSize(250, 200);
        setVisible(true);

        B1 = new JButton("Gravar");
        B1.setBounds(10, 10, 100, 30);
        B1.addActionListener(this);

        B2 = new JButton("Sair");
        B2.setBounds(120, 10, 100, 30);
        B2.addActionListener(this);

        L1 = new JLabel("Pressione os botões");
        L1.setBounds(5, 50, 220, 20);

        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(L1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            i1++;
            L1.setText("Gravar pressionado " + i1 + " vez(es)");
        } else if (e.getSource() == B2) {
            i2++;
            L1.setText("Sair pressionado " + i2 + " vez(es)");
        }

    }

    public static void main(String[] args) {
        new Eventos();
    }

}
