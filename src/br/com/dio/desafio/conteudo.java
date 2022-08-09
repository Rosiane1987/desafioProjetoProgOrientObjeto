package br.com.dio.desafio;

public abstract class conteudo {  //implementar esse metodo calcularXP nas classes filhas, evitar
                                  // repetição de código

    protected static final double XP_PADRAO = 10D;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
