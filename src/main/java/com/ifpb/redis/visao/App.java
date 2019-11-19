package com.ifpb.redis.visao;

import com.google.gson.Gson;
import com.ifpb.redis.modelo.Aluno;
import com.ifpb.redis.modelo.Professor;
import com.ifpb.redis.modelo.Turma;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.params.SetParams;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Gson gson = new Gson();
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        Professor professor = new Professor(123, "João",
                "Mestrado");
        List<Aluno> alunos = Arrays.asList(
            new Aluno("123.123.123-12", "Pedro", "ADS"),
            new Aluno("111.111.111-01", "Maria", "ADS")
        );
        Turma turma = new Turma(professor, "Banco II");
        turma.setAlunos(alunos);

        //Atribuir um valor a uma chave
//        System.out.println(jedis.set(turma.getDisciplina(), gson.toJson(turma)));

        //Retornar o valor atribuído a uma chave
//        com.ifpb.redis.modelo.Turma turma1 = gson.fromJson(jedis.get("Banco II"), com.ifpb.redis.modelo.Turma.class);
//        System.out.println(turma1);

//        System.out.println(jedis.del("Banco II"));

        //Atribuir valor a uma chave, com TTL (2 horas) e somente setar caso não exista (NX)
        System.out.println(jedis.set(turma.getDisciplina(), gson.toJson(turma),
                SetParams.setParams().ex(7200).nx()));

    }

}
