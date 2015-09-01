import java.util.Scanner;


public class Question5 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		boolean triangle = true;
		
		int Ax, Ay, Bx, By, Cx, Cy;
		System.out.println("Please give me X and Y coordinates of point A. Enter X first then Y.");
		Ax = scan.nextInt();
		Ay = scan.nextInt();
		
		System.out.println("Please give me X and Y coordinates of point B. Enter X first then Y.");
		Bx = scan.nextInt();
		By = scan.nextInt();
		
		System.out.println("Please give me X and Y coordinates of point C. Enter X first then Y.");
		Cx = scan.nextInt();
		Cy = scan.nextInt();
		
		double AB = Math.sqrt((Math.pow((Bx - Ax), 2) + Math.pow((By - Ay), 2)));
		double BC = Math.sqrt((Math.pow((Cx - Bx), 2) + Math.pow((Cy - By), 2)));
		double CA = Math.sqrt((Math.pow((Ax - Cx), 2) + Math.pow((Ay - Cy), 2)));
		
		System.out.println("The length between A and B is... " + AB);
		System.out.println("The length between B and C is... " + BC);
		System.out.println("The length between C and A is... " + CA);
		
		if(AB + BC <= CA)
			triangle = false;
		else if(BC + CA <= AB)
			triangle = false;
		else if(CA + AB <= BC)
			triangle = false;
		
		if(triangle == true)
			System.out.println("These coordinates make a triangle!");
		else
			System.out.println("These coordinates do not make a triangle!");

	}

}
