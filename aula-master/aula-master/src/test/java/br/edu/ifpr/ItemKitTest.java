package br.edu.ifpr;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class ItemKitTest {

	@Test
	public void testValorVenda() {
		Item item1 = mock(Item.class);
		when(item1.valorVenda()).thenReturn(10.0);
		
		Item item2 = mock(Item.class);
		when(item2.valorVenda()).thenReturn(20.0);
		
		ItemKit kit = new ItemKit();
		kit.add(item1);
		kit.add(item2);
		
		assertEquals(30.0, kit.valorVenda(),0);
		verify(item1,times(1)).valorVenda();
		verify(item2,times(1)).valorVenda();
	}

}
