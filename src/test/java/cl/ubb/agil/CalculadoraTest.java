package cl.ubb.agil;

import org.junit.Before;
import org.junit.Test;
import cl.ubb.agil.Calculadora;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Test
	public void sumaDosMasTresEsCinco(){
		calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(2, 3);
		
		assertThat(resultado,is(5));
	}

}