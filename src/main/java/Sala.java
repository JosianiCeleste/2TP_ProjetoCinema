import java.util.List;

public class Sala {
    private int numero;
    private List<Lugar> lugares;

    public Sala(int numero, List<Lugar> lugares) {
        this.numero = numero;
        this.lugares = lugares;
    }

    //region Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    //endregion

}
