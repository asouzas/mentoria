package com.br.mentoriaandroid.exercicios;

public class Exercicio3 {

    /**
     * Data da aula: 23/10/2020
     *
     * @author Aline Souza
     * <p>
     * Vamos treinar um pouco dos comandos de GIT.
     * <p>
     * Para resolver o exercício abaixo eu quero que:
     * Commit a resolução do primeiro exercício com a mensagem "Exercício 1"
     * Commit a resolução do segundo exercício com a mensagem "Exercício 2"
     * Dê um PUSH nos dois de uma única vez
     * <p>
     * Esqueceu os comandos? Olhar a classe GitHub, dentro da pasta "dicas"
     */

    public void getDaysFromAge(int age) {
        /* Escreva um algorítmo que seja capaz de ler a idade passada por parâmetro e
         * devolva uma mensagem da quantidade de dias correspondente.
         * Exemplo: Se age == 10, então, o código deverá ter o resultado de 3650 dias.
         * */

        String result;

        result = age * 365 + " dias.";

        // Variável
        int dias = 0;
        int dados = 365;


        // Solução

        if (age > 0) {
           dias = age * dados;
        }


    }

    public void getPreviousAndNext(int value) {
        /*
         * Desenvolva um algoritmo em Java que leia um número inteiro e
         * caso ele seja positivo, armazene o seu antecessor, caso não, armazene seu sucessor.
         */

        int result;

        if (value >= 0) {
            result = value + 1;
        } else {
            result = value - 1;
        }
        //Variável
        int antValue = value - 1;
        int sucValue = value + 1;
        int result = 0;


        //Solução
        if (value >= 0) {
            result = antValue;
        } else { result = sucValue;


    }
}