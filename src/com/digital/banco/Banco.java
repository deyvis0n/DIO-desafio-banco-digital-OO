package com.digital.banco;

import com.digital.conta.Conta;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new LinkedList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void setContas(List<Conta> contas) {
        this.contas.addAll(contas);
    }

    public void mostrarClientes() {
        System.out.println("=== Contas ===");
        for (Conta conta : contas) {
            System.out.println("Agencia: " + conta.getAgencia()
                    + " Conta: " + conta.getNumero()
                    + " Cliente: " + conta.getCliente().getNome());
        }
    }
}
