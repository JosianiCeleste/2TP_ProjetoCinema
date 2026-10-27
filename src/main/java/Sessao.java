import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Sessao {
    private String nomeFilme;
    private LocalDateTime datahora;
    private Sala sala;
    private Set<String> lugaresOcupados;

    public Sessao(String nomeFilme, LocalDateTime datahora, Sala sala) {
        this.nomeFilme = nomeFilme;
        this.datahora = datahora;
        this.sala = sala;
        this.lugaresOcupados = new HashSet<>();
    }

    private String gerarChave(Lugar lugar) {
        return lugar.getFila() + "-" + lugar.getNumero();
    }

    public boolean isLugarOcupado(Lugar lugar) {
        return lugaresOcupados.contains(gerarChave(lugar));
    }

    public void ocuparLugar(Lugar lugar) {
        lugaresOcupados.add(gerarChave(lugar));
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "nomeFilme='" + nomeFilme + '\'' +
                ", datahora=" + datahora +
                ", sala=" + sala.getNumero() +
                '}';
    }

    //region Getters e Setters
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    //endregion
}