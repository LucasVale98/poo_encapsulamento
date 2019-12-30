package application;

import java.util.Scanner;

import entities.Product;

public class Program_Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do Produto:");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		Double preco = sc.nextDouble();
		System.out.print("Quantida no estoque: ");
		double quantidade = sc.nextDouble();
		Product product = new Product(nome, preco);
		
		product.setNome("Computadortv");
		
		System.out.println();
		System.out.println(product.toString());
		
		System.out.println();
		System.out.println("Entre com o numero de produto para ser adicionado ao estoque: ");
		int adicionar = sc.nextInt();
		product.addProdutos(adicionar);
		System.out.println("[Atualização ]" + product.toString());
		
		System.out.println();
		System.out.println("Entre com o numero de produto para ser removido do estoque: ");
		int remover = sc.nextInt();
		product.removeProdutos(remover);
		System.out.println("[Atualização ]" + product.toString());
		
		product.setNome("Computador");
		
		sc.close();
	}
}
