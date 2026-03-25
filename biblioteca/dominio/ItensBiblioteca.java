package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public abstract class ItensBiblioteca {

    protected TipoItem tipoItem;
    protected String titulo;
    protected boolean estado;

    //public abstract void emprestarItem();
    //public abstract void devolverItem();
    //public abstract void verrificarDisponibilidade();

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ItensBiblioteca{" +
                "tipoItem = " + tipoItem +
                ", titulo =' " + titulo + '\'' +
                ", estado = " + estado +
                '}';
    }
}
