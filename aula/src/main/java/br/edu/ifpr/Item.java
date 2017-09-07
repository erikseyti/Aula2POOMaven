package br.edu.ifpr;

public class Item {
	
	enum Tipo {PRODUTO,SERVICO};
	private String Descricao;
	private int quantidade;
	private double valorVenda;
	private double custo;
	private double porcentagemLucro;
	private Tipo tipo;
	
	
	// construtor gerado apartir do metodo construtor padrão do java
	// criado usando o atalho do botão esquerdo do mouse/source/generate constructor using fields
	public Item(String descricao, 
			int quantidade, 
			double custo, Tipo tipo) {
		super();
		Descricao = descricao;
		this.quantidade = quantidade;
		this.custo = custo;
		this.tipo = tipo;
	}

	public double valorVenda()
	{
		return 0.0;
	}
	
	public double subTotal()
	{
		return 0.0;
	}
	
	
	
}
