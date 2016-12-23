import org.junit.Assert;
import org.junit.Test;

public class MinibusTest {

	@Test
	public void TransporteCobra0SiEsMinibusEnTerminalesOrigenYDestinoA(){
		Transporte transporteMinibus = new Minibus();

		Assert.assertTrue(transporteMinibus.cobrarPasajeSegunTransporte("Terminal A", "Terminal A", 3) == 0);
	}
}
