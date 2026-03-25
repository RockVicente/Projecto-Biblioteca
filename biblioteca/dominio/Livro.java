package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public class Livro extends ItensBiblioteca{
    private TipoLivro tipoLivro;
    private String autor;
    private String editora;

    public TipoLivro getTipoLivro() {
        return tipoLivro;
    }

    public void setTipoLivro(TipoLivro tipoLivro) {
        this.tipoLivro = tipoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tipoItem=" + tipoItem +
                ", tipoLivro=" + tipoLivro +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
