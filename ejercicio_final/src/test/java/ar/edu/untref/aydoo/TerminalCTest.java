import org.junit.Assert;
import org.junit.Test;

public class TerminalCTest {

	@Test
	public void verificarTerminalDestinoA(){
		TerminalC nuevaTerminal = new TerminalC();
		nuevaTerminal.verificarTerminal("Terminal C","Terminal A");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 10);
	}
	
	@Test
	public void verificarTerminalDestinoB(){
		TerminalC nuevaTerminal = new TerminalC();
		nuevaTerminal.verificarTerminal("Terminal C","Terminal B");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 5);
	}
	
}