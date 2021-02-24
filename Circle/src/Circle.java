//Exercise 6.20 Solution: Circle.java
//Program calculates the area of a circla.
import java.util.Scanner;

public class Circle {
	//calculate the areas of circles
	public void calculateAreas()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius (negative to quit): ");
		double radius = input.nextDouble();
		
		while (radius >= 0)
		{
			circleArea(radius);
			
			System.out.print("Enter the radius (negative to quit): ");
			radius = input.nextDouble();
		}//end while loop
	}//end method calculateAreas
	
	//calculate area
	public void circleArea( double radius )
	{
		System.out.printf("Area is %f\n", Math.PI*radius*radius);
	}//end method circleArea
}//end class Circle
