public abstract class Observador {
    protected Sensor sensor;

    public Observador(Sensor sensor) {
        this.sensor = sensor;
    }

    public abstract void update();
}