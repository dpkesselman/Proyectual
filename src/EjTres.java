
import java.util.Scanner;

public class EjTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia1, mes1, a�o1, dia2, mes2, a�o2;
		System.out.println("Ingrese d�a: ");
		dia1 = sc.nextInt();
		System.out.println("Ingrese mes: ");
		mes1 = sc.nextInt();
		System.out.println("Ingrese a�o: ");
		a�o1 = sc.nextInt();
		
		System.out.println("Ingrese otro d�a: ");
		dia2 = sc.nextInt();
		System.out.println("Ingrese otro mes: ");
		mes2 = sc.nextInt();
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
