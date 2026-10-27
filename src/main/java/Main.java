import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lugar> lugaresSala = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lugaresSala.add(new Lugar('A', i));
        }

        Sala sala1 = new Sala(1, lugaresSala);
        Sessao sessao1 = new Sessao("O Regresso ao Cinema",
                LocalDateTime.of(2026, 10, 30, 21, 30), sala1);

        Cliente cliente1 = new Cliente("912345678");

        List<Lugar> lugaresEscolhidos = new ArrayList<>();
        lugaresEscolhidos.add(lugaresSala.get(0)); // Lugar A1
        lugaresEscolhidos.add(lugaresSala.get(1)); // Lugar A2

        Reserva reserva1 = new Reserva("RES-001", cliente1, sessao1, lugaresEscolhidos);

        if (reserva1.confirmarReserva()) {
            System.out.println("Reserva confirmada: " + reserva1);
        } else {
            System.out.println("Erro: Um ou mais lugares selecionados já estão ocupados!");
        }

        Reserva reserva2 = new Reserva("RES-002", new Cliente("961234567"), sessao1, lugaresEscolhidos);
        if (!reserva2.confirmarReserva()) {
            System.out.println("Erro: Um ou mais lugares selecionados já estão ocupados!");
        }
    }
}