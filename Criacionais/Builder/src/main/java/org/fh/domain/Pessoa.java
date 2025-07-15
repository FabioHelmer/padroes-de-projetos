package org.fh.domain;

public class Pessoa {
    private final String nome;
    private final String sobrenome;
    private final int idade;
    private final String email;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.sobrenome = builder.sobrenome;
        this.idade = builder.idade;
        this.email = builder.email;
    }

    public static class Builder {
        private String nome;
        private String sobrenome;
        private int idade;
        private String email;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Pessoa[nome=%s, sobrenome=%s, idade=%d, email=%s]",
                nome, sobrenome, idade, email);
    }
}
