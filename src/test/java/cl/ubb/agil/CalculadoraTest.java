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
	
	@Test
	public void MenosUnoYSieteEsSeis(){
		calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(-1, 7);
		
		assertThat(resultado,is(6));
	}
	
	@Test
	public void DocientosMenosSetentaYTres(){
		calculadora = new Calculadora();
		
		int resultado = calculadora.restar(200, 73);
		
		assertThat(resultado,is(127));
	}
	
	@Test
	public void MenosDiezMenos5(){
		calculadora = new Calculadora();
		
		int resultado = calculadora.restar(-10, 5);
		
		assertThat(resultado,is(-15));
	}
	
	@Test
	public void ExpresionTresMasCuatroMasSieteEsCatorce(){
		
		int resultado = calculadora.sumarExpresion("3+4+7");
		
		assertThat(resultado,is(14));
	}

}