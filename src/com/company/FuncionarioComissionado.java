package com.company;

public class FuncionarioComissionado {
    private String nome;
    private String cpf;
    private double taxaComissao;
    private double vendasBrutas;

    public FuncionarioComissionado(){
    }

    public double getRendimentos(double taxaComissao, double vendasBrutas){
        return taxaComissao * vendasBrutas;
    }

}
