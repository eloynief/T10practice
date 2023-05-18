package ej3;

public class Fecha {
	int dia=1,mes=1,año=1970;

	public Fecha() {
		
		
	}
	
	public Fecha(int dia,int mes,int año) throws DayOutOfRangeException {
		if (dia>=1&&dia<=31) {
			this.dia=dia;
			
		}
		else {
			throw new DayOutOfRangeException();
		}
		//se iguala el año al año que has escrito
		this.año=año;
		
		
		
		
	}
	
	
	
}
