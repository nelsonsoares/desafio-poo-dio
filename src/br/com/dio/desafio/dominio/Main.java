package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev nelsonSoares = new Dev();
        nelsonSoares.setNome("Nelson Soares");
        nelsonSoares.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + nelsonSoares.getConteudosInscritos());
        nelsonSoares.progredir();
        System.out.println("Conteúdos Concluídos " + nelsonSoares.getConteudosConcluidos());
        System.out.println("XP: " + nelsonSoares.totalCalcularXp());

        System.out.println(" ");

        Dev brunoPaiva = new Dev();
        brunoPaiva.setNome("Bruno Paiva");
        brunoPaiva.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + brunoPaiva.getConteudosInscritos());
        brunoPaiva.progredir();
        System.out.println("Conteúdos Concluídos " + brunoPaiva.getConteudosConcluidos());
        System.out.println("XP: " + brunoPaiva.totalCalcularXp());

        System.out.println(" ");

        Dev izaPaiva = new Dev();
        izaPaiva.setNome("Iza Paiva");
        izaPaiva.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + izaPaiva.getConteudosInscritos());
        izaPaiva.progredir();
        System.out.println("Conteúdos Concluídos " + izaPaiva.getConteudosConcluidos());
        System.out.println("XP: " + izaPaiva.totalCalcularXp());

    }
}
