package br.edu.ifpr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testValorVenda() {
		Item item = new Item("Mouse",1,5,Item.Tipo.PRODUTO);
		
	}

	@Test
	public void testSubTotal() {
		fail("Not yet implemented");
	}

}
