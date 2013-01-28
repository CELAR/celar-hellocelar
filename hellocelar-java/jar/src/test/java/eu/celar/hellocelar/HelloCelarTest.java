package eu.celar.hellocelar;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.celar.hellocelar.HelloCelar;

public class HelloCelarTest extends HelloCelar {

	@Test
	public final void testGetGreetings() {
		assertEquals("Hello CELAR!", getGreetings());
	}

}
