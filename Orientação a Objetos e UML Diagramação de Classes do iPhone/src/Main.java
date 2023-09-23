public class Main {
    public static void main(String[] args) {

        TocadorDeMusica Discman = new TocadorDeMusica();

        Discman.tocarMusica();
        Discman.pausarMusica();
        Discman.selecionarMusica();

        Telefone Nokia = new Telefone();
        Nokia.atenderTelefone();
        Nokia.iniciarCorreioVoz();
        Nokia.ligarTelefone();

        Navegador Netscape = new Navegador();
        Netscape.adicionarNovaAba();
        Netscape.atualizarPagina();
        Netscape.exibirPagina();



    }
}