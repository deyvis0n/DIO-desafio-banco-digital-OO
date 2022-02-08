package com.digital;

import com.digital.banco.Banco;
import com.digital.cliente.Cliente;
import com.digital.conta.ContaCorrente;
import com.digital.conta.ContaPoupanca;
import com.digital.conta.IConta;
import com.digital.exception.CPFInvalidoException;
import com.digital.exception.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        try {
            Banco banco = new Banco("Meu Banco");
            Cliente cliente1 = new Cliente("Detvison", "58745211116");
            cliente1.setNome("Deyvison");

            IConta cc = new ContaCorrente(cliente1, banco);
            cc.depositar(100);

            IConta poupanca = new ContaPoupanca(cliente1, banco);
            cc.trasferir(120, poupanca);

            System.out.println(cc.imprimirExtrato());
            System.out.println(poupanca.imprimirExtrato());

            banco.mostrarClientes();

        } catch (CPFInvalidoException cie) {
            System.out.println("Houve um erro ao criar cliente: " + cie.getMessage());
        } catch (SaldoInsuficienteException sie) {
            System.out.println("Houve um erro na transação: " + sie.getMessage());
        } catch (Exception e) {
            System.out.println("Houve um erro na operação, consulte a equipe tecnica");
        } finally {
            System.out.println("Operação Finalizada");
        }
    }
}
