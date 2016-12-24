
public class CentroDeTerminales implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe;

	public void verificarTerminal (String terminalOrigen,String terminalDestino){
		TerminalA nuevaTerminalOrigen = new TerminalA ();
		this.modificarProximo(nuevaTerminalOrigen);

		TerminalB nuevaTerminalOrigenB = new TerminalB ();
		nuevaTerminalOrigen.modificarProximo(nuevaTerminalOrigenB);

		proximo.verificarTerminal(terminalOrigen,terminalDestino);
		this.modificarImporte(proximo.obtenerImporte());
		
		if (proximo.obtenerProximo().obtenerImporte()>0){
			this.modificarImporte(proximo.obtenerProximo().obtenerImporte());
		}

		
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
