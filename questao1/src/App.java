public class App {
    public static void main(String[] args) throws Exception {
        IRelatorio relatorio = new Relatorio();

        System.out.println(relatorio.dados());
        System.out.println(relatorio.formato());
        System.out.println(relatorio.metricas());

        IRelatorio semanal = new RelatorioSemanal(relatorio);
        IRelatorio diario = new RelatorioDiario(relatorio);
        IRelatorio emergencial = new RelatorioEmergencial(relatorio);

        System.out.println(semanal.dados());
        System.out.println(semanal.formato());
        System.out.println(semanal.metricas());

        System.out.println(diario.dados());
        System.out.println(diario.formato());
        System.out.println(diario.metricas());

        System.out.println(emergencial.dados());
        System.out.println(emergencial.formato());
        System.out.println(emergencial.metricas());
    }
}
