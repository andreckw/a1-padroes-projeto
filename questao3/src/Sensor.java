
import java.util.ArrayList;
import java.util.List;

public class Sensor {
    protected float temperatura;
    protected float umidade;
    protected float indice;

    protected List<Observador> observadors = new ArrayList<>();

    public void attach(Observador observador) {
        observadors.add(observador);
    }


    private void notifyAllObservadors() {
        for (Observador observador : observadors) {
            observador.update();
        }
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notifyAllObservadors();
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
        notifyAllObservadors();
    }

    public void setIndice(float indice) {
        this.indice = indice;
        notifyAllObservadors();
    }
}