package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Photoshop", "Curso para Social Media", 12);
        Curso curso2 = new Curso("Figma", "Curso para Design de Sites", 23);

        System.out.println(curso1 + "\n" + curso2 + "\n");

        Mentoria mentoria1 = new Mentoria("Mentoria para Novos Designers",
                "Captação Inteligente de Clientes", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria para Precificação",
                "Como Precificar seus Projetos", LocalDate.now());

        System.out.println(mentoria1 + "\n" + mentoria2);
    }
}
