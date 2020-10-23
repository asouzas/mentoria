package com.br.mentoriaandroid.exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Exercicio1 extends AppCompatActivity {

    // Exercício da ultima aula (05/10/2020)

    public void exercicioComIfElse(int tempoDeCasa) {

        // Declaração de variáveis
        int totalFuncionarios = 50;
        double salarioInicial = 3000.0;
        double novoSalario = 0.0;

        // Laço de repetição
        for(int i = 0; i < totalFuncionarios; i++) {

            // Primeira condição
            if(tempoDeCasa < 1) {
                novoSalario = salarioInicial * 1.05;

            } else if(tempoDeCasa >= 1 && tempoDeCasa < 5) { // Segunda condição
                novoSalario = salarioInicial + (salarioInicial * 0.10);

            } else { // Todos os demais cenários
                int bonusExtraEmPorcentual = (tempoDeCasa * 2) / 100; // Calculo o % do bônus adicional
                double aumentoFixo = salarioInicial * 0.20; // Calculo o aumento fixo de 20% sobre o salário
                double aumentoVariavel = salarioInicial * bonusExtraEmPorcentual; // Calculo o aumento variável
                novoSalario = salarioInicial + aumentoFixo + aumentoVariavel; // Somo os aumentos ao salário
            }
        }
    }

    public void exercicioComWhile(int tempoDeCasa) {

        // Declaração de variáveis
        int totalFuncionarios = 50;
        double salarioInicial = 3000.0;
        double novoSalario = 0.0;
        int i = 0; // declaração da variável de iteração

        // Laço de repetição
        while(i < totalFuncionarios) {
            if(tempoDeCasa < 1) { // Primeira condição
                novoSalario = salarioInicial + (salarioInicial * 0.05);

            } else if(tempoDeCasa >= 1 && tempoDeCasa < 5) { // Segunda condição
                novoSalario = salarioInicial + (salarioInicial * 0.10);

            } else {
                int bonusExtraEmPorcentual = (tempoDeCasa * 2) / 100; // Calculo o % do bônus adicional
                double aumentoFixo = salarioInicial * 0.20; // Calculo o aumento fixo de 20% sobre o salário
                double aumentoVariavel = salarioInicial * bonusExtraEmPorcentual; // Calculo o aumento variável
                novoSalario = salarioInicial + aumentoFixo + aumentoVariavel; // Somo os aumentos ao salário
            }
            i = i + 1; // Lembrar sempre de incrementar o valor de `i`
        }
    }

    public void exercicioOtimizado(int meses) {

        int tempoDeCasa = meses < 12 ? 0 : (meses / 12);

        // Declaração de variáveis
        double salario = 3000.0;

        // Laço de repetição
        for(int i = 0; i < 50; i++) {
            if(tempoDeCasa < 1) { // Primeira condição
                salario += salario * 0.05; // Sobrescrevi o valor do salário inicial com o novo salário, aumentando em 5%

            } else if(tempoDeCasa >= 1 && tempoDeCasa < 5) { // Segunda condição
                salario += salario * 0.10; // Sobrescrevi o valor do salário inicial com o novo salário, aumentando em 10%

            } else {
                int bonusExtraEmPorcentual = (tempoDeCasa * 2) / 100;
                salario += (salario * 0.20) + (salario * bonusExtraEmPorcentual);
            }
        }
    }
}