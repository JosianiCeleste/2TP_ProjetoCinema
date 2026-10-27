public class Cliente {
    private String numero;

    @Override
    public String toString() {
        return "Cliente{numero='" + numero + "'}";
    }
    public Cliente(String numero) {
        this.numero = numero;
    }

    //region Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    //endregion
}
