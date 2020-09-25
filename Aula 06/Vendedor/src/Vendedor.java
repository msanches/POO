
import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marco
 */
public class Vendedor {

    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    public float getVendas() {
        return vendas;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome
                + "\nComissão: " + formatar(calcularComissao())
                + "\nDesconto por falta: " + formatar(descontoFalta())
                + "\nSalário: " + formatar(salario));
    }

    public void calcularSalario() {
        salario = (salario + calcularComissao() - descontoFalta());
    }

    public float calcularComissao() {
        if (vendas >= 1000 && vendas < 2000) {
            vendas = vendas * 0.10f;
        } else if (vendas >= 2000) {
            vendas = vendas * 0.15f;
        }
        return vendas;
    }

    public float descontoFalta() {
        return (salario / 30) * falta;
    }

    public String formatar(float valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }
}
