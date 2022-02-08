package com.digital.exception;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException() {
        super("Você não possui saldo suficiente!");
    }
}
