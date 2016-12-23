import org.junit.Assert;
import org.junit.Test;

public class TransporteInternoTest {

	@Test
	public void TransporteCobra121SiEsCochePrivadoEnTerminalesIgualesCon10Pasajeros(){
		Transporte transporteCochePrivado = new CochePrivado();

		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal A", "Terminal A", 10) == 121);
	}

	@Test
	public void TransporteCobra121SiEsCochePrivadoEnTerminalesDiferentesCon5Pasajeros(){
		Transporte transporteCochePrivado = new CochePrivado();		
		
		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal A", "Terminal B", 5) == 121);
	}
	@Test
	public void TransporteCobra2904SiEsCochePrivadoEnTerminalesAYC(){
		Transporte transporteCochePrivado = new CochePrivado();
		
		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal A", "Terminal C", 100) == 2904);
	}
	
}
