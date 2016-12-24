import org.junit.Assert;
import org.junit.Test;

public class CentroDeTerminalesTest {

	@Test
	public void verificarCentroTerminalesPlataformaDestinoA(){
		CentroDeTerminales nuevoCentro = new CentroDeTerminales();
		nuevoCentro.verificarTerminal("Terminal A");

		Assert.assertTrue(nuevoCentro.obtenerImporte() == 0);

	}
	
	@Test
	public void verificarCentroTerminalesPlataformaDestinoB(){
		CentroDeTerminales nuevoCentro = new CentroDeTerminales();
		nuevoCentro.verificarTerminal("Terminal B");

		Assert.assertTrue(nuevoCentro.obtenerImporte() == 5);

	}
	
	@Test
	public void verificarCentroTerminalesPlataformaDestinoC(){
		CentroDeTerminales nuevoCentro = new CentroDeTerminales();
		nuevoCentro.verificarTerminal("Terminal C");

		Assert.assertTrue(nuevoCentro.obtenerImporte() == 10);

	}

}
