public class RelatorioEmergencial extends PreparacaoRelatorio {

    public RelatorioEmergencial(IRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String dados() {
        return "Dados Emergenciais";
    }

    @Override
    public String metricas() {
        return "Metricas Emergenciais";
    }

    @Override
    public String formato() {
        return "Formato Emergenciais";
    }

}