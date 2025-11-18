public class Transacao {

    protected float valor;
    protected String geolocalizacao;
    protected String historico;
    protected String dispositivo;

    public Transacao(float valor, String geolocalizacao, String historico, String dispositivo) {
        this.valor = valor;
        this.geolocalizacao = geolocalizacao;
        this.historico = historico;
        this.dispositivo = dispositivo;
    }

}