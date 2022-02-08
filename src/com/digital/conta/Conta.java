package com.digital.conta;

import com.digital.cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 100;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
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

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

}
