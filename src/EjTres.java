
import java.util.Scanner;

public class EjTres {

	public static void main(String[] args) {
		
		/* TODO falta que valide que el mes y el dia sean validos, 
		 * por ejemplo: si ingreso dia 45 del mes 13 no me avisa que no existen  y calcula la fecha igual */
		// Revisado y modificado... Pero capaz se podr�a hacer de alguna forma m�s simple. Seguir� pensando.
		
		Scanner sc = new Scanner(System.in);
		int dia1, mes1, a�o1, dia2, mes2, a�o2;
		System.out.println("Ingrese d�a: ");
		dia1 = sc.nextInt();
		System.out.println("Ingrese mes: ");
		mes1 = sc.nextInt();
		if ((mes1 == 2) && (dia1 >28))
		{
			System.out.println("Este mes s�lo tiene 28 d�as");
			System.exit(0);
		}
		if ((mes1 == 4) || (mes1 == 6) || (mes1 == 9) || (mes1 == 11) && (dia1 > 30))
		{
			System.out.println("Este mes s�lo tiene 30 d�as");
			System.exit(0);
		}
		if ((mes1 == 1) || (mes1 == 3) || (mes1 == 5) || (mes1 == 7) || (mes1 == 8) || (mes1 == 10) || (mes1 == 12) && (dia1 > 31))
		{
			System.out.println("Este mes s�lo tiene 31 d�as");
			System.exit(0);
		}
		System.out.println("Ingrese a�o: ");
		a�o1 = sc.nextInt();
		
		System.out.println("Ingrese otro d�a: ");
		dia2 = sc.nextInt();
		System.out.println("Ingrese otro mes: ");
		mes2 = sc.nextInt();
		if ((mes2 == 2) && (dia2 >28))
		{
			System.out.println("Febrero s�lo tiene 28 d�as");
			System.exit(0);
		}
		if ((mes2 == 4) || (mes2 == 6) || (mes2 == 9) || (mes2 == 11) && (dia2 > 30))
		{
			System.out.println("Este mes s�lo tiene 30 d�as");
			System.exit(0);
		}
		if ((mes2 == 1) || (mes2 == 3) || (mes2 == 5) || (mes2 == 7) || (mes2 == 8) || (mes2 == 10) || (mes2 == 12) && (dia2 > 31))
		{
			System.out.println("Este mes s�lo tiene 31 d�as");
			System.exit(0);
		}
		System.out.println("Ingrese otro a�o: ");
		a�o2 = sc.nextInt();
		
		if (a�o1 > a�o2) {
			System.out.println("La fecha m�s reciente es " + dia1 + mes1 + a�o1);
			
		}
		
		else {
			System.out.println("La fecha m�s reciente es " + dia2 + mes2 + a�o2);
		}
		}
	


	}
