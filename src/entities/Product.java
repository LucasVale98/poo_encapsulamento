package entities;

public class Product {

	private String nome;
	private Double preco;
	private int quantidade;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String nome, Double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Product(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double totalValorNoEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	
	@Override
	public String toString() {
		return "Dados do Produto " + "[nome = " + nome + String.format(", Preço %.2f", preco) + ", quantidade = "
				+ quantidade + ", Quantidade total: $ " + String.format("%.2f", totalValorNoEstoque()) + "]";
	}
	
	

}
