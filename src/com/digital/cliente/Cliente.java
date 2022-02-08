package com.digital.cliente;

import com.digital.exception.CPFInvalidoException;
import lombok.Data;

@Data
public class Cliente {
    private static final String VALIDAR_CPF = "\\d{11}";

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) throws CPFInvalidoException {
        this.nome = nome;
        this.cpf = verificarCPF(cpf);
    }

    private String verificarCPF(String cpf) throws CPFInvalidoException {
        if (!cpf.matches(VALIDAR_CPF)
                || cpf.equals("00000000000")
                || cpf.equals("11111111111")
                || cpf.equals("22222222222")
                || cpf.equals("33333333333")
                || cpf.equals("44444444444")
                || cpf.equals("55555555555")
                || cpf.equals("66666666666")
                || cpf.equals("77777777777")
                || cpf.equals("88888888888")
                || cpf.equals("99999999999")) {
            throw new CPFInvalidoException(cpf);
        }
        return cpf;
    }
}
