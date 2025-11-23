public class MainBoletim {
    public static void main(String[] args) throws Exception {
        Boletim b = new Boletim("Gabriel");
        b.adicionarNota(8);
        b.adicionarNota(6);

        new BoletimRepositorioArquivo().salvar(b);
        new BoletimEmailService().enviar(b, "gabriel@gmail.com");
    }
}
