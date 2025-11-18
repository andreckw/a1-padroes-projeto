public class Historico extends Observador {

    public Historico(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void update() {
        System.out.println(sensor.indice +","+ sensor.temperatura + "," + sensor.umidade);
    }
    
}