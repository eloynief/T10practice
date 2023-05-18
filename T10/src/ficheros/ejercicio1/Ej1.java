package ficheros.ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
//		
		
		try {
			Scanner sc=new Scanner(new FileReader("src\\ficheros\\ejercicio1\\NumerosReales"));//C:\Users\enieves\Pictures\T10practice\T10\src\ficheros\NumerosReales
			
			FileReader lector= new FileReader("src\\ficheros\\ejercicio1\\NumerosReales");
			
			int numero = 0;
			try {
				
				while(sc.hasNextInt()) {
					numero = sc.nextInt();
					System.out.println(numero);
				}
		
				numero = lector.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int numeros=numero;
		
			System.out.println(numero);
			
//			double suma=0,media=0;
//			int contador=0;
//			
//			while (sc.hasNextInt()) {
//				suma=sc.nextDouble();
//				contador++;
//			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("mal jesho tontol culo");
			
			System.err.println("tenes un error en el bisho ese y la pc se va a oma por kulo");
			
			System.out.println("mal jesho");
			e.getMessage();
			
			
		}
		
		
		
		
	}

}
