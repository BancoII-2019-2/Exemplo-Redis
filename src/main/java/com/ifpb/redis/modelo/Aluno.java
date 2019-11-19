package com.ifpb.redis.modelo;

public class Aluno {

    private String cpf;
    private String nome;
    private String curso;

    public Aluno(String cpf, String nome, String curso) {
        this.cpf = cpf;
        this.nome = nome;
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "com.ifpb.redis.modelo.Aluno{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
