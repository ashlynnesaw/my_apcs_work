public class Rectangle {
	private double base;
	private double height;
	
	public Rectangle(double base, double height){
		this.base = base;
		this.height = height;
		}
		
	public double getBase(){
		return base;
		}
	public double getHeight(){
		return height;
		}
	public double getArea(){
		return base * height;
		}
	public double getPerimeter(){
		return 2 * (base + height);
		}
	public double getDiagonal(){
		return Math.sqrt(base * base + height * height);
		}
	}
	
class RectangleTest{
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle (3, 4);
		
		if (rectangle.getBase() == 3) {
			System.out.println("getBase: PASS");
			} else {
			System.out.println("getBase: FAIL");
			}
		if (rectangle.getHeight() == 4) {
			System.out.println("getHeight: PASS");
			} else {
			System.out.println("getHeight: FAIL");
			}
		if (rectangle.getArea() == 12) {
			System.out.println("getArea: PASS");
			} else {
			System.out.println("getArea: FAIL");
			}
		if (rectangle.getPerimeter() == 14) {
			System.out.println("getPerimeter: PASS");
			} else {
			System.out.println("getPerimeter: FAIL");
			}
		if (rectangle.getDiagonal() == 5) {
			System.out.println("getDiagonal: PASS");
			} else {
			System.out.println("getDiagonal: FAIL");
			}
		}
	}
	

