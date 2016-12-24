
public class Minibus extends Transporte{

	@Override
	public float cobrarPasajeSegunTransporte(String origen, String destino, int cantidadPasajeros){
		CentroDeTerminales nuevoCentro = new CentroDeTerminales();
		if(origen == "Terminal A"){
			nuevoCentro.verificarTerminal(origen,destino);
		}
		if(origen == "Terminal B"){
			nuevoCentro.verificarTerminal(origen,destino);
		}
		if(origen == "Terminal C" && destino == "Terminal A")
			return 10;
		if(origen == "Terminal C" && destino == "Terminal B")
			return 5;
		if(origen == "Terminal C" && destino == "Terminal C")
			return 0;
		else{
			return nuevoCentro.obtenerImporte();
		}
	}
}
