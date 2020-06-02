package com.company;

public class Main {

    public static void main(String[] args) {
        FuncionarioComissionado funcionarioUm = new FuncionarioComissionado();

        System.out.println("O salario do funcionarioUm é de " + funcionarioUm.getRendimentos(0.5,10000.00) + " reais.");

        FuncionarioComissionado funcionarioDois = new FuncionarioComissionado();

        System.out.println("O salario do funcionarioDois é de " + funcionarioUm.getRendimentos(0.1,12890.57) + " reais.");

        FuncionarioComissionadoBaseSalario funcionarioTres = new FuncionarioComissionadoBaseSalario();

        System.out.println("O salario do funcionario tres é de " + funcionarioTres.getRendimentos(1000.0,0.1, 30000.00) + " reais.");

    }
}
