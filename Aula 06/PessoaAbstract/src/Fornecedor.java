/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Fornecedor extends Pessoa {

    private float valorCompra;

    public Fornecedor() {
    }

    public Fornecedor(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Fornecedor(float valorCompra, String nome, String fone) {
        super(nome, fone);
        this.valorCompra = valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String imprimirDados() {
        return "Nome: " + getNome() + "\nFone: " + getFone() + "\nvalorCompra:" + valorCompra;
    }  
    
}
