package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso(12);
        curso1.setTitulo("Photoshop");
        curso1.setDescricao("Curso para Social Media");

        Conteudo curso2 = new Curso(23);
        curso2.setTitulo("Figma");
        curso2.setDescricao("Curso para Design de Sites");

        System.out.println(curso1 + "\n" + curso2 + "\n");

        Conteudo mentoria1 = new Mentoria(LocalDate.now());
        mentoria1.setTitulo("Mentoria para Novos Designers");
        mentoria1.setDescricao("Captação Inteligente de Clientes");

        Conteudo mentoria2 = new Mentoria(LocalDate.now());
        mentoria2.setTitulo("Mentoria para Precificação");
        mentoria2.setDescricao("Como Precificar seus Projetos");

        System.out.println(mentoria1 + "\n" + mentoria2);
    }
}
