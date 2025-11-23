public class MainBackup {
    private final BackupService backupService = new BackupService();
    private final NotificacaoEmailService emailService = new NotificacaoEmailService();
    private final BackupLogger logger = new BackupLogger();

    public void executarBackup(String origem, String destino, String zip, String email) {
        logger.registrarLog("Iniciando backup...");
        backupService.copiarArquivos(origem, destino);
        backupService.compactarArquivos(zip);
        emailService.enviarEmailNotificacao(email);
        logger.registrarLog("Backup finalizado!");
    }
}
