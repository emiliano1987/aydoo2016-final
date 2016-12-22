/*
El siguiente grupo de clases modela un dominio de un transporte aereo.
1. Analice el problema.
2. Identifique potenciales problemas con el dise�o/c�digo presentado e indique porque considera que son problemas.
3. Proponga y codifique una soluci�n para cada uno de los puntos identificados.
4. Realice un diagrama de clases
5. Realice un diagrama de secuencia del m�todo 'cobrarPasaje' de la clase TransporteAeropuerto.
*/
public class TransporteAeropuerto {
	
	private String tipoTransporte;
	
	public TransporteAeropuerto(String tipoTransporte){
		this.tipoTransporte = tipoTransporte;
	}
	
	
	public float cobrarPasaje(String origen, String destino, int cantidadPasajeros){
		
		if(this.tipoTransporte == "Tren Interno")
		{
			return 0; //El tren internos es un servicio gratis del aeropuesro.
		}else{
			if(this.tipoTransporte == "Minibus")
			{
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
			}else{
				if(this.tipoTransporte == "Coche Privado"){
					if(this.calcularKilometros(origen,destino) < 2){
						return 10 * cantidadPasajeros * 1.21f; //Se cobra un 21% de IVA.
					}
					if(this.calcularKilometros(origen,destino) >= 2 && this.calcularKilometros(origen,destino) < 4){
						return 20 * cantidadPasajeros * 1.21f;
					}
					if(this.calcularKilometros(origen,destino) >= 4){
						return 20 * cantidadPasajeros * 1.21f * 1.2f;//Se cobra un 20% mas por ser lejos.
					}
				}
			}
			return 0;
		}
	}
	
	private float calcularKilometros(String origen, String destino){
		
		if(origen == destino)
			return 0f;
		if((origen == "Terminal A" && destino == "Terminal B") || 
		   (origen == "Terminal B" && destino == "Terminal A") ||
		   (origen == "Terminal B" && destino == "Terminal C") ||
		   (origen == "Terminal C" && destino == "Terminal B"))
			return 3f;
		else
			return 5f;
	}
}
