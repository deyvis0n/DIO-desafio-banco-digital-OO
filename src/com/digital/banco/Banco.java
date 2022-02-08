package com.digital.banco;

import com.digital.conta.Conta;
import lombok.Data;

import java.util.List;

@Data
public class Banco {

    private String nome;
    protected List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
