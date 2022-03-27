package br.com.dio.exceptions;

public class ValorForaDoArrayException extends Exception{

    private int tamanhoDoArray;

    public ValorForaDoArrayException(String message, int tamanhoDoArray) {
        super(message);
        this.tamanhoDoArray = tamanhoDoArray;
    }
}
