public class RelatorioSemanal extends PreparacaoRelatorio {

    public RelatorioSemanal(IRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String dados() {
        return "Dados semanais";
    }

    @Override
    public String metricas() {
        return "Metricas semanais";
    }

    @Override
    public String formato() {
        return "Formato semanais";
    }
    
}