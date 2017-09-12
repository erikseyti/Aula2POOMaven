package br.edu.ifpr;

import java.util.ArrayList;
import java.util.Collection;

public class ItemKit implements Item {

	private Collection<Item> itens = new ArrayList<>();
	
	public void add(Item item)
	{
		itens.add(item);
	}
	
	public void remove(int index)
	{
		itens.remove(index);
	}
	
	@Override
	public double valorVenda() {
		
		double soma = 0;
		for (Item item : itens) {
			soma+=item.valorVenda();
		}
		return soma;
	}

	@Override
	public double subTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantidade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return null;
	}

}
