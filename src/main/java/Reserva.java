import java.util.List;

public class Reserva {
    private String id;
    private Cliente cliente;
    private Sessao sessao;
    private List<Lugar> lugares;

    public Reserva(String id, Cliente cliente, Sessao sessao, List<Lugar> lugares) {
        this.id = id;
        this.cliente = cliente;
        this.sessao = sessao;
        this.lugares = lugares;
    }

    public boolean confirmarReserva() {
        for (Lugar lugar : lugares) {
            if (sessao.isLugarOcupado(lugar)) {
                return false;
            }
        }

        for (Lugar lugar : lugares) {
            sessao.ocuparLugar(lugar);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", cliente=" + cliente +
                ", sessao=" + sessao +
                ", lugares=" +lugares;
    }

    //region Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }
        //endregion
}
