package com.br.mentoriaandroid.dicas;

public class OutrasOperacoes {

    public void raizQuadrada() {
        // Como calcular a raiz quadrada de 4?

        int valor = 4;
        double resultado;

        resultado = Math.sqrt(valor);

        // O valor da variável `resultado` será 2.
    }

    public void valorAbsoluto() {
        // Como saber o valor absoluto, desconsiderando sinais?

        int valor = -30;
        int resultado;

        resultado = Math.abs(valor);

        // O valor da variável `resultado` será 30.

    }

    public void valorMaximo() {
        // Como saber o maior valor entre duas variáveis?

        int valorA = 432432;
        int valorB = 432443;
        int resultado;

        resultado = Math.max(valorA, valorB);

        // O valor da variável `resultado` será o mesmo de `valorB`.

    }

    public void valorMinimo() {
        // Como saber o menor valor entre duas variáveis?

        int valorA = -10;
        int valorB = 0;
        int resultado;

        resultado = Math.min(valorA, valorB);

        // O valor da variável `resultado` será o mesmo de `valorA`.

    }

    public void valorElevado() {
        // Como saber o resultado de um valor elevado a N?

        int valorBase = 2;
        int valorExpoente = 3;
        double resultado;

        resultado = Math.pow(valorBase, valorExpoente);

        // O valor da variável `resultado` será o 8.0.

    }
}
