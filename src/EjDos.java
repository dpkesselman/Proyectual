

import java.util.Scanner;

public class EjDos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		System.out.println("Ingrese un número entero: ");
		numA = sc.nextInt();
		System.out.println("Ingrese otro número entero: ");
		numB = sc.nextInt();
		
		if (numA > numB)
		{
			System.out.println(numA + " es mayor");
		}
			
		else if (numB > numA)
		{
			System.out.println(numB + " es mayor");
		}
		
		else if (numA == numA)
		
		{
			System.out.println(numA + " y " + numB + " son iguales");
		}


	}

}
