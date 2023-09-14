public class Pedido {
    private String nomePrato;
    private int numeroPedido;
    private int mesa;

    public Pedido(String nomePrato, int numeroPedido, int mesa) {
        this.nomePrato = nomePrato;
        this.numeroPedido = numeroPedido;
        this.mesa = mesa;
    }

    // Getters e Setters

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

}