import java.time.LocalTime;

public class Relogio {
    public LocalTime agora() {
        return LocalTime.now();
    }

    public void mostrarHora() {
        System.out.println(agora());
    }
}
