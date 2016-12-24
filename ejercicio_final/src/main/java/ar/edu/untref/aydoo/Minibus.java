
public class Minibus extends Transporte{

	@Override
	public float cobrarPasajeSegunTransporte(String origen, String destino, int cantidadPasajeros){
		CentroDeTerminales nuevoCentro = new CentroDeTerminales();
		nuevoCentro.verificarTerminal(origen,destino);

		return nuevoCentro.obtenerImporte();
	}

}
