package com.br.mentoriaandroid.exercicios;

public class Exercicio2 {

    /**
     * Data da aula: 09/10/2020
     * @author Aline Souza
     *
     * Agora que você já está mais acostumada com as operações e variáveis, faça abaixo cada
     * um dos exercícios propsotos abaixo.
     */


    public void progressaoAritmetica(int valorMaximo) {

        int razao = 2; // Valor de incremento
        int valorInicial = 0; // A progressão aritmética sempre começará do 0

        for(int i = 0; i < valorMaximo; i++ ) {
            valorInicial = valorInicial + razao;
        }

    }

    public void raizQuadrada(int valorInicial) {
        /*
        * Calcule a raiz quadrada enquanto o resultado for positivo
        * Por exemplo, se o valor inicial for 100, então deverá calcular a raiz quadrada para:
        * 100, 10, 3.16, 1.78, 1.33, 1.15, 1.07, 1.03 e 1.01.
         */

        double valorAtual = valorInicial;

        while(valorAtual >= 1) {
            valorAtual = Math.sqrt(valorAtual);
        }

    }
}
