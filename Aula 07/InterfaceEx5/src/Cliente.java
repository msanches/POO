/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Cliente extends Pessoa {
    private float valorDivida;

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente() {
    }

    public Cliente(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente(float valorDivida, String nome, String fone) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }

    public String imprimirDados() {
        return "Nome: " + getNome() + "\nFone: " + getFone() + "\nvalorDivida: " + valorDivida;
    }
    
    
    
}

