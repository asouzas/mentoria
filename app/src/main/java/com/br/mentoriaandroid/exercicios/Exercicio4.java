package com.br.mentoriaandroid.exercicios;

public class Exercicio4 {

    /**
     * Data da aula: 30/10/2020
     *
     * @author Aline Souza
     * <p>
     * Vamos treinar um pouco dos comandos de GIT.
     * <p>
     * Crie uma branch e resolva o exercício 1. Commit e dê um Push.
     * Em seguida, retorne para a branch "master", crie outra branch a partir dela
     * e resolva o exercício 2. Novamente, faça o commit e push.
     * <p>
     * Esqueceu os comandos? Olhar a classe GitHub, dentro da pasta "dicas"
     */

    public void calculeTwoValues(int val1, int val2, String operation) {
        /* Escreva um algorítmo que seja capaz de ler dois números inteiros passados por parâmetros,
        * e calcule o resultado com base na operação passada.
        * Opções de operações: Soma (+), subtração (-), multiplicação (*) e divisão (/).
        *
        * Exemplo, caso operation seja a soma (+), basta somar val1 + val2.
        *
        * Dica: Utilize o switch/case para selecionar qual operação realizar.
         *
         * */

        // Escreva seu código aqui

        // Variável
        int result = 0;

        //Solução
        switch (operation) {
            case "Soma":
                result = val1 + val2;
                break;

            case "Subtração":
                result = val1 - val2;
                break;

            case "Multiplicação":
                result = val1 * val2;
                break;

            case "Divisão":
                result = val1 / val2;
                break;    
        }

    }

    public void calculateAverage(int totalValue, int quantity) {
        /*
         * Desenvolva um algoritmo em Java que leia um número total e calcule a sua média, com base
         * na quantiade. Ambos os números estão sendo recebidos por parâmetro.
         * Caso a média seja um valor par, guardar a mensagem "Número par", caso não, somar mais um.
         */

        // Escreva seu código aqui

        //Variáveis
        int average = totalValue / quantity;


        //Solução
        if (average % 2 == 0) {
            System.out.println("Número par");
        } else { int result = average + 1; }

    }
}
