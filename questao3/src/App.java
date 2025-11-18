public class App {
    public static void main(String[] args) throws Exception {
        Sensor sensor = new Sensor();

        sensor.attach(new ModuloAlerta(sensor));
        sensor.attach(new Historico(sensor));
        sensor.attach(new PainelControle(sensor));

        sensor.setIndice(10);
        System.out.println("*---------------------*");
        sensor.setUmidade(10);
        System.out.println("*---------------------*");
        sensor.setTemperatura(19);
    }
}
