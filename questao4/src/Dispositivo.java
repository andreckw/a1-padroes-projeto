public class Dispositivo extends Validar {

    @Override
    public void verificar(Transacao transacao) {
        if (!validar(transacao)) {
            System.out.println("Disposivo errado");
            return;
        }

        if (proximo != null) {
            proximo.verificar(transacao);
        }
    }

    @Override
    protected boolean validar(Transacao transacao) {
        
        return transacao.dispositivo.equals("Celular");
    }

}