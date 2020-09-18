/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Funcionario {

    private String nome;
    private float salario;
    private float ndependentes;

    public Funcionario(String nome, float salario, float ndependentes) {
        this.nome = nome;
        this.salario = salario;
        this.ndependentes = ndependentes;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public float getNdependentes() {
        return ndependentes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNdependentes(float ndependentes) {
        this.ndependentes = ndependentes;
    }

    public float calculaInss() {
        float inss;
        if (salario > 2331) {
            inss = salario * 0.11f;
        } else if (salario > 1399) {
            inss = salario * 0.09f;
        } else {
            inss = salario * 0.08f;
        }
        return inss;
    }

    public float calculaIr() {
        float ir;
        float rendaanual = salario * 12;
        float salseminss = salario - calculaInss();
        float descdepte;
        if (ndependentes > 0) {
            descdepte = ndependentes * 189;
        } else {
            descdepte = 0;
        }

        if (rendaanual > 53000) {
            ir = (salseminss * 0.275f) - descdepte;
        } else if (rendaanual > 42000) {
            ir = (salseminss * 0.225f) - descdepte;
        } else if (rendaanual > 32000) {
            ir = (salseminss * 0.15f) - descdepte;
        } else if (rendaanual > 21000) {
            ir = (salseminss * 0.075f) - descdepte;
        } else {
            ir = 0;
        }
        return ir;
    }

    public float calculaSalarioLiquido() {
        float salfinal;
        salfinal = salario - calculaInss() - calculaIr();
        return salfinal;
    }

    public String print() {
        String saida;
        saida = "Nome: " + nome;
        saida += "\nSalário Bruto: " + salario;
        saida += "\nNº dependentes: " + ndependentes;
        saida += "\nINSS: " + calculaInss();
        saida += "\nIR: " + calculaIr();
        saida += "\nSalário Líquido: " + calculaSalarioLiquido();

        return saida;
    }
}
