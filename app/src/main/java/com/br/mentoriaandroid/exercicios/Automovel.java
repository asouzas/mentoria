package com.br.mentoriaandroid.exercicios;

public class Automovel {

    //Atributos

    public String marca;

    public String modelo;

    public String cor;

    public int anoFabricacao;

    public int anoModelo;

    public String tipoCombustivel;

    public String categoria;

    public String cambio;

    public String tipoChave;


    //Métodos

    void abrirCarro() {
        switch (tipoChave) {
            case "Codificada":
                System.out.println("Acione o botão de abrir o carro");
                break;

            case "Normal":
                System.out.println("Insira a chave na fechadura e gire sentido horário");
                break;

            case "Digital":
                System.out.println("Toque na maçaneta");
                break;
        }
    }

    void ligar() {
        switch (cambio) {
            case "Manual":
                System.out.println("Coloque a chave no contato, coloque o pé esquerdo na embreagem " +
                        "e gire a chave sentido horário");
                break;

            case "Automático":
                System.out.println("Coloque a chave no contato e gire a chave sentido horário");
                break;

            case "Semi-Automático":
                System.out.println("Coloque a chave no contato, deixe a macha no ponto neutro e gire" +
                        " a chave sentido horário");
                break;
        }
    }

    void acelerar() {
        switch (cambio) {
            case "Manual":
                System.out.println("Coloque o pé esquerdo na embreagem, coloque na primeira macha, " +
                        "coloque o pé direito no acelerador, retire devagar o pé da embreagem e, ao" +
                        " mesmo tempo acelere devagar");
                break;

            case "Automático":
                System.out.println("Coloque o cambio no ponto de direnção e o pé direito no acelerador");
                break;

            case "Semi-Automático":
                System.out.println("Coloque o cambio no ponto de direnção ou na opção 1, e o pé " +
                        "direito no acelerador");
                break;
        }
    }

    void trocarMacha() {
        switch (cambio) {
            case "Manual":
                System.out.println("Coloque o pé esquerdo na embreagem, coloque na próxima macha, " +
                        "coloque o pé direito no acelerador, retire devagar o pé da embreagem e, ao" +
                        " mesmo tempo acelere devagar");
                break;

            case "Automático":
                System.out.println("Não precisa fazer nada, apenas acelerar");
                break;

            case "Semi-Automático":
                System.out.println("Apenas acelere ou coloque o cambio na opção 2 ou 3");
                break;
        }
    }

    void abastecer() {
        switch (tipoCombustivel) {
            case "Alcóol ou Etanol":
                System.out.println("Solicite ao frentista para abastecer com Etanol");
                break;

            case "Gasolina":
                System.out.println("Solicite ao frentista para abastecer com Gasolina");
                break;

            case "Flex":
                System.out.println("Solicite ao frentista para abastecer com Etanol ou Gasolina");
                break;

            case "Diesel":
                System.out.println("Solicite ao frentista para abastecer com Diesel");
                break;

        }
    }

    void desligar() {
        switch (cambio) {
            case "Manual":
                System.out.println("Coloque o pé direito no freio e o pé esquerdo na embreagem, " +
                        "coloque o carro no ponto morto, puxe o freio de mão, retire os pés da " +
                        "embreagem e do freio e  gire a chave sentido anti horário");
                break;

            case "Automático":
                System.out.println("Coloque o pé direito no freio, puxe o freio de mão, retire o pé " +
                        "do freio e  gire a chave sentido anti horário");
                break;

            case "Semi-Automático":
                System.out.println("Coloque o pé direito no freio, coloque a macha no ponto neutro, " +
                        "puxe o freio de mão, retire o pé do freio e  gire a chave sentido anti horário");
                break;
        }
    }


}




