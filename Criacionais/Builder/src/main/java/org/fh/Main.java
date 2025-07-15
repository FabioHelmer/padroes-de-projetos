package org.fh;

import org.fh.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.Builder()
                .nome("Fábio")
                .sobrenome("Helmer")
                .idade(30)
                .email("fabio.helmer@email.com")
                .build();

        System.out.println(pessoa);
    }
}