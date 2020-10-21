

import java.util.Scanner;

public class EjUno {

	public static void main(String[] args) {
		//TODO falta la validacion de errores
		//Realizada validación de errores
		
		try
		{
		
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		System.out.println("Ingrese un número entero: ");
		numA = sc.nextInt();
		System.out.println("Ingrese otro número entero: ");
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
