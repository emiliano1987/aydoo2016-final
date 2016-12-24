
public class TerminalB implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe=0;

	public void verificarTerminal (String terminalOrigen,String terminalDestino){
		if(terminalOrigen.equals("Terminal B")){
			if(terminalDestino.equals("Terminal A")|| terminalDestino.equals("Terminal C")){
				this.modificarImporte(5);
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