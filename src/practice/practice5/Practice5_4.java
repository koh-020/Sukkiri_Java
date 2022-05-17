package practice.practice5;

public class Practice5_4 {
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = (bottom * height / 2); 
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double circlrArea = (3.14 * radius * radius); 
		return circlrArea;
	}
	
	public static void main(String[] args) {
		System.out.println(calcTriangleArea(10.0, 5.0));
		System.out.println(calcCircleArea(5.0));
	}
	
	
}
