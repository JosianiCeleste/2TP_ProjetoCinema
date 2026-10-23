import java.time.LocalDateTime;

public class Sessao {
    private String nomeFilme;
    private LocalDateTime datahora;

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
    //endregion
}
