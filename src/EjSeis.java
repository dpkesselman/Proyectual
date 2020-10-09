
import java.util.Scanner;
public class EjSeis {

	public static void main(String[] args) {
		
		try {
		
		Scanner sc = new Scanner(System.in);
		short mes;
		System.out.println("Ingrese un mes");
		mes = (short) sc.nextInt();
		
		
		switch(mes)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:
				System.out.println("El mes tiene 31 días");
				break;
			case 2:
				System.out.println("El mes tiene 28 días");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El mes tiene 30 días");
				break;
			default: 
				System.out.println("No es un mes válido, ingrese un número entre 1 y 12");			
		}
		}
		
		catch (Exception ex){
			System.out.println("error");
		}
	}

}
