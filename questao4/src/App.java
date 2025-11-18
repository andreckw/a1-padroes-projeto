
public class App {
    public static void main(String[] args) throws Exception {
        VerificarTransacao verificarTransacao = new VerificarTransacao();

        Transacao transacao1 = new Transacao(20, "Brazil", "10, 20, 30", "Celular");
        Transacao transacao2 = new Transacao(-20, "Brazil", "10, 20, 30", "Celular");
        Transacao transacao3 = new Transacao(20, "America", "10, 20, 30", "Celular");
        Transacao transacao4 = new Transacao(20, "Brazil", "", "Celular");
        Transacao transacao5 = new Transacao(20, "Brazil", "10, 20, 30", "Desktop");

        verificarTransacao.inicarVerificacao(transacao1); // nao aparece nada pois esta certo
        verificarTransacao.inicarVerificacao(transacao2); // Valor suspeito
        verificarTransacao.inicarVerificacao(transacao3); // Geo localizacao errada
        verificarTransacao.inicarVerificacao(transacao4); // Historico do cliente e suspeito
        verificarTransacao.inicarVerificacao(transacao5); // Disposivo errado
    }
}
