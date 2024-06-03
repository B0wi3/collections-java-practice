package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void imprimirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double valorTotal() {
        double valorTotal = 0;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto produtoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > maiorPreco) { produtoMaisCaro = p; }
            }
        }
        return produtoMaisCaro;
    }
}
