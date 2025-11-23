public class ContaEmailService {
    public void enviarNotificacao(ContaBancaria conta, String email) {
        System.out.println("Enviando notificação para " + email +
                           " | Saldo: " + conta.getSaldo());
    }
}
