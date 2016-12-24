
public class TerminalC implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe=0;

	public void verificarTerminal (String terminalOrigen,String terminalDestino){
		if(terminalOrigen.equals("Terminal C")){
			if(terminalDestino.equals("Terminal B")){
				this.modificarImporte(5);

			}else if(terminalDestino.equals("Terminal A")){
				this.modificarImporte(10);

			}
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