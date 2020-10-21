
import java.util.Scanner;

public class EjTres {

	public static void main(String[] args) {
		
		/* TODO falta que valide que el mes y el dia sean validos, 
		 * por ejemplo: si ingreso dia 45 del mes 13 no me avisa que no existen  y calcula la fecha igual */
		// Revisado y modificado... Pero capaz se podría hacer de alguna forma más simple. Seguiré pensando.
		
		Scanner sc = new Scanner(System.in);
		int dia1, mes1, año1, dia2, mes2, año2;
		System.out.println("Ingrese día: ");
		dia1 = sc.nextInt();
		System.out.println("Ingrese mes: ");
		mes1 = sc.nextInt();
		if ((mes1 == 2) && (dia1 >28))
		{
			System.out.println("Este mes sólo tiene 28 días");
			System.exit(0);
		}
		if ((mes1 == 4) || (mes1 == 6) || (mes1 == 9) || (mes1 == 11) && (dia1 > 30))
		{
			System.out.println("Este mes sólo tiene 30 días");
			System.exit(0);
		}
		if ((mes1 == 1) || (mes1 == 3) || (mes1 == 5) || (mes1 == 7) || (mes1 == 8) || (mes1 == 10) || (mes1 == 12) && (dia1 > 31))
		{
			System.out.println("Este mes sólo tiene 31 días");
			System.exit(0);
		}
		System.out.println("Ingrese año: ");
		año1 = sc.nextInt();
		
		System.out.println("Ingrese otro día: ");
		dia2 = sc.nextInt();
		System.out.println("Ingrese otro mes: ");
		mes2 = sc.nextInt();
		if ((mes2 == 2) && (dia2 >28))
		{
			System.out.println("Febrero sólo tiene 28 días");
			System.exit(0);
		}
		if ((mes2 == 4) || (mes2 == 6) || (mes2 == 9) || (mes2 == 11) && (dia2 > 30))
		{
			System.out.println("Este mes sólo tiene 30 días");
			System.exit(0);
		}
		if ((mes2 == 1) || (mes2 == 3) || (mes2 == 5) || (mes2 == 7) || (mes2 == 8) || (mes2 == 10) || (mes2 == 12) && (dia2 > 31))
		{
			System.out.println("Este mes sólo tiene 31 días");
			System.exit(0);
		}
		System.out.println("Ingrese otro año: ");
		año2 = sc.nextInt();
		
		if (año1 > año2) {
			System.out.println("La fecha más reciente es " + dia1 + mes1 + año1);
			
		}
		
		else {
			System.out.println("La fecha más reciente es " + dia2 + mes2 + año2);
		}
		}
	


	}
