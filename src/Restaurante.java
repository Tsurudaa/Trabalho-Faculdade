import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Restaurante {
    private List<Pedido> pedidos;

    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void deletarPedido (int numeroPedido) {
        Iterator<Pedido> iterator = pedidos.iterator();
        while (iterator.hasNext()) {
            Pedido pedido = iterator.next();
            if (pedido.getNumeroPedido() == numeroPedido) {
                iterator.remove();
                System.out.println("Pedido removido.");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }
    public void editarPedido(int numeroPedido, Pedido novoPedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            if (pedido.getNumeroPedido() == numeroPedido) {
                pedidos.set(i, novoPedido);
                System.out.println("Pedido Editado.");
                return;
            }
        }
    }
    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Nome do prato: " + pedido.getNomePrato());
            System.out.println("Número do pedido: " + pedido.getNumeroPedido() );
            System.out.println("Mesa: " + pedido.getMesa());
            System.out.println("=============================");
        }
    }
}
