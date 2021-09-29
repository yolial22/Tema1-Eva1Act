public class Factorial 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		long factorial = 1;
		int numero = 15;
		
		for(int i = 1; i <= numero; i++) 
		{
			factorial = factorial * i;
		}
		System.out.println("El factorial del numero " + numero + " es: " + factorial);
	}
}