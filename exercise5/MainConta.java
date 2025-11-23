public class MainConta {
    private final ContaBancaria conta = new ContaBancaria();
    private final ExtratoService extratoService = new ExtratoService();
    private final ContaRepositorioBanco repo = new ContaRepositorioBanco();
    private final ContaEmailService emailService = new ContaEmailService();

    public void depositar(double valor) {
        conta.depositar(valor);
        repo.salvarNoBanco(conta);
    }

    public void sacar(double valor) {
        conta.sacar(valor);
        repo.salvarNoBanco(conta);
    }

    public void gerarExtrato() {
        extratoService.gerarExtrato(conta);
    }

    public void enviarEmail(String email) {
        emailService.enviarNotificacao(conta, email);
    }
}
