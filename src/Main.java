import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {

        Curso curso1= new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso java Dio");
        curso1.setCargaHoraria(4);

        Curso curso2= new Curso();

        curso2.setTitulo("Curso JUnit");
        curso2.setDescricao("Desbranvando testes com o JUnit");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java Dio");
        mentoria1.setDescricao("curso pratico sobre poo");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Entendendo POO e seus paradgimas");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        System.out.println("====================");

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();

        System.out.println("Conteudos Inscritos"+devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularTotalXp());


        System.out.println("====================");

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();

        System.out.println("Conteudos Inscritos"+devRodrigo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        System.out.println("====================");








    }
}