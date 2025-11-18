public class PainelControle extends Observador {

    public PainelControle(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void update() {
        System.out.println("indice de poluicao: " + sensor.indice);
        System.out.println("Umidade: " + sensor.umidade);
        System.out.println("Temperatura: " + sensor.temperatura);
    }
    
}