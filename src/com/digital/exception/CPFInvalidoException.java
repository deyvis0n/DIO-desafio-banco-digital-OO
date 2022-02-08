package com.digital.exception;

public class CPFInvalidoException extends Exception{
    public CPFInvalidoException(String cpf) {
        super(cpf + " é um formato de CPF invalido!");
    }
}
