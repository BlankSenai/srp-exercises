import java.util.ArrayList;
import java.util.List;

public class Boletim {
    private final String nomeAluno;
    private final List<Double> notas = new ArrayList<>();

    public Boletim(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String gerarSituacao() {
        return calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public List<Double> getNotas() {
        return new ArrayList<>(notas);
    }
}
