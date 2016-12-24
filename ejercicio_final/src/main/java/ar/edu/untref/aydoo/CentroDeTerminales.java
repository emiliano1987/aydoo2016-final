
public class CentroDeTerminales implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe;

	public void verificarTerminal (String terminalOrigen,String terminalDestino){
		TerminalA nuevaTerminalOrigen = new TerminalA ();
		this.modificarProximo(nuevaTerminalOrigen);

		TerminalB nuevaTerminalOrigenB = new TerminalB ();
		nuevaTerminalOrigen.modificarProximo(nuevaTerminalOrigenB);

		TerminalC nuevaTerminalOrigenC = new TerminalC ();
		nuevaTerminalOrigenB.modificarProximo(nuevaTerminalOrigenC);

		proximo.verificarTerminal(terminalOrigen,terminalDestino);

		this.modificarImporte(proximo.obtenerImporte());
		
		while (proximo.obtenerProximo() != null && proximo.obtenerImporte() >= this.obtenerImporte() ){
			this.modificarImporte(proximo.obtenerImporte());
			proximo = proximo.obtenerProximo();
		}
		
		if(proximo.obtenerImporte() > 0){
			this.modificarImporte(proximo.obtenerImporte());
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
