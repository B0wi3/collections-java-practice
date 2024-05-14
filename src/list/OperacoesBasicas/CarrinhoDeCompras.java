package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItems;

    public CarrinhoDeCompras() {
        this.listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        listaItems.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item t : listaItems) {
            if (t.getNome() == nome) {
                itensParaRemover.add(t);
            }
        }
        listaItems.removeAll(itensParaRemover);
    }

    public Double calcularValorTotal() {
        Double total = 0.0;
        for (Item t : listaItems) {
            Double totalPorItem = t.getPreco() * t.getQuantidade();
            total += totalPorItem;
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(listaItems);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        carrinho.adicionarItem("Maca", 0.99, 10);
        carrinho.adicionarItem("Lasanha", 10.50, 20);
        carrinho.adicionarItem("Lasanha1", 19.50, 220);
        carrinho.adicionarItem("Gameboy", 1750.00, 15);

        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());

        carrinho.removerItem("Lasanha1");
        carrinho.removerItem("Gameboy");

        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}
