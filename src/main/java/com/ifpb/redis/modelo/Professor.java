package com.ifpb.redis.modelo;

public class Professor {

    private int matricula;
    private String nome;
    private String titulacao;

    public Professor(int matricula, String nome, String titulacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "com.ifpb.redis.modelo.Professor{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }
}
