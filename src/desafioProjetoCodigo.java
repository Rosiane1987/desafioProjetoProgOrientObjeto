import br.com.dio.desafio.conteudo;

import java.time.LocalDate;

public class desafioProjetoCodigo extends conteudo {

    private int cargahorariadesafio;
    private LocalDate datadesafio;


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargahorariadesafio;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 7d;
    }



    public desafioProjetoCodigo() {   }


    public int getCargahorariadesafio() { return cargahorariadesafio; }

    public void setCargahorariadesafio(int cargahorariadesafio) {
        this.cargahorariadesafio = cargahorariadesafio;
    }

    public LocalDate getDatadesafio() { return datadesafio; }

    public void setDatadesafio(LocalDate datadesafio) {
        this.datadesafio = datadesafio;
    }

    @Override
    public String toString() {
        return "desafioProjetoCodigo{" +
                "cargahorariadesafio=" + cargahorariadesafio +
                ", datadesafio=" + datadesafio +
                '}';
    }
}
