package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public class TipoItemException extends Exception{
    private int valorRelatorio;

    public TipoItemException(int valor){
        valorRelatorio = valor;
    }

    @Override
    public String getMessage() {
        return "O valor "+valorRelatorio+ " informaddo para o tipo de Item não existe....";
    }
}
