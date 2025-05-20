package org.fh;

import org.fh.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Cria um protótipo
        Pessoa original = new Pessoa("Maria", 25);
        System.out.print("Original: ");
        original.exibirInformacoes();

        Pessoa clone = original.clonar();
        clone.setNome("Joana"); // muda apenas o nome do clone
        System.out.print("Clone: ");
        clone.exibirInformacoes();

        System.out.print("Original após clone: ");
        original.exibirInformacoes();
    }
}