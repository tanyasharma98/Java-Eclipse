package com.harman.ui;

import com.harman.model.PointClass;

public class PointApp {

	public static void main(String[] args) {
		PointClass p1 = new PointClass();
		p1.setX(2);
		p1.setY(4);
		PointClass p2 = new PointClass();
		p2.setX(4);
		p2.setY(2);
		
		int p1X = p1.getX();
		int p1Y = p1.getY();
		int p2X = p2.getX();
		int p2Y = p2.getY();
		
		int dis = PointClass.getDistance(p1X , p1Y , p2X, p2Y);
		System.out.println("Distance : "+ dis);
		PointClass.findMidPoint(p1X, p2X, p2X, p2Y);
	}

}
