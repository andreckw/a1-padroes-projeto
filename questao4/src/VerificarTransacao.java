
import java.util.ArrayList;
import java.util.List;

public class VerificarTransacao {

    private Validar primeiraVerificao;

    public VerificarTransacao() {
        
        List<Validar> auxVerificacaoes = new ArrayList<>();

        auxVerificacaoes.add(new ValorSuspeito());
        auxVerificacaoes.add(new Historico());
        auxVerificacaoes.add(new GeoLocalizacao());
        auxVerificacaoes.add(new Dispositivo());
        
        Validar nextValidar = null;
        for (Validar validar : auxVerificacaoes) {
            // A cada iteracao adiciona o handle antigo no handle atual
            validar.setValidar(nextValidar);

            nextValidar = validar;
        }

        this.primeiraVerificao = nextValidar;
    }

    public void inicarVerificacao(Transacao transacao) {
        primeiraVerificao.verificar(transacao);
    }

}