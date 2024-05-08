public class Celular extends IPhone {
    public static void main(String[] args) {
        Celular iphone = new Celular();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();

    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web.");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página web.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
