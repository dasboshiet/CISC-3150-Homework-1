import java.util.Scanner;


public class Question6 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		int C1x, C1y, C2x, C2y;
		int C1r, C2r;
		scan = new Scanner(System.in);
		System.out.println("Please enter the coordinates of a circle. Please enter X and then Y.");
		
		C1x = scan.nextInt();
		C1y = scan.nextInt();
		
		System.out.println("Please enter the radius of the circle now.");
		
		C1r = scan.nextInt();
		
		System.out.println("Please enter the coordinates of another circle. Please enter X and then Y.");
		
		C2x = scan.nextInt();
		C2y = scan.nextInt();
		
		System.out.println("Please enter the radius of the circle now.");
		
		C2r = scan.nextInt();
		
		double C1C2 = Math.sqrt((Math.pow((C2x-C1x),2)) + (Math.pow((C2y-C1y),2)));
		System.out.println("The distance between the center of both circles is... " + C1C2);
		
		double C1rC2r = C1r + C2r;
		System.out.println("The total radius of both circles is... " + C1rC2r);
		
		if(C1C2 > C1rC2r)
			System.out.println("The cirlces are separate from each other.");
		else if(C1C2 == C1rC2r)
			System.out.println("The circles are touching each other.");
		else if(C1C2 == 0 && C1rC2r == (2*C1r))
			System.out.println("The circles are completely within each other.");
		else if(C1C2 < C1rC2r)
			System.out.println("The circles are overlapping each other.");
	}

}
