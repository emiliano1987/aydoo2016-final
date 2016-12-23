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
	private Transporte nuevoTransporte;

	public TransporteAeropuerto(String tipoTransporte){
		this.tipoTransporte = tipoTransporte;
	}


	public float cobrarPasaje(String origen, String destino, int cantidadPasajeros){
		if(this.tipoTransporte == "Tren Interno"){

			this.nuevoTransporte = new TrenInterno();
			return this.nuevoTransporte.cobrarPasajeSegunTransporte(origen, destino, cantidadPasajeros);

		}else{

			if(this.tipoTransporte == "Minibus"){

				this.nuevoTransporte = new Minibus();
				return this.nuevoTransporte.cobrarPasajeSegunTransporte(origen, destino, cantidadPasajeros);

			}else{
				
				if(this.tipoTransporte == "Coche Privado"){
				
					this.nuevoTransporte = new CochePrivado();
					return this.nuevoTransporte.cobrarPasajeSegunTransporte(origen, destino, cantidadPasajeros);
				
				}
			}
			return 0;
		}
	}


}
