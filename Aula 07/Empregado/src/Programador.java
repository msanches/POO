/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Programador extends Empregado{
    private float qtdeHoras;
    private float valorHora;

    public Programador() {
    }

    public Programador(float qtdeHoras, float valorHora) {
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public Programador(float qtdeHoras, float valorHora, String nome, String matricula) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public float calculaSalario(){
      return valorHora * qtdeHoras;  
    }
    
    
}
