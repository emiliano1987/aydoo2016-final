import org.junit.Assert;
import org.junit.Test;

public class TransporteAeropuertoTest {

	@Test
	public void TransporteAeropuertoCobra0SiEsTrenInterno(){
		TransporteAeropuerto transporteAeroportuario = new TransporteAeropuerto("Tren Interno");

		Assert.assertTrue(transporteAeroportuario.cobrarPasaje("Terminal A", "Terminal B", 2) == 0);
	}

	@Test
	public void TransporteAeropuertoCobra0SiEsMinibusEnTerminalesIguales(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal A", 3) == 0);
	}

	@Test
	public void TransporteAeropuertoCobra5SiEsMinibusEnDiferentesTerminales(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal B", 2) == 5);
	}

	@Test
	public void TransporteAeropuertoCobra10SiEsMinibusEnTerminalesAYC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal C", 2) == 10);
	}

	@Test
	public void TransporteAeropuertoCobra10SiEsCochePrivadoEnTerminalesIguales(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal A", 2) == 0);
	}

}
