public abstract class Validar {

    protected Validar proximo;

    protected abstract boolean validar(Transacao transacao);
    public abstract void verificar(Transacao transacao);

    public void setValidar(Validar proximo) {
        this.proximo = proximo;
    }
}