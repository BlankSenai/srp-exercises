import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class RelogioRepositorioArquivo {
    public void salvarHora(LocalTime hora) {
        try (FileWriter f = new FileWriter("hora.txt")) {
            f.write(hora.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
