public class Array 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] array = new int[] {2,5,7,1,9,3};
		int mayor = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > mayor) 
			{
				mayor = array[i];
			}
		}
		
		System.out.println("El numero mayor del array es: " + mayor);
	}
}