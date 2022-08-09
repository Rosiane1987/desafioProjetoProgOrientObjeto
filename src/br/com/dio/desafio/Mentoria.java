package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria  extends conteudo {             //mentoria filha de conteudo: td tem em conteudo tem em mentoria,
                                                    // mas nem tudo que tem em filha tem em conteudo
       private LocalDate data;

    public Mentoria() {
    }

        public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO +20d;
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
