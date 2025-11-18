public class Usuario {

    private TipoUsuario tipoUsuario;

    public Usuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void analisar()
    {
        System.out.println("O calculo do ciente ficou: " + tipoUsuario.calculo());
    }
}