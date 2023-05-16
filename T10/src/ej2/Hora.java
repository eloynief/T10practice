package ej2;

import java.util.InputMismatchException;

public class Hora {
	
	
	
	public int hora=0;
	public int minuto=0;
	public int segundo=0;
	
	
	
	
	
	
	
	
	
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
















	//
	public static void Hora(){
		
		double este=0;
		System.out.println("");
		
		
		//captura el error del resultado
		try{
			
			este=sc.nextDouble();
			sc.nextLine();
		} catch(InputMismatchException ime){
			System.out.println("El valor introducido no es de tipo "+ "");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
