
public class TerminalA implements TerminalesTransporte {

	private TerminalesTransporte proximo;
	private float importe=0;

	public void verificarTerminal (String terminalDestino){
		if(terminalDestino.equals("Terminal B")){
			this.importe = 5;

		}else if(terminalDestino.equals("Terminal C")){
			this.importe = 10;

		}else{
			if (proximo != null){
				proximo.verificarTerminal(terminalDestino);
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
