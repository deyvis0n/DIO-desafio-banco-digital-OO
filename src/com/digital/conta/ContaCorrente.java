package com.digital.conta;

import com.digital.cliente.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String imprimirExtrato() {
        String texto = "=== Extrato Conta Corrente ===";
        return super.imprimirInfosComuns(texto);
    }
}
