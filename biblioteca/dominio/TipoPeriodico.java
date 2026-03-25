package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public enum TipoPeriodico {
    JORNAIS("jornais"),
    REVISTAS("revistas"),
    BOLETINS("boletins");

    private String nomeRelatorio;

    TipoPeriodico(String nomeRelatorio){
        nomeRelatorio = nomeRelatorio;
    }

    public TipoPeriodico tipoPeriodicoPorNomeRelatorio(String nomeRelatorio) throws TipoPeriodicoException{
        for (TipoPeriodico tipoPeriodico: values()){
            if (tipoPeriodico.getNomeRelatorio().equalsIgnoreCase(nomeRelatorio)){
                return tipoPeriodico;
            }
        }
        throw new TipoPeriodicoException(nomeRelatorio);
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
