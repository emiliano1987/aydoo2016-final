
public interface TerminalesTransporte {

	public void modificarProximo(TerminalesTransporte nuevaTerminal);
	public TerminalesTransporte obtenerProximo();
	public void verificarTerminal (String terminalDestino);
	public void modificarImporte(float nuevoImporte);
	public float obtenerImporte();
}
