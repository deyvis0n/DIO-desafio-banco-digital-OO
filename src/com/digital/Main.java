package com.digital;

import com.digital.cliente.Cliente;
import com.digital.conta.ContaCorrente;
import com.digital.conta.ContaPoupanca;
import com.digital.conta.IConta;
import com.digital.exception.CPFInvalidoException;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente1 = new Cliente("Detvison", "58745211116");
            cliente1.setNome("Deyvison");

            IConta cc = new ContaCorrente(cliente1);
            cc.depositar(100);

            IConta poupanca = new ContaPoupanca(cliente1);
            cc.trasferir(100, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        } catch (CPFInvalidoException cie) {
            System.out.println("Houve um erro ao criar cliente: " + cie.getMessage());
        } catch (Exception e) {
            System.out.println("Houve um erro na operação, consulte a equipe tecnica");
        } finally {
            System.out.println("Operação Finalizada");
        }
    }
}
