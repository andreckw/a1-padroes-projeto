public class RelatorioDiario extends PreparacaoRelatorio {

    public RelatorioDiario(IRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String dados() {
        return "Dados diarios";
    }

    @Override
    public String metricas() {
        return "Metricas diarias";
    }

    @Override
    public String formato() {
        return "Formato diario";
    }
    
}