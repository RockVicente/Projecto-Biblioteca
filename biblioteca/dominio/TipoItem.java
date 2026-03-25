package vicente.rock.maratonajava.oop.dominio.biblioteca.dominio;

public enum TipoItem {
    LIVROS(1),
    PERIODICOS(2);
    //MANUSCRITOS_DOCUMENTOS(3),
    //MONOGRAFIAS_TESES(4);

    private int tipoItem;

    TipoItem(int tipoItem) {
        this.tipoItem = tipoItem;
    }

    /*O metodo abaixo força o retorno do tipo item acima mencionados
    se o valor relatorio for igual ao valor do construtor
    */
    public static TipoItem tipoItemPorValorRelatorio(int valorRelatorio) throws TipoItemException{
        for (TipoItem tipoItem: values()){
            if (tipoItem.getTipoItem() == valorRelatorio){
                return tipoItem;
            }
        }
        throw new TipoItemException(valorRelatorio);
    }

    public int getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(int tipoItem) {
        this.tipoItem = tipoItem;
    }

}
