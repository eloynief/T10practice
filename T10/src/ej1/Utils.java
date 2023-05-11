package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	public static double readDouble () {
		//parametro scanner
		Scanner sc= new Scanner(System.in);
		int este=0;
		System.out.println("");
		este=sc.nextInt();

		//captura el error del resultado
		try{
			int c;
			c = este;
		} catch(InputMismatchException ime){
			System.out.println("El valor introducido no es de tipo "+ "");
		}
		
		
		
		return este;
		
	}
	
	
	public static int readInt() {
		//parametro de tipo scanner
		Scanner sc= new Scanner(System.in);
		int num2=0;
		
		
		
		
		return num2;
		
		
		
	}
	
	
}
