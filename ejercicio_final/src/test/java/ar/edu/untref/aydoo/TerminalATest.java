import org.junit.Assert;
import org.junit.Test;

public class TerminalATest {

	@Test
	public void verificarTerminalDestinoA(){
		TerminalA nuevaTerminal = new TerminalA();
		nuevaTerminal.verificarTerminal("Terminal A","Terminal A");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 0);

	}
	
	@Test
	public void verificarTerminalDestinoB(){
		TerminalA nuevaTerminal = new TerminalA();
		nuevaTerminal.verificarTerminal("Terminal A","Terminal B");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 5);

	}
	
	@Test
	public void verificarTerminalDestinoC(){
		TerminalA nuevaTerminal = new TerminalA();
		nuevaTerminal.verificarTerminal("Terminal A","Terminal C");

		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 10);

	}
	
	@Test
	public void modificarImporteDeTerminal(){
		TerminalA nuevaTerminal = new TerminalA();
		nuevaTerminal.verificarTerminal("Terminal A","Terminal B");
		nuevaTerminal.modificarImporte(100);
		Assert.assertTrue(nuevaTerminal.obtenerImporte() == 100);

	}
	
	@Test
	public void verificarProximaTerminal(){
		TerminalA nuevaTerminal = new TerminalA();
		TerminalA nuevaTerminalA = new TerminalA();
		
		nuevaTerminal.modificarProximo(nuevaTerminalA);
		
		Assert.assertTrue(nuevaTerminal.obtenerProximo()==nuevaTerminalA);

	}
}