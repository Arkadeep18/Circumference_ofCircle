import java.util.*;

public class Prac45 {
	public static double CircumferenceCircle(double radius) {
		return radius = 2 * 3.14 * radius;
	}

	public static void main(String[] args) {
		//Write a function that takes radius as input and returns the circumference of a circle.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = sc.nextDouble(); 
		
		System.out.println(CircumferenceCircle(radius));
		
	}

}
