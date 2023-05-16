package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	
	
	
	
	public static double readDouble (Scanner sc) {
		
		double este=0;
		System.out.println("");

		//captura el error del resultado
		try{
			
			este=sc.nextDouble();
			sc.nextLine();
		} catch(InputMismatchException ime){
			System.out.println("El valor introducido no es de tipo "+ "");
		}
		
		
		
		return este;
		
	}
	
	
	public static int readInt(Scanner sc) {
		
		
		int num2=0;

		//captura el error del resultado
		try{
			
			num2=sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException ime){
			System.out.println("El valor introducido no es de tipo "+ "");
		}
		
		
		
		return num2;
		
		
		
	}
	
	
}
