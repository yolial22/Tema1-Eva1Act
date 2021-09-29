import java.util.Scanner;

import java.util.ArrayList;

public class Array 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		String[] array = new String[] {"Yosu","Aleixandre","Alex","Oscar","Sergio","Ximo"};
//		
//		for(int i = 0; i < array.length; i++) 
//		{
//			System.out.println(array[i]);
//		}
		
		ArrayList<String> array1 = new ArrayList<String>();
		
		array1.add("Yosu");
		array1.add("Aleixandre");
		array1.add("Alex");
		array1.add("Oscar");
		array1.add("Sergio");
		array1.add("Ximo");
		
		for(int i = 0; i < array1.size(); i++) 
		{
			System.out.println(array1.get(i));
		}
	}
}