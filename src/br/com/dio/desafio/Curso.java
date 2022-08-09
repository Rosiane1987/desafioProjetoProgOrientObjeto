package br.com.dio.desafio;

public class Curso extends conteudo {      //filha de conteudo

    private int cargahoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargahoraria;
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public Curso() {
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
