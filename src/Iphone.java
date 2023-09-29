
public class Iphone implements Internet, Ligacao, Reprodutor{


    private String musica;
    private String numeroTelefone;
    private String website;

    public void tocar(String musica) {
        this.musica = musica;
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        System.out.println("Ligando para: " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String website) {
        this.website = website;
        System.out.println("Exibindo página: " + website);
    }

    @Override
    public void adicionarNovaAba(String website) {
        System.out.println("Adicionando nova aba: ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: ");
    }

        public static void main(String[] args) {
            Iphone meuIphone = new Iphone();
            
            meuIphone.tocar("Minha Música Favorita");
            meuIphone.pausar();
            meuIphone.selecionarMusica("Nova Música");
            
            meuIphone.ligar("123456789");
            meuIphone.atender();
            meuIphone.iniciarCorreioVoz();
            
            meuIphone.exibirPagina("www.dio.me");
            meuIphone.adicionarNovaAba("web.dio.me/track/santander-bootcamp-2023-backend-java");
            meuIphone.atualizarPagina();
        }
    }
    

