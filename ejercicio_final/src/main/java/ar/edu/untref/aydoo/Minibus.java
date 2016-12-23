
public class Minibus extends Transporte{

	@Override
	public float cobrarPasajeSegunTransporte(String origen, String destino, int cantidadPasajeros){
		if(origen == "Terminal A" && destino == "Terminal A")
			return 0;
		if(origen == "Terminal A" && destino == "Terminal B")
			return 5;
		if(origen == "Terminal A" && destino == "Terminal C")
			return 10;
		if(origen == "Terminal B" && destino == "Terminal A")
			return 5;
		if(origen == "Terminal B" && destino == "Terminal B")
			return 0;
		if(origen == "Terminal B" && destino == "Terminal C")
			return 5;
		if(origen == "Terminal C" && destino == "Terminal A")
			return 10;
		if(origen == "Terminal C" && destino == "Terminal B")
			return 5;
		if(origen == "Terminal C" && destino == "Terminal C")
			return 0;
		else
			return 0;
	}
}
