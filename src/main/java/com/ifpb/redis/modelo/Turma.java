package com.ifpb.redis.modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunos;
    private String disciplina;

    public Turma(Professor professor, String disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        alunos = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "com.ifpb.redis.modelo.Turma{" +
                "professor=" + professor +
                ", alunos=" + alunos +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
