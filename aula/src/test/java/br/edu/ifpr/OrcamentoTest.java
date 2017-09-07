package br.edu.ifpr;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void testAdicionar() {
		Orcamento  orcamento = new Orcamento();
		Item item = new Item("Backup",2,5.0,100.0, Item.Tipo.SERVICO);
		orcamento.adicionar(item);
		//2.5% 20.50 , 41
		assertEquals(22.0,orcamento.total(),0.0);
		
		//82
		Item item2 = new Item("BackUp",2,20,100.0,Item.Tipo.SERVICO);
		orcamento.adicionar(item2);
		assertEquals(104.0,orcamento.total(),0.0);
	}

	@Test
	public void testRemover() {
		fail("Not yet implemented");
	}

}
