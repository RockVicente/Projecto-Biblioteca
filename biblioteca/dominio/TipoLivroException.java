package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public class TipoLivroException extends Exception {
    private String nomeRelatorio;

    public TipoLivroException(String nomeRelatorio){
        nomeRelatorio = nomeRelatorio;
    }

    @Override
    public String getMessage() {
        return nomeRelatorio+" Não existe no tipo de livro...";
    }
}
