package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<conteudo> conteudosInscritos = new LinkedHashSet<>(); //guardar inscrição na ordem
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>(); //set não permite repetição

    public void inscreverbootcamp(bootcamp Bootcamp){
        this.conteudosInscritos.addAll(Bootcamp.getConteudos());
        Bootcamp.getDevsInscritos().add(this);

    }
    public void progredir() {
        Optional<conteudo> Conteudo = this.conteudosInscritos.stream().findFirst(); //fazer o curso em ordem que foi colocado na plataforma
        if (Conteudo.isPresent()) {
            this.conteudosConcluidos.add(Conteudo.get());
            this.conteudosInscritos.remove(Conteudo.get());
        }else {
            System.out.println("você não está matriculado em nenhum conteudo");
        }

    }
    public double calcularTotalXP() {  //peguei cada conteúdo de set conteudosConcluidos, peguei o xp de cada conteudo e soma
        return this.conteudosConcluidos
                .stream().mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //se faz necessário por está trbalhando hash e set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
