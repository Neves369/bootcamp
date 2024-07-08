package bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação dos cursos e mentorias
        Curso curso1 = new Curso("Java Básico", "Aprenda os fundamentos do Java", 8);
        Curso curso2 = new Curso("Java Avançado", "Aprofunde-se em Java", 12);
        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", "Conselhos para sua carreira em TI", LocalDate.now());

        // Criação do Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Um bootcamp intensivo para Java Developers");
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);

        // Criação e inscrição de Devs
        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Maria");

        bootcamp.inscreverDev(dev1);
        bootcamp.inscreverDev(dev2);

        dev1.inscreverCurso(curso1);
        dev1.inscreverMentoria(mentoria1);

        dev2.inscreverCurso(curso2);

        // Listar informações do Bootcamp
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Cursos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getTitulo() + " (" + curso.getCargaHoraria() + " horas)");
        }
        System.out.println("Mentorias:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getTitulo() + " (Data: " + mentoria.getData() + ")");
        }
        System.out.println("Devs Inscritos:");
        for (Dev dev : bootcamp.getDevsInscritos()) {
            System.out.println("- " + dev.getNome());
        }
    }
}

