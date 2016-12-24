
public class CentroDeTerminales implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe;

	public void verificarTerminal (String terminalDestino){
		TerminalA nuevaTerminalOrigen = new TerminalA ();
		this.modificarProximo(nuevaTerminalOrigen);

		proximo.verificarTerminal(terminalDestino);

		this.modificarImporte(nuevaTerminalOrigen.obtenerImporte());
	}

	public TerminalesTransporte obtenerProximo(){
		return proximo;
	}

	public void modificarProximo(TerminalesTransporte nuevaTerminal){
		proximo = nuevaTerminal;
	}

	public void modificarImporte(float nuevoImporte){
		this.importe = nuevoImporte;
	}
	public float obtenerImporte() {
		return importe;
	}

}
