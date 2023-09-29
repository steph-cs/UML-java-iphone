public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: "+url);
        
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: "+url);
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
        
    }

    //AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+numero);
       
    }

    @Override
    public void atender() {
        System.out.println("Atendendo IPhone");
        
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando coreio de voz");
        
    }

    //ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
        
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: "+musica);
        
    }

}
