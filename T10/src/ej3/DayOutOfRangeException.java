package ej3;

//clase excepción del exception del ej2 la cual sirve para los días que no esten
public class DayOutOfRangeException extends Exception{

	@Override
	public String toString() {
		return "El día introducido está fuera del rango";
	}

	@Override
	public String getMessage() {
		return "";
	}
	
}
