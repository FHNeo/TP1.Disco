package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {
	@Test
	public void testParaSaberElPerimetroInterior() {
		Disco DiscoA = new Disco();
		DiscoA.setRadioInterior(5.0); /*
						 * Acá se setea utilizando el nuevo objeto con la firma
						 * del metodo y el parametro
						 * "DiscoA.setRadioINterior(numero doble)
						 */
		System.out.println(DiscoA.conseguirPerimetroInterior());
		Double perimetroEsperado = 31.41;
		assertEquals(perimetroEsperado, DiscoA.conseguirPerimetroInterior(), 0.01);
	}

	@Test
	public void testParaSaberElPerimetroExterior() {
		Disco DiscoB = new Disco();
		DiscoB.setRadioExterior(10.0);
		System.out.println(DiscoB.conseguirPerimetroExterior());
		Double perimetroesperado = 62.83;
		assertEquals(perimetroesperado, DiscoB.conseguirPerimetroExterior(), 0.01);
	}

	@Test
	public void testParaSaberLaSuperficie() {
		Disco DiscoC = new Disco();
		DiscoC.setRadioExterior(15.00);
		DiscoC.setRadioInterior(10.00);
		System.out.println(DiscoC.conseguirSuperficie());
		Double superficieEsperada = 392.70 ;
		assertEquals(superficieEsperada, DiscoC.conseguirSuperficie(), 0.01);
	}
}
