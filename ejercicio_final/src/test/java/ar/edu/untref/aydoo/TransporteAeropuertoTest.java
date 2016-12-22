import org.junit.Assert;
import org.junit.Test;

public class TransporteAeropuertoTest {

	@Test
	public void TransporteCobra0SiEsTrenInterno(){
		TransporteAeropuerto transporteAeroportuario = new TransporteAeropuerto("Tren Interno");

		Assert.assertTrue(transporteAeroportuario.cobrarPasaje("Terminal A", "Terminal B", 2) == 0);
	}

	@Test
	public void TransporteCobra0SiEsMinibusEnTerminalesIguales(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal A", 3) == 0);
	}

	@Test
	public void TransporteCobra5SiEsMinibusEnDiferentesTerminales(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal B", 2) == 5);
	}

	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesAYC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal C", 2) == 10);
	}

	@Test
	public void TransporteCobra121SiEsCochePrivadoEnTerminalesIgualesCon10Pasajeros(){
		TransporteAeropuerto transporteCochePrivado = new TransporteAeropuerto("Coche Privado");

		Assert.assertTrue(transporteCochePrivado.cobrarPasaje("Terminal A", "Terminal A", 10) == 121);
	}

	@Test
	public void TransporteCobra121SiEsCochePrivadoEnTerminalesDiferentesCon5Pasajeros(){
		TransporteAeropuerto transporteCochePrivado = new TransporteAeropuerto("Coche Privado");
		
		Assert.assertTrue(transporteCochePrivado.cobrarPasaje("Terminal A", "Terminal B", 5) == 121);
	}
}
