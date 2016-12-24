import org.junit.Assert;
import org.junit.Test;

public class TerminalBTest {

	@Test
	public void verificarTerminalDestinoA(){
		TerminalB nuevaTerminal = new TerminalB();
		nuevaTerminal.verificarTerminal("Terminal B","Terminal A");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 5);

	}
	
	@Test
	public void verificarTerminalDestinoB(){
		TerminalB nuevaTerminal = new TerminalB();
		nuevaTerminal.verificarTerminal("Terminal B","Terminal B");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 0);

	}
	
	@Test
	public void verificarTerminalDestinoC(){
		TerminalB nuevaTerminal = new TerminalB();
		nuevaTerminal.verificarTerminal("Terminal B","Terminal C");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 5);

	}
	
	@Test
	public void modificarImporteDeTerminal(){
		TerminalB nuevaTerminal = new TerminalB();
		nuevaTerminal.verificarTerminal("Terminal B","Terminal B");
		nuevaTerminal.modificarImporte(50);
		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 50);

	}
	
	@Test
	public void verificarProximaTerminal(){
		TerminalB nuevaTerminal = new TerminalB();
		TerminalB nuevaTerminalB = new TerminalB();
		
		nuevaTerminal.modificarProximo(nuevaTerminalB);
		
		Assert.assertTrue(nuevaTerminal.obtenerProximo()==nuevaTerminalB);

	}
}