
import java.util.Scanner;

public class EjTres {

	public static void main(String[] args) {
		
		/* TODO falta que valide que el mes y el dia sean validos, 
		 * por ejemplo: si ingreso dia 45 del mes 13 no me avisa que no existen  y calcula la fecha igual */
		
		
		Scanner sc = new Scanner(System.in);
		int dia1, mes1, año1, dia2, mes2, año2;
		System.out.println("Ingrese día: ");
		dia1 = sc.nextInt();
		System.out.println("Ingrese mes: ");
		mes1 = sc.nextInt();
		System.out.println("Ingrese año: ");
		año1 = sc.nextInt();
		
		System.out.println("Ingrese otro día: ");
		dia2 = sc.nextInt();
		System.out.println("Ingrese otro mes: ");
		mes2 = sc.nextInt();
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
