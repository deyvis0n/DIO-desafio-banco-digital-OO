package com.digital.conta;

import com.digital.cliente.Cliente;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String imprimirExtrato() {
        String texto = "=== Extrato Conta Poupanca ===";
        return super.imprimirInfosComuns(texto);
    }
}
