import java.util.Scanner;

public class Question2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		char d = 0;
		scanner = new Scanner(System.in);
		System.out.println("Please enter a radius, enter 'D' once you are done.");
		
		while(d != 'D')
		{
			if(scanner.hasNextDouble())	{
				double rad = scanner.nextDouble();
				double area = Math.PI * Math.pow(rad,2);
				
				System.out.println(area);
			}
			else
				d = scanner.next().charAt(0);
		}
	}
}
