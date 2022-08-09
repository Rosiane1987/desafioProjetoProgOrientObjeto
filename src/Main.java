import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Princípios de Desenvolvimento de Software");
        curso1.setDescricao("Introdução a programação; pensamento computacional e Github");
        curso1.setCargahoraria(11);

        Curso curso2 = new Curso();
        curso2.setTitulo("Começando a programar em java");
        curso2.setDescricao("IDE's; tipos de dados; métodos;  estruturas: condicional, fluxo de controle, repetição, arrays; collections");
        curso2.setCargahoraria(17);

        Curso curso3 = new Curso();
        curso3.setTitulo("Dominando Java");
        curso3.setDescricao("Programação orientada a objeto; debugging; tratamentos de excessões");
        curso3.setCargahoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Santander Code Girls");
        mentoria.setDescricao("Aula inaugural");
        mentoria.setData(LocalDate.now());

        desafioCodeProje desafioCode = new desafioCodeProje();
        desafioCode.setTitulo("Desafio de código");
        desafioCode.setDescricao("Intervalo; Dominó;Seleção de índice de valor");
        desafioCode.setCargahorariadesafio(1);
        desafioCode.setDatadesafio(LocalDate.now());

        desafioCodeProje desafioProje = new desafioCodeProje();
        desafioProje.setTitulo("Desafio de projeto");
        desafioProje.setDescricao("Abstraindo um bootcamp com orientação a objetos");
        desafioProje.setCargahorariadesafio(1);
        desafioProje.setDatadesafio(LocalDate.now());


        bootcamp Bootcamp = new bootcamp();
        Bootcamp.setNome("Bootcamp Santander Code Girls");
        Bootcamp.setDescricao("Santander 2022: As que concluirem terão certificados e a chance de ingressar no mercado de trabalho");
        Bootcamp.getConteudos().add(curso1);
        Bootcamp.getConteudos().add(curso2);
        Bootcamp.getConteudos().add(curso3);
        Bootcamp.getConteudos().add(mentoria);
        Bootcamp.getConteudos().add(desafioCode);
        Bootcamp.getConteudos().add(desafioProje);

        Dev devRosianeMaia = new Dev();
        devRosianeMaia.setNome("Rosiane Maia");
        devRosianeMaia.inscreverbootcamp(Bootcamp);
        System.out.println("Conteudos Inscritos" + devRosianeMaia.getConteudosInscritos());
        devRosianeMaia.progredir();
        devRosianeMaia.progredir();
        devRosianeMaia.progredir();
        devRosianeMaia.progredir();
        devRosianeMaia.progredir();
        devRosianeMaia.progredir();
        System.out.println("Conteudos Inscritos" + devRosianeMaia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devRosianeMaia.getConteudosConcluidos());
        System.out.println("XP:" +devRosianeMaia.calcularTotalXP());

        System.out.println("***************");

        Dev devWilliamLucas = new Dev();
        devWilliamLucas.setNome("William Lucas");
        devWilliamLucas.inscreverbootcamp(Bootcamp);
        System.out.println("Conteudos Inscritos" + devWilliamLucas.getConteudosInscritos());
        devWilliamLucas.progredir();
        devWilliamLucas.progredir();
        devWilliamLucas.progredir();
        devWilliamLucas.progredir();
        System.out.println("Conteudos Inscritos" + devWilliamLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devWilliamLucas.getConteudosConcluidos());
        System.out.println("XP: " + devWilliamLucas.calcularTotalXP());


    }
}
