package programs;

//class Shape {
//    private double length;
//    private double width;
//
//    public Shape(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }
//}
//
//class Rectangle extends Shape {
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//    }
//}



abstract class Shape {
	abstract public double Area();
	abstract public double Perimiter();
}

class Rectangle{
	double length;
	double breath;
	public double Area() {
		return length*breath;
	}
	public double Perimiter() {
		return 2*(length+breath);
	}
	
}
public class Shape1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a class shape having area() and perimiter() as methods and a derive class rectangle to find the 
		//area and perimieter of the rectangle.
		
		Rectangle r=new Rectangle();
		r.length=4.6;
		r.breath=7.8;
		System.out.println("The Area="+r.Area());
		System.out.println("The Perimiter="+r.Perimiter());	

	}

}