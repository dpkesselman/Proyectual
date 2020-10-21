import java.util.Scanner;

public class EjNueve {
	
	public static void nueve() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese la cantidad de números enteros que desee y luego un número negativo para finalizar");
	long acumulador = 0;
	int maximo = 0;
	int num;
	num = sc.nextInt();
	
	while (num > 0) {
		acumulador = acumulador + num;
		if (num > maximo)
		{
			maximo = num;
		}
		num = sc.nextInt();
	}
	
	System.out.println("La suma es " + acumulador);
	System.out.println("El máximo es " + maximo);

}
}
