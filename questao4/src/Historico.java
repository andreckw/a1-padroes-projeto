public class Historico extends Validar {

    @Override
    protected boolean validar(Transacao transacao) {
        return transacao.historico.isEmpty();
    }

    @Override
    public void verificar(Transacao transacao) {
        if (validar(transacao)) {
            System.out.println("Historico do cliente e suspeito");
            return;
        }

        if (proximo != null) {
            proximo.verificar(transacao);
        }
    }

}
