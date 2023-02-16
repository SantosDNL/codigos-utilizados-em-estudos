package com.digitalinnovationone.springootconfig;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUnitController {
	
	@Test
	public void testUnit() {
		AppController controller = new AppController();
		String resultado = controller.getEnviromentVariable();
		assertEquals("Bem vindo, Dio", resultado);
	}

}
