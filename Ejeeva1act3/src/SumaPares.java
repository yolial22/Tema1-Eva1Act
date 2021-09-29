import java.util.Scanner;

public class SumaPares 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int suma = 0;
		int numpar = 0;
		
		System.out.print("Introduce un numero: ");
		numero = teclado.nextInt();
		
		for(int i = 0; i <= numero; i++) 
		{
			if(i % 2 == 0) 
			{
				numpar = numpar + 1;
				suma = suma + i;
			}
		}
		System.out.print("La suma de los numeros pares es: " + suma);
		
		teclado.close();
	}
}