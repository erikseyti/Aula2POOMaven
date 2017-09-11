package br.edu.ifpr;

public class Item {

	
	private static final double ISS = 0.025;

	private static final double ICMS = 0.10;

	enum Tipo {PRODUTO, SERVICO};
	
	private int quantidade;
	
	private Produto produto = new Produto();

	private Tipo tipo;

	public Item(String descricao, 
			int quantidade, 
			double custo, 
			double porcentagemLucro,
			Tipo tipo) {
		this.produto.setDescricao(descricao);
		this.quantidade = quantidade;
		this.produto.setCusto(custo);
		this.produto.setPorcentagemLucro(porcentagemLucro);
		this.tipo = tipo;
	}

	public double valorVenda(){
		double custoComImposto = 0;
		if(tipo.equals(Item.Tipo.PRODUTO)){
			custoComImposto = (produto.getCusto() * ICMS) + produto.getCusto();	
		} else {
			custoComImposto = (produto.getCusto() * ISS) + produto.getCusto();
		}
		
		double valorVenda = 
				((produto.getPorcentagemLucro()/100) * custoComImposto)
				+ custoComImposto;
		return valorVenda;
	}
	
	public double subTotal(){
		return quantidade * valorVenda();
	}
	
}