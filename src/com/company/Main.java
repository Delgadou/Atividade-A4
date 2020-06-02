package com.company;

public class Main {

    public static void main(String[] args) {
        FuncionarioComissionado funcionarioUm = new FuncionarioComissionado("Henrique Delgado", "233.321.213.31", 0.5, 3541.90);

        FuncionarioComissionado funcionarioDois = new FuncionarioComissionado("Ricardo Assis", "231.132.312.32", 0.2, 20000.00);

        FuncionarioComissionadoBaseSalario funcionarioTres = new FuncionarioComissionadoBaseSalario("Adauto Fonseca", "233.322.323.11", 0.3, 20000.00, 1250.90);

        FuncionarioComissionadoBaseSalario funcionarioQuatro = new FuncionarioComissionadoBaseSalario("Guilherme Pneu", "233.322.323.41", 0.5, 4000.00, 800.25);

        System.out.println("O salario do funcionarioUm é de " + funcionarioUm.getRendimentos() + " reais.");

        System.out.println("O salario do funcionarioDois é de " + funcionarioDois.getRendimentos() + " reais.");

        System.out.println("O salario do funcionarioTres é de " + funcionarioTres.getRendimentos() + " reais.");

        System.out.println("O salario do funcionarioQuatro é de " + funcionarioQuatro.getRendimentos() + " reais.");
    }
}
