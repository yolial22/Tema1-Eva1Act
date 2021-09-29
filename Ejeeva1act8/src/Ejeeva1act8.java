import java.util.Scanner;

// Escribe un m�todo que pida por teclado 2 n�meros como extremos de un intervalo. Luego
// imprime por pantalla todos los n�meros entre ese intervalo, indicando junto al n�mero si es
// un n�mero primo o no. Al terminar de mostrar los n�meros por pantalla, debe mostrar un
// mensaje indicando el tiempo consumido en la ejecuci�n del m�todo.

public class Ejeeva1act8 
{
	public static boolean primo(int numero) 
	{
		if (numero == 0 || numero == 1 || numero == 4) 
		{
			return false;
		}
		
		for (int i = 2; i < numero / 2; i++) 
		{
			if (numero % i == 0) 
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		
		int num2;
		
		System.out.print("Introduce el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
		
		long tiempo = 0;

		for(int i = num1; i <= num2; i++) 
		{
			long startime = System.currentTimeMillis();
			
			if(primo(i)) 
			{
				System.out.println("El " + i + " es un numero primo: " + primo(i));
			}
			else 
			{
				System.out.println("El " + i + " no es un numero primo: " + primo(i));
			}
				
				tiempo += (System.currentTimeMillis()-startime);
				
				System.out.println("El tiempo de ejecucion ha sido de: " + tiempo + " segundo");
		}
		teclado.close();
	}
}