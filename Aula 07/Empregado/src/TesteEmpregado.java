
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
public class TesteEmpregado {

    public static void main(String[] args) {
        float[] valorp = new float[2];

        Analista a = new Analista();
        Programador p = new Programador();

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do analista");
        String matricula = JOptionPane.showInputDialog(null, "Digite a matrícula do analista");

        for (int i = 0; i < 2; i++) {
            valorp[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do projeto" + (i + 1)));
        }

        a.setNome(nome);
        a.setMatricula(matricula);
        a.setValorPorProjeto(valorp);

        String nomep = JOptionPane.showInputDialog(null, "Digite o nome do Programador");
        String matriculap = JOptionPane.showInputDialog(null, "Digite a matrícula do Programador");
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da hora"));
        float qteh = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade de horas"));

        p.setNome(nomep);
        p.setMatricula(matriculap);
        p.setQtdeHoras(qteh);
        p.setValorHora(valor);

        System.out.println("Dados do Analista: "
                + "\nNome: " + a.nome
                + "\nMatrícula: " + a.matricula
                + "\nSalário: " + a.calculaSalario());

        System.out.println("Dados do programador: "
                + "\nNome: " + p.nome
                + "\nMatrícula: " + p.matricula
                + "\nSalário: " + p.calculaSalario());
    }
}
