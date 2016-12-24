import org.junit.Assert;
import org.junit.Test;

public class TrenInternoTest {

	@Test
	public void TransporteCobra0SiEsTrenInterno(){
		TransporteAeropuerto transporteAeroportuario = new TransporteAeropuerto("Tren Interno");

		Assert.assertTrue(transporteAeroportuario.cobrarPasaje("Terminal C", "Terminal B", 2) == 0);
	}
}
