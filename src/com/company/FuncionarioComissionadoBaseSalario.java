package com.company;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private double salario;

    public FuncionarioComissionadoBaseSalario(String nome, String cpf, double taxaComissao, double vendasBrutas, double salario){
        super(nome, cpf, taxaComissao, vendasBrutas);
        this.salario = salario;
    }

    public double getRendimentos() {
        return salario + (this.taxaComissao * this.vendasBrutas);
    }
}
