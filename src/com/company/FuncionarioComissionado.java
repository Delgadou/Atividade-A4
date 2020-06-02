package com.company;

public class FuncionarioComissionado {
    private String nome;
    private String cpf;
    double taxaComissao;
    double vendasBrutas;

    public FuncionarioComissionado(){}

    public FuncionarioComissionado(String nome, String cpf, double taxaComissao, double vendasBrutas){
        this.nome = nome;
        this.cpf = cpf;
        this.taxaComissao = taxaComissao;
        this.vendasBrutas = vendasBrutas;
    }

    public double getRendimentos(){
        return this.taxaComissao * this.vendasBrutas;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }
}
