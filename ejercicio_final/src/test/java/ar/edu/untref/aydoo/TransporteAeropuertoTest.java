import org.junit.Assert;
import org.junit.Test;

public class TransporteAeropuertoTest {

	@Test
	public void TransporteCobra0SiEsTrenInterno(){
		TransporteAeropuerto transporteAeroportuario = new TransporteAeropuerto("Tren Interno");

		Assert.assertTrue(transporteAeroportuario.cobrarPasaje("Terminal A", "Terminal B", 2) == 0);
	}

	@Test
	public void TransporteCobra0SiEsMinibusEnTerminalesOrigenYDestinoA(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal A", 3) == 0);
	}

	@Test
	public void TransporteCobra0SiEsMinibusEnTerminalesOrigenYDestinoB(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal B", "Terminal B", 3) == 0);
	}
	
	@Test
	public void TransporteCobra0SiEsMinibusEnTerminalesOrigenYDestinoC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal C", "Terminal C", 3) == 0);
	}
	
	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesAyB(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal B", 2) == 5);
	}

	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesAyC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal C", 2) == 10);
	}

	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesByA(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal B", "Terminal A", 2) == 5);
	}
	
	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesByC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal B", "Terminal C", 2) == 5);
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
	@Test
	public void TransporteCobra2904SiEsCochePrivadoEnTerminalesAYC(){
		TransporteAeropuerto transporteCochePrivado = new TransporteAeropuerto("Coche Privado");

		Assert.assertTrue(transporteCochePrivado.cobrarPasaje("Terminal A", "Terminal C", 100) == 2904);
	}
}
