public class BoletimEmailService {
    public void enviar(Boletim boletim, String email) {
        System.out.println("Enviando boletim de " + boletim.getNomeAluno() + " para " + email);
    }
}
