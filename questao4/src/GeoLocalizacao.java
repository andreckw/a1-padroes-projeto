public class GeoLocalizacao extends Validar {

    @Override
    protected boolean validar(Transacao transacao) {
        return transacao.geolocalizacao.equals("Brazil");
    }

    @Override
    public void verificar(Transacao transacao) {
        if (!validar(transacao)) {
            System.out.println("Geo localizacao errada");
            return ;
        }

        if (proximo != null) {
            proximo.verificar(transacao);
        }
    }

}
