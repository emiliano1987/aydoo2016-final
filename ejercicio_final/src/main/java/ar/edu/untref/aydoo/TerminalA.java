
public class TerminalA implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe=0;

	public void verificarTerminal (String terminalOrigen,String terminalDestino){
		if(terminalOrigen.equals("Terminal A")){
			if(terminalDestino.equals("Terminal B")){
				this.modificarImporte(5);

			}else if(terminalDestino.equals("Terminal C")){
				this.modificarImporte(10);

			}
		}else{
			proximo.verificarTerminal(terminalOrigen,terminalDestino);

		}
	}

	public TerminalesTransporte obtenerProximo(){
		return proximo;
	}

	public float obtenerImporte() {
		return importe;
	}

	public void modificarImporte(float nuevoImporte){
		this.importe = nuevoImporte;
	}

	public void modificarProximo(TerminalesTransporte nuevaTerminal){
		proximo = nuevaTerminal;
	}

}
