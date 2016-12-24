import org.junit.Assert;
import org.junit.Test;

public class MinibusTest {

	@Test
	public void MinibusCobra0SiEsMinibusEnTerminalesOrigenYDestinoA(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal A", "Terminal A", 3) == 0);
	}
	
	@Test
	public void MinibusCobra0SiEsTerminalesOrigenYDestinoB(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal B", "Terminal B", 3) == 0);
	}
	
	@Test
	public void MinibusCobra0SiEsMinibusEnTerminalesOrigenYDestinoC(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal C", "Terminal C", 3) == 0);
	}

	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesAyB(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal A", "Terminal B", 6) == 5);
	}

	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesAyC(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal A", "Terminal C", 5) == 10);
	}

	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesByA(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal B", "Terminal A", 10) == 5);
	}
	
	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesByC(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal B", "Terminal C", 11) == 5);
	}

	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesCyA(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal C", "Terminal A", 3) == 10);
	}
	
	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesCyB(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal C", "Terminal B", 7) == 5);
	}
	
	/*
	 * Test para probar que si se ingresa una terminal inexistente el sistema setea en 0 el valor
	 */
	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesCyD(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal C", "Terminal D", 10) == 0);
	}
	
}
