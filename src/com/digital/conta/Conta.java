package com.digital.conta;

import com.digital.cliente.Cliente;
import lombok.Data;

@Data
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 100;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    protected Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void trasferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected String imprimirInfosComuns(String texto) {
        texto += "\nTitular: " + this.cliente.getNome();
        texto += "\nAgencia: " + this.agencia;
        texto += "\nConta: " + this.numero;
        texto += "\nSaldo: " + this.saldo;
        return texto;
    }

}
