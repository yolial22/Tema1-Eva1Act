import java.util.Scanner;

// Ejercicio 6: Escribe un m�todo que pida 5 n�meros enteros (sin validaci�n de momento), los muestrepor consola en orden inverso y devuelva la suma de todos los n�meros proporcionados.

public class Ejeeva1act6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		int suma = 0;
		
		for(int i = 5; i >= 1; i--) 
		{
			System.out.print("Introduce el " + i + " numero: ");
			
			numero = teclado.nextInt();
			
			suma = suma + numero;
		}
		
		System.out.print("La suma de todos los numeros es: " + suma);
		
		teclado.close();
	}
}