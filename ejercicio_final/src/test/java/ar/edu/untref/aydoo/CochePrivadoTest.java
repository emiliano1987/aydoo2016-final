import org.junit.Assert;
import org.junit.Test;

public class CochePrivadoTest {

	@Test
	public void TransporteCobra121SiEsCochePrivadoEnTerminalesIgualesCon10Pasajeros(){
		CochePrivado transporteCochePrivado = new CochePrivado();

		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal A", "Terminal A", 10) == 121);
	}

	@Test
	public void TransporteCobra121SiEsCochePrivadoEnTerminalesDiferentesCon5Pasajeros(){
		CochePrivado transporteCochePrivado = new CochePrivado();		
		
		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal A", "Terminal B", 5) == 121);
	}
	
	@Test
	public void TransporteCobra2904SiEsCochePrivadoEnTerminalesAYC(){
		CochePrivado transporteCochePrivado = new CochePrivado();
		
		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal A", "Terminal C", 100) == 2904);
	}
	
	@Test
	public void CochePrivadoCobra121AlIngresarTerminalTerminalD(){
		CochePrivado transporteCochePrivado = new CochePrivado();
		
		Assert.assertTrue(transporteCochePrivado.cobrarPasajeSegunTransporte("Terminal D", "Terminal S", 100) == 2904);
	}
	
}
