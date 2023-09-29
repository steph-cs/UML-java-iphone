public class App {
    public static void main(String[] args) {

        //Iphone
        IPhone iphone = new IPhone();

        //ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("505 - Artic Monkeys");

        //AparelhoTelefonico
        iphone.ligar("123-123");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        //NavegadorInternet
        iphone.exibirPagina("https://www.web.dio.me/");
        iphone.adicionarNovaAba("https://github.com/digitalinnovationone");
        iphone.atualizarPagina();
    }
}
