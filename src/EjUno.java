

import java.util.Scanner;

public class EjUno {

	public static void uno () {
		//TODO falta la validacion de errores
		//Realizada validaci�n de errores
		
		try
		{
		
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		System.out.println("Ingrese un n�mero entero: ");
		numA = sc.nextInt();
		System.out.println("Ingrese otro n�mero entero: ");
		numB = sc.nextInt();
		
		int resultado = numA + numB;
		System.out.println("La suma es: " + resultado);
		resultado = numA - numB;
		System.out.println("La resta es: " + resultado);
		resultado = numA * numB;
		System.out.println("La multiplicacion es: " + resultado);
		resultado = numA / numB;
		System.out.println("La division es: " + resultado);
		}
		
		catch (Exception exception)
		{
			System.out.println("Error");
		}

	}

}
