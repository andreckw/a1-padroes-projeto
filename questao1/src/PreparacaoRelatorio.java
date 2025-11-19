public abstract  class PreparacaoRelatorio implements IRelatorio {
    protected IRelatorio relatorio;

    public PreparacaoRelatorio(IRelatorio relatorio) {
        this.relatorio = relatorio;
    }

}