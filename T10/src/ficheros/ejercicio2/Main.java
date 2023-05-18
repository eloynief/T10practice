package ficheros.ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(new FileReader("src\\ficheros\\ejercicio2\\Enteros"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileReader lector= new FileReader("src\\ficheros\\ejercicio1\\NumerosReales");
		
		int numero = 0;
		
	}

}
