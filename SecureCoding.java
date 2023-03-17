import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SecureCoding 
{
	public static void main(String[] args)
	{
		String myString;
		String mySecondString = "hello world";
		int arrayFileSize = 10;
		try 
		{
			myString.equals(mySecondString);
		} catch (Exception e) {
			System.exit(0);
		}
		try 
		{
			char charAtIndexLength = mySecondString.charAt(11);
		} catch (StringIndexOutOfBoundsException e) {
			System.exit(0);
		}
		
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[6];
		int[] fileArray = new int[10];

		fillArray(input, myArray);
		printArray(myArray);	
		
		fileArray = new int[arrayFileSize];
		try
		{
			File file = new File("TextFile.txt");
			Scanner fileReader = new Scanner(file);
			try
			{
				int counter = 0;
				while(fileReader.hasNextInt())
				{
					fileArray[counter] = fileReader.nextInt();
					counter ++;
				}
			}
			catch (InputMismatchException e) {
				System.exit(0);
			}
		}
		catch (FileNotFoundException e) {
			System.exit(0);
		}
	}
	public static void fillArray(Scanner s, int[] a)
	{
		System.out.print("Enter " + a.length + " integers: ");
		for(int i = 0; i < 6; i ++)
		{
			a[i] = s.nextInt();
		}
		int div = a[0]/a[1];
	}
	
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i ++)
		{
			System.out.println(a[i]);
		}
	}
}
