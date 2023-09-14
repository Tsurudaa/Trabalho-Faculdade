import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);

        int op;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Pedido");
            System.out.println("2. Deletar Pedido");
            System.out.println("3. Editar Pedido");
            System.out.println("4. Listar Pedidos");
            System.out.println("5. Sair");
            System.out.println("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nome do Prato: ");
                    String nomePrato = scanner.nextLine();
                    System.out.println("Número do pedido: ");
                    int numeroPedido = scanner.nextInt();
                    System.out.println("Mesa: ");
                    int mesa = scanner.nextInt();

                    Pedido pedido = new Pedido(nomePrato, numeroPedido, mesa);
                    restaurante.adicionarPedido(pedido);
                    System.out.println("Pedido adicionado.");
                    break;
                case 2:
                    System.out.println("Deletar Pedido");
                    System.out.println("Número do pedido: ");
                    int delPedido = scanner.nextInt();
                    restaurante.deletarPedido(delPedido);
                    break;
                case 3:
                    System.out.print("Número do pedido a ser editado: ");
                    int editPedido = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome do prato: ");
                    String novoNomePrato = scanner.nextLine();
                    System.out.print("Nova mesa: ");
                    int novaMesa = scanner.nextInt();

                    Pedido novoPedido = new Pedido(novoNomePrato, editPedido, novaMesa);
                    restaurante.editarPedido(editPedido, novoPedido);
                    break;
                case 4:
                    restaurante.listarPedidos();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op !=5);
    }
}