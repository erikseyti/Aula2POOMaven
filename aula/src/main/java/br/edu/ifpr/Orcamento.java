package br.edu.ifpr;

import java.util.ArrayList;
import java.util.Collection;

public class Orcamento {
	
	private double total;
	private Collection<Item> itens = new ArrayList<Item>();
	
	
	public void adicionar(Item item)
	{
		itens.add(item);
		total += item.subTotal();
	}
	
	public void remover(int indice)
	{
		//System.out.println("hello");
	}

	public double total()
	{
		return total;
	}
}
