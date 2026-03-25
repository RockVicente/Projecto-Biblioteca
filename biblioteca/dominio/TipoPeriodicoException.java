package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public class TipoPeriodicoException extends Exception{
    private String nomeRelatorio;

    public TipoPeriodicoException(String nomeRelatorio){
        nomeRelatorio = nomeRelatorio;
    }

    @Override
    public String getMessage() {
        return nomeRelatorio+" Tipo periodico Invalido...";
    }
}
