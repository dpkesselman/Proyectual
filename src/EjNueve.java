import java.util.Scanner;

public class EjNueve {
	
	public static void nueve() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese la cantidad de n�meros enteros que desee y luego un n�mero negativo para finalizar");
	long acumulador = 0;
	//int maximo = 0;
	//int minimo = 0;
	int maximo;
	int minimo;
	int num;
	num = sc.nextInt();
	
	maximo = num;
	minimo = num;
	
	while (num > 0) {
		acumulador = acumulador + num;
		if (num > maximo)
		{
			maximo = num;			
		}
		if (num < minimo)
		{
			minimo = num;
		}
		num = sc.nextInt();
	}
	
	
	System.out.println("La suma es " + acumulador);
	System.out.println("El n�mero m�s grande es " + maximo);
	System.out.println("El n�mero m�s chico es " + minimo);

}
}
