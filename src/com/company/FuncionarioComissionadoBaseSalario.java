package com.company;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private double salario;

    public double getRendimentos(double salario, double taxaComissao, double vendasBrutas) {
        return salario + (taxaComissao * vendasBrutas);
    }
}
