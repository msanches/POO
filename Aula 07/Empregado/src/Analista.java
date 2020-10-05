/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Analista extends Empregado {

    private float valorPorProjeto[];

    public Analista() {
    }

    public Analista(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }

    public Analista(float[] valorPorProjeto, String nome, String matricula) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }

    @Override
    public float calculaSalario() {
        float salario = 0;
        for(int i = 0; i <= valorPorProjeto.length; i++){
            salario = salario + valorPorProjeto[i];
        }
        return salario;
    }    
}
