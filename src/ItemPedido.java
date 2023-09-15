public class ItemPedido extends Pedido {
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(String nomePrato, int numeroPedido, int mesa, double precoUnitario, int quantidade) {
        super(nomePrato, numeroPedido, mesa);
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularPreco() {
        return precoUnitario * quantidade;
    }
}