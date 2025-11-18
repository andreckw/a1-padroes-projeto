public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario(new Agressivo());
        user.analisar();// Agressivo = O calculo do ciente ficou: 220.0

        user.setTipoUsuario(new Moderado()); 
        user.analisar();// Moderado = O calculo do ciente ficou: 50.0

        user.setTipoUsuario(new Conservador());
        user.analisar();// Conservador = O calculo do ciente ficou: 10.0
    }
}
