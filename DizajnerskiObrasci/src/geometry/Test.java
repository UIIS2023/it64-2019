package geometry;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//Vjezbe 2
		
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		
		System.out.println("X p1: " + p1.getX());
		System.out.println("Y p1: " + p1.getY());
		System.out.println("Selected p1: " + p1.isSelected());
		
		Point p2 = new Point();
		p2.setX(13);
		p2.setY(15);
		p2.setSelected(true);
		
		System.out.println("Udaljenost izmedju tacaka p1 i p2: " + p1.distance(p2.getX(), p2.getY()));
		p1.setX(p2.getX());
		System.out.println("Udaljenost izmedju tacaka p1 i p2: " + p1.distance(p2.getX(), p2.getY()));
		
		
		// Vjezbe 3
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		l1.setSelected(true);
		
		p1.setX(33);
		l1.getStartPoint().setX(55);
		
		
		System.out.println("X startPoint l1: " + l1.getStartPoint().getX());
		System.out.println("X p1: " + p1.getX());
		
		Line l2 = new Line();
		l2.setStartPoint(new Point());
		l2.getStartPoint().setY(p1.getX());
		
		l2.setEndPoint(p2);
		System.out.println("Y endPoint l2: " + l2.getEndPoint().getY());
		
		Rectangle r1 = new Rectangle();
		System.out.println("Area r1: " + r1.area());
		r1.setUpperLeft(p1);
		r1.setWidth(5);
		r1.setHeight((int) l2.lenght());
		
		System.out.println("Area r1: " + r1.area());
		
		Rectangle r2 = new Rectangle();
		r2.setUpperLeft(l1.getEndPoint());
		
		Circle c1 = new Circle();
		c1.setCenter(p2);
		System.out.println("\n\nX center c1: " + c1.getCenter().getX() + 
				"\nY center c1: " + c1.getCenter().getY() + 
				"\nRadius c1: " + c1.getRadius() + 
				"\nSelected c1: " + c1.isSelected());
		
		//c1.setR((int) c1.getCenter().distance(l1.getStartPoint().getX(), l1.getStartPoint().getY()));
		
		try {
			c1.setRadius(10);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		System.out.println("Radiius c1: " + c1.getRadius());
		
		c1.setSelected(c1.getCenter().getX() > r1.getUpperLeft().getY());
		System.out.println("Selected c1: " + c1.isSelected());
		
		l1.getEndPoint().setY((int) ((c1.getCenter().getX() - c1.getCenter().getY()) - (r1.getUpperLeft().getX() + c1.area())));
		System.out.println(l1.getEndPoint().getY());
	
		
		//Vjezbe 4
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(r1);
		System.out.println(c1);
		
		p1 = p2;
		
		Point p3 = new Point(6, 7);
		Line l3 = new Line(p3, new Point(12, 13));
		Rectangle r3 = new Rectangle(new Point(p3.getX(), p3.getY()), 50, 100);
		
		p3.setX(50);
		
		System.out.println("X p3: " + p3.getX());
		System.out.println("X startPoint l3: " + l3.getStartPoint().getX());
		System.out.println("X upperLeft r3: " + r3.getUpperLeft().getX());
		
		Circle c3 = new Circle(new Point(), 10, true);
		System.out.println(c3);
		
		Rectangle r4 = new Rectangle(new Point(l3.getStartPoint().getX(), l3.getStartPoint().getY()), (int) (r3.area() - c3.area()), (int)(l3.lenght()), l3.getEndPoint().isSelected() && p3.isSelected());
		
		System.out.println(r4 + " selected= " + r4.isSelected());
		
		Point p5 = new Point(5, 6);
		Point p6 = p5;
		Point p7 = new Point(5, 6);
		
		System.out.println("p5 == p6: " + (p5 == p6));
		System.out.println("p5 == p7: " + (p5 == p7));
		
		System.out.println("p5 equals p6: " + p5.equals(p6));
		System.out.println("p5 equals p7: " + p5.equals(p7));
		
		System.out.println("p5 equals l3: " + p5.equals(l3));
		
		Line l4 = new Line(new Point(10, 11), new Point(12, 13));
		Line l5 = new Line(new Point(10, 11), new Point(12, 13));
		
		System.out.println("l4 equals l5: " + l4.equals(l5));
		
		// Vjezbe 5
		
		System.out.println("Vjezbe 5: ");
		Point p8 = new Point(6, 7);
		System.out.println(p7.contains(p8.getX(), p8.getY()));
		System.out.println(p7.contains(p8.getX() + 1, p8.getY() + 1));
		
		Circle c4 = new Circle(p5, 10);
		System.out.println(c4.contains(p8));
		System.out.println(c4.contains(6, 7));
		
		Donut d1 = new Donut();
		d1.setCenter(new Point(10, 20));
		//d1.setR(5);
		d1.setInnerRadius(3);
		
		System.out.println(d1);
		System.out.println(d1.contains(new Point(14, 20)));
		System.out.println(d1.area());
		
		System.out.println(d1.circumference());
		Circle c5 = new Circle(d1.center, d1.radius);
		System.out.println(d1.equals(c5));
		
		//Vjezbe 7
		System.out.println("Vjezbe 7: ");
		System.out.println(p1);
		p1.moveBy(5, 3);
		System.out.println(p1);
		p1.moveTo(5, 3);
		System.out.println(p1);
		
		Shape d2 = new Donut(p1, 10, 2);
		Shape p9 = new Point();
		Shape l9 = l1;
		Shape c9 = c1;
		
		Shape[] shapes = {d2, p9, l9, c9};
		System.out.println("\n");
		for(int i = 0; i< shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		
		for(int i = 0; i < shapes.length; i++) {
			shapes[i].moveBy(1, 2);
			
		}
		
		System.out.println("\n");
		for(int i = 0; i< shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		
		int[] ints = {5, 2, 3, 4, 1};
		System.out.println("Nesortiran niz: ");
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
			
		}
		
		Arrays.sort(ints);
		
		System.out.println("Sortiran niz: ");
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
			
		}
		
		Point p10 = new Point(10, 10);
		Point p20 = new Point(20, 20);
		Point p30 = new Point(30, 30);
		Point p40 = new Point(40, 40);
		
		Point[] points = {p30, p10, p40, p20};
		System.out.println("Nesortiran niz: ");
		for(int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
			
		}
		
		Arrays.sort(points);
		
		System.out.println("Sortiran niz: ");
		for(int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}

}
