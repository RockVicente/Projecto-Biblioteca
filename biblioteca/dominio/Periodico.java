package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public class Periodico extends ItensBiblioteca{
    private TipoPeriodico tipoPeriodico;
    private int volume;
    private int edicao;
    private String dataPublicacao;

    public TipoPeriodico getTipoPeriodico() {
        return tipoPeriodico;
    }

    public void setTipoPeriodico(TipoPeriodico tipoPeriodico) {
        this.tipoPeriodico = tipoPeriodico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "tipoItem=" + tipoItem +
                ", tipoPeriodico=" + tipoPeriodico +
                ", volume=" + volume +
                ", edicao=" + edicao +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
