package br.com.dio.exceptions;

public class DivisorIgualAZeroException extends Exception{

    private int divisor;

    public DivisorIgualAZeroException(String message, int divisor) {
        super(message);
        this.divisor = divisor;
    }
}
