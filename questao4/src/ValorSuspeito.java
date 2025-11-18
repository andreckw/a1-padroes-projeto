
public class ValorSuspeito extends Validar {

    @Override
    public void verificar(Transacao transacao) {
        if (!validar(transacao)) {
            System.out.println("Valor suspeito");
            return;
        }

        if (proximo != null) {
            proximo.verificar(transacao);
        }
    }

    @Override
    protected boolean validar(Transacao transacao) {
        return transacao.valor > 0;
    }

}