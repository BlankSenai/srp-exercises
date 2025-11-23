import java.io.FileWriter;
import java.io.IOException;

public class BoletimRepositorioArquivo {
    public void salvar(Boletim boletim) throws IOException {
        try (FileWriter writer = new FileWriter(boletim.getNomeAluno() + "_boletim.txt")) {
            writer.write("Aluno: " + boletim.getNomeAluno() +
                         "\nMédia: " + boletim.calcularMedia() +
                         "\nSituação: " + boletim.gerarSituacao() + "\n");
        }
    }
}
