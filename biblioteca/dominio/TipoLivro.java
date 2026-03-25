package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public enum TipoLivro {
    ROMANCE("romance"), // histórias de amor
    FICCAO("ficcao"), // histórias imaginárias
    FANTASIA("fantasia"), // magia, mundos imaginários
    TERROR("terror"), // histórias assustadoras
    MISTERIO("misterio"), // investigação, suspense
    BIOGRAFIA("biografia"), // história de vida de alguém
    HISTORIA("historia"), //fatos históricos
    EDUCACAO("educacao"), // livros escolares ou didáticos
    CIENCIA("ciencia"), //ciência geral
    TECNOLOGIA("tecnologia"), // programação, informática, etc.
    RELIGIAO("religiao"), // livros religiosos
    AUTOAJUDA("autoajuda"), // desenvolvimento pessoal
    INFANTIL("infantil"), // livros para crianças
    POESIA("poesia"), //poemas
    OUTROS("outros"); // para qualquer coisa que não se encaixe

    private String nomeRelatorio;

    TipoLivro(String tipoLivro) {
        this.nomeRelatorio = tipoLivro;
    }

    /*
    forca o retornar o tipo de livro mesmo nao respeitando o letras maiusculas,
    da excecao se informarmos um tipo de livro que nao exista
     */
    public static TipoLivro tipoItemPornomeRelatorio(String nomeRelatorio) throws TipoLivroException{
        for (TipoLivro tipoLivro: values()){
            if (tipoLivro.getNomeRelatorio().equalsIgnoreCase(nomeRelatorio)){
                return tipoLivro;
            }
        }
        //lancei para dar excecao se digitarem um tipo de livro que nao exista aqui
        throw new TipoLivroException(nomeRelatorio);
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
