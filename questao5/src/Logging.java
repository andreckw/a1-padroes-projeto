public class Logging {

    protected String logs = "";
    private static Logging instace;

    private Logging()
    {

    }

    public static  Logging getInstace() {
        if (instace == null) {
            instace = new Logging();
        }

        return instace;
    }

    public void adicionarLog(String log)
    {
        logs += "\n"+log;
    }
}