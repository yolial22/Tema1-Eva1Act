import java.util.Scanner;

// Ejercicio 7: Escribe un método que pida por teclado el nombre y los años de experiencia comodesarrollador de software y muestre el nivel y el salario en base al siguiente criterio:
// a. Si lleva menos de 1 año --> “Desarrollador Junior L1 – 15000-18000”
// b. Si lleva entre 1 y 2 años --> “Desarrollador Junior L2 – 18000-22000”
// c. Si lleva entre 3 y 5 años --> ”Desarrollador Senior L1 – 22000-28000”
// d. Si lleva entre 5 y 8 años --> “Desarrollador Senior L2 – 28000-36000”
// e. Si lleva más de 8 años --> “Analista / Arquitecto. Salario a convenir en base a rol”

public class Ejeeva1act7 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		int años;
		
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.print("Introduce los años de experiencia como desarrollador software: ");
		años = teclado.nextInt();
		
		if(años < 1) 
		{
			System.out.print("Usted " + nombre + " --> tiene un nivel de Desarrollador Junior L1 - y su salario base sera de 15000 - 18000");
		}
		else if(años > 1 && años <= 2) 
		{
			System.out.print("Usted " + nombre + " --> tiene un nivel de Desarrollador Junior L2 - y su salario base sera de 18000 - 22000");
		}
		else if(años > 3 && años <= 5) 
		{
			System.out.print("Usted " + nombre + " --> tiene un nivel de Desarrollador Senior L1 - y su salario base sera de 22000 - 28000");
		}
		else if(años > 5 && años <= 8) 
		{
			System.out.print("Usted " + nombre + " --> tiene un nivel de Desarrollador Senior L2 - y su salario base sera de 28000 - 36000");
		}
		else 
		{
			System.out.print("Usted " + nombre + " --> tiene un nivel de Analista / Arquitecto - y su salario base sera a convenir en base a su rol");
		}
		
		teclado.close();
	}
}