package ficheros;

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
			Scanner sc=new Scanner(new FileReader("C:\\Users\\enieves\\Pictures\\T10practice\\T10\\src\\ficheros\\NumerosReales"));//C:\Users\enieves\Pictures\T10practice\T10\src\ficheros\NumerosReales
			
			FileReader lector= new FileReader("C:\\Users\\enieves\\Pictures\\T10practice\\T10\\src\\ficheros\\NumerosReales");
			
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
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("mal jesho tontol culo");
			
			System.err.println("tenes un error en el bisho ese y la pc se va a oma por kulo");
			
			System.out.println("mal jesho");
			e.getMessage();
			
			
		}
		
		
		
		
	}

}
