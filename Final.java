public class Final {
    public static void main(String[] args) {
    iPhone Iphone = new iPhone();
    AparelhoEletronico aparelhoEletronico = Iphone;
    ReprodutorMusical reprodutorMusical = Iphone;
    NavegadorInternet navegadorInternet = Iphone;

    aparelhoEletronico.ligar();
    aparelhoEletronico.atender();
    aparelhoEletronico.iniciarCorreioVoz();


navegadorInternet.exibirPagina();
navegadorInternet.adicionarNovaAba();
navegadorInternet.atualizarPagina();

reprodutorMusical.tocar(); 
reprodutorMusical.pausar(); 
reprodutorMusical.selecionarMusica();

}}
