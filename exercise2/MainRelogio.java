public class MainRelogio {
    private final Relogio relogio = new Relogio();
    private final RelogioRepositorioArquivo repo = new RelogioRepositorioArquivo();
    private final AlarmeService alarme = new AlarmeService();

    public void mostrarHora() {
        relogio.mostrarHora();
    }

    public void salvarHoraEmArquivo() {
        repo.salvarHora(relogio.agora());
    }

    public void tocarAlarme() {
        alarme.tocarAlarme();
    }
}
