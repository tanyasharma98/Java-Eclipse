package com.harman.ui;





import com.harman.model.CircleShape;
import com.harman.model.RectShape;
import com.harman.model.Shape;

public class AbstarctShapeApp {

	public static void main(String[] args) {
		RectShape rect = new RectShape(10, 5);
		RectShape rect2 = new RectShape(10,5);
//		System.out.println(rect);
//		System.out.println(rect.getArea());
//		System.out.println(rect.toString());
		System.out.println(rect== rect2);
		System.out.println(rect.equals(rect2)); 
		
		CircleShape cir = new CircleShape(3);
//		System.out.println(cir.getArea());
		
      //Polymorphic Way
		Shape shape;
		shape = new RectShape(10,2);
//		System.out.println(shape.getArea());
		shape = new CircleShape(10);
//		System.out.println(shape.getArea());
		
	}

}
