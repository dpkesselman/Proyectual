import java.util.Scanner;

public class EjCuatro 
{
	public static void cuatro()
	{
		
		try
		{
			short nota1;
			short nota2;
			short nota3;
	
			boolean continuar = false;	
			Scanner sc = new Scanner (System.in);
	

		
	
		do 
		{
			continuar = false;
			System.out.println("Ingrese tres notas");
			nota1 = sc.nextShort();
			nota2 = sc.nextShort();
			nota3 = sc.nextShort();
			
			if ((nota1 <=10) && (nota2 <=10) && (nota3 <=10) && (nota1 >= 0) && (nota2 >= 0) && (nota3 >= 0))
			{
				float promedio = calcularPromedio(nota1,nota2,nota3);
				System.out.println("El promedio es " + promedio);
				
				if ((promedio >=4) && (nota1 >=4) && (nota2 >=4) && (nota3 >=4))
				{
					System.out.println("El alumno está aprobado");
					
					if ((nota3 == 10) || (promedio >=8))
					{
						System.out.println("El alumno promocionó");
					}
					
					else
					{
						System.out.println("El alumno no promocionó");
					}
				}
				
				else
				{
					System.out.println("El alumno desaprobó");
				}
			}
			
			else
				
			{
				System.out.println("Número inválido");
				continuar = true;
			}
		}
		
		while (continuar);
	}
	
	catch (Exception ex)
	{
		System.out.println("Valor inesperado");
	}
	}
	
	public static float calcularPromedio(short nota1, short nota2, short nota3)
	{
		float promedio = nota1 + nota2 + nota3;
		promedio = promedio /3;
		return promedio;
	}
	
	
}
