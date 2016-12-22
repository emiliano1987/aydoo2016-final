import org.junit.Assert;
import org.junit.Test;

public class TransporteAeropuertoTest {

	@Test
	public void TransporteAeropuertoSiEsTrenInterno(){
		TransporteAeropuerto transporteAeroportuario = new TransporteAeropuerto("Tren Interno");

		Assert.assertTrue(transporteAeroportuario.cobrarPasaje("Terminal A", "Terminal B", 2) == 0);
	}
	
	@Test
	public void TransporteAeropuertoSiEsMinibus(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal A", 3) == 0);
	}
	
	@Test
	public void TransporteAeropuertoSiEsMinibusEnDiferentesTerminales(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal B", 2) == 5);
	}
	
	@Test
	public void TransporteAeropuertoSiEsMinibusEnTerminalesAYC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal C", 2) == 10);
	}

}
