package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDisco {
/* No hace faltar reescribir los métodos de Disco*/
	@Test
	public void testParaSaberElPerimetroInterior() {
		Disco DiscoA = new Disco ();
		DiscoA.setRadioInterior(5.0); /* Acá se setea utilizando el nuevo objeto con la firma del metodo y el parametro "DiscoA.setRadioINterior(numero doble) */
		System.out.println(DiscoA.conseguirPerimetroInterior());
		Double perimetroEsperado = 31.41;
		assertEquals(perimetroEsperado, DiscoA.conseguirPerimetroInterior(),0.01);
	}
	@Test
	public void testParaSaberElPerimetroExterior(){
		Disco DiscoB = new Disco();
		DiscoB.setRadioExterior(10.0);
		System.out.println(DiscoB.conseguirPerimetroExterior());
		Double perimetroesperado=62.83;
		assertEquals(perimetroesperado, DiscoB.conseguirPerimetroExterior(), 0.01);
	}
	
}
