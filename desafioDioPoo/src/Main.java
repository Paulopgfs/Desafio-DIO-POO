import br.com.diodesafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java POO");
        curso1.setDescricao("Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Java");
        mentoria.setData(LocalDate.now());

//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Curso Java POO");
        bootcamp.setDescricao("Java");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Gustavo:\n" + devGustavo.getConteudosInscritos());
        devGustavo.progrerdir();
        devGustavo.progrerdir();
        System.out.println("-----------------------");
        System.out.println("Conteudo Inscritos Gustavo:\n" + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gustavo:\n" + devGustavo.getConteudosConcluidos());
        System.out.println("XP:" + devGustavo.calcularTotalXp());


        System.out.println("------------------------------------------------------------\n");

        Dev devVeronica = new Dev();
        devVeronica.setNome("Veronica");
        devVeronica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Veronica:\n" + devVeronica.getConteudosInscritos());
        devVeronica.progrerdir();
        devVeronica.progrerdir();
        devVeronica.progrerdir();
        System.out.println("-----------------------");
        System.out.println("Conteudo Inscritos Veronica:\n" + devVeronica.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Veronica:\n" + devVeronica.getConteudosConcluidos());
        System.out.println("XP:" + devVeronica.calcularTotalXp());




    }
}
