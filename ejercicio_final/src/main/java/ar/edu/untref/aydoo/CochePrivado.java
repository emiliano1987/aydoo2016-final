
public class CochePrivado extends Transporte{

	@Override
	public float cobrarPasajeSegunTransporte(String origen, String destino, int cantidadPasajeros){
		if(this.calcularKilometros(origen,destino) < 2){
			return 10 * cantidadPasajeros * 1.21f; //Se cobra un 21% de IVA.
		}
		if(this.calcularKilometros(origen,destino) >= 2 && this.calcularKilometros(origen,destino) < 4){
			return 20 * cantidadPasajeros * 1.21f;
		}
		if(this.calcularKilometros(origen,destino) >= 4){
			return 20 * cantidadPasajeros * 1.21f * 1.2f;//Se cobra un 20% mas por ser lejos.
		}
		
		return 0;
	}
	
	private float calcularKilometros(String origen, String destino){
		
		if(origen == destino){
			return 0f;
		}
		if((origen == "Terminal A" && destino == "Terminal B") || 
		   (origen == "Terminal B" && destino == "Terminal A") ||
		   (origen == "Terminal B" && destino == "Terminal C") ||
		   (origen == "Terminal C" && destino == "Terminal B")){
			return 3f;
		}else{
			return 5f;
		}
	}

}
