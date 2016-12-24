
public interface TerminalesTransporte {

	public void modificarProximo(TerminalesTransporte nuevaTerminal);
	public TerminalesTransporte obtenerProximo();
	public void verificarTerminal (String terminalOrigen,String terminalDestino);
	public void modificarImporte(float nuevoImporte);
	public float obtenerImporte();
}
