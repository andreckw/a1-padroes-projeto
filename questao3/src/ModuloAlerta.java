public class ModuloAlerta extends Observador {

    public ModuloAlerta(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void update() {
        if (sensor.temperatura > 10) {
            System.out.println("Sensor esta com temperatura maior que 10");
        }
    }
    
}