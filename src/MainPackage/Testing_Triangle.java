package MainPackage;

public class Testing_Triangle {
	
	public static void main(String[] args){
		
		//The creates all the tests of the triangle within the triangle class. 
		
		Triangle Triangle = new Triangle(1.0, 1.0, 1.0);
		
		System.out.printf("The total area of the triangle: %.2f\n", Triangle.getArea());
		System.out.println("The total perimeter of the triangle: " + Triangle.getPerimeter());
		System.out.println("The color of the triangle: " + Triangle.getColor());
		System.out.println("The triangle is filled: " + Triangle.isFilled());
		System.out.println(Triangle.ToString());


			}
		}

