package Ex_1;

public class Produto {
    private String nome;
    private float preco;
    private int qtdeEstoque;

    public Produto(){

    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public int getQtdeEstoque() {
        return this.qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        if(qtdeEstoque >= 0) {
            this.qtdeEstoque = qtdeEstoque;
        } else {
            System.out.println("Quantidade de estoque não pode ser negativa.");
        }
    }

    public float totalValorEstoque() {
        return preco * qtdeEstoque;
    }

    public boolean verificarProdutoDisponivel() {
        return qtdeEstoque > 0;
    }
}
