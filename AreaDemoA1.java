import java.util.Scanner;

public class AreaDemoA1 {

	public static void main(String[] args) {

		AreaFigureA1 ar;
		Scanner s = new Scanner (System.in);
		int op;
		double x,y;
		
		do {
			System.out.println("****** CALCULATE AREA ******");
			System.out.println("1. RECTANGLE");
			System.out.println("2. TRIANGLE");
			System.out.println("3. EXIT");
			System.out.print("Enter Your Option(1-3): ");
			op=s.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.print("Enter length of rectangle(>0): ");
				x=s.nextDouble();
				if (x>0) {
					System.out.print("Enter breadth of rectangle(>0): ");
					y=s.nextDouble();
					if (y>0) {
						ar=new AreaRectangleA1(x,y);
						System.out.println("Area of Rectangle: "+ar.area()+"\n");
					}
					else
						System.out.println("Incorrect Value. Breadth must be positive. Please try again ...\n");
				}
				else
					System.out.println("Incorrect Value. Length must be positive. Please try again ...\n");
				break;
				
			case 2:
				System.out.print("Enter base length of triangle(>0): ");
				x=s.nextDouble();
				if (x>0) {
					System.out.print("Enter height of triangle(>0): ");
					y=s.nextDouble();
					if (y>0) {
						ar=new AreaTriangleA1(x,y);
						System.out.println("Area of Triangle: "+ar.area()+"\n");
					}
					else
						System.out.println("Incorrect Value. Height must be positive. Please try again ...\n");
				}
				else
					System.out.println("Incorrect Value. Bae Length must be positive. Please try again ...\n");
				break;
				
			case 3:
				System.out.println("Thank You for using this Application.");
				System.out.println("Good Bye !!!");
				break;
				
			default:
				System.out.println("Incorrect Option.");
				System.out.println("Please try again.");
				break;
			
			}
		
		} while (op!=3);
		s.close();

	}
}
