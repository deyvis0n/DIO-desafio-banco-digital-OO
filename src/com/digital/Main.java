package com.digital;

import com.digital.cliente.Cliente;
import com.digital.conta.ContaCorrente;
import com.digital.conta.ContaPoupanca;
import com.digital.conta.IConta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Deyvison");

        IConta cc = new ContaCorrente(cliente1);
        cc.depositar(100);

        IConta poupanca = new ContaPoupanca(cliente1);
        cc.trasferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
