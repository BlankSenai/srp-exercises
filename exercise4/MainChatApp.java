public class MainChatApp {
    private final MensagemService mensagemService = new MensagemService();
    private final MensagemRepositorio repositorio = new MensagemRepositorio();
    private final HistoricoService historicoService = new HistoricoService();
    private final NotificacaoService notificacaoService = new NotificacaoService();

    public void enviarMensagem(String texto) {
        mensagemService.enviarMensagem(texto);
        repositorio.salvarMensagemNoBanco(texto);
    }

    public void exibirHistorico() {
        historicoService.exibirHistorico();
    }

    public void notificarContato(String contato) {
        notificacaoService.notificarContato(contato);
    }
}
