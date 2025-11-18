public class App {
    public static void main(String[] args) throws Exception {
        Logging logging = Logging.getInstace();

        logging.adicionarLog("AAAAAAAAAAAAAAAA");

        System.out.println(logging.logs);

        Logging logging2 = Logging.getInstace();

        logging.adicionarLog("BBBBBBBBBBBBBBBBBB");
        System.out.println(logging2.logs);
    }
}
