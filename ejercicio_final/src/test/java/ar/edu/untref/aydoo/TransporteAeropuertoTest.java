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

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal B", 1) == 5);
	}

	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesAyC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal A", "Terminal C", 2) == 10);
	}

	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesByA(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal B", "Terminal A", 3) == 5);
	}
	
	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesByC(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal B", "Terminal C", 4) == 5);
	}

	@Test
	public void TransporteCobra10SiEsMinibusEnTerminalesCyA(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal C", "Terminal A", 5) == 10);
	}
	
	@Test
	public void TransporteCobra5SiEsMinibusEnTerminalesCyB(){
		TransporteAeropuerto transporteMinibus = new TransporteAeropuerto("Minibus");

		Assert.assertTrue(transporteMinibus.cobrarPasaje("Terminal C", "Terminal B", 10) == 5);
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
	
	@Test
	public void TransporteCobra0SiNoEsUnTransporteEspecifico(){
		TransporteAeropuerto remis = new TransporteAeropuerto("Remis");

		Assert.assertTrue(remis.cobrarPasaje("Terminal A", "Terminal A", 3) == 0);
	}
}
