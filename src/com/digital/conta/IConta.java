package com.digital.conta;

import com.digital.exception.SaldoInsuficienteException;

public interface IConta {

    void sacar(double valor) throws SaldoInsuficienteException, SaldoInsuficienteException;

    void depositar(double valor);

    void trasferir(double valor, IConta contaDestino) throws SaldoInsuficienteException, SaldoInsuficienteException;

    String imprimirExtrato();
}
