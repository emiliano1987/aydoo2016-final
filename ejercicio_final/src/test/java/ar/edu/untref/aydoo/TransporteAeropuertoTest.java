import org.junit.Assert;
import org.junit.Test;

public class TransporteAeropuertoTest {

	@Test
	public void TransporteAeropuertoSiEsTrenInterno(){
		TransporteAeropuerto transporteAeroportuario = new TransporteAeropuerto("Tren Interno");

		Assert.assertTrue(transporteAeroportuario.cobrarPasaje("Terminal A", "Terminal B", 2) == 0);
	}

}
