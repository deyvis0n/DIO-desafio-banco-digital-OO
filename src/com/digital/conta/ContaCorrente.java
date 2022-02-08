package com.digital.conta;

import com.digital.banco.Banco;
import com.digital.cliente.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public String imprimirExtrato() {
        String texto = "=== Extrato Conta Corrente ===";
        return super.imprimirInfosComuns(texto);
    }
}
