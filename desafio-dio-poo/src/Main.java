import dio.desafio.bootcamp.Bootcamp;
import dio.desafio.bootcamp.Curso;
import dio.desafio.bootcamp.Desenvolvedor;
import dio.desafio.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso C#");
        curso1.setDescricao("Curso focado no basico da linguagem C#");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso NoSQL");
        curso2.setDescricao("Curso focado no basico de NoSQL");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de C#");
        mentoria.setDescricao("Mentoria do curso de C#");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desenvolvedor C#");
        bootcamp.setDescricao("Bootcamp focado no aprendizado de C#");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor devArthur = new Desenvolvedor();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-------------------------------------------");
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Arthur:" + devArthur.getConteudosConcluidos());
        System.out.println("XP TOTAL:" + devArthur.calcularTotalXp());

        System.out.println("==================================================================");

        Desenvolvedor devErika = new Desenvolvedor();
        devErika.setNome("Erika");
        devErika.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Erika:" + devErika.getConteudosInscritos());
        devErika.progredir();
        devErika.progredir();
        devErika.progredir();
        System.out.println("-------------------------------------------");
        System.out.println("Conteúdos Inscritos Erika:" + devErika.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Erika:" + devErika.getConteudosConcluidos());
        System.out.println("XP TOTAL:" + devErika.calcularTotalXp());

    }

}
