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

}
