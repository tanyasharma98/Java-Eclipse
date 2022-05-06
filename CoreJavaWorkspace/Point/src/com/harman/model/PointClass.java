package com.harman.model;

public class PointClass {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public static int getDistance(int x1, int y1 , int x2, int y2) {
		int xx = (x2-x1) * (x2-x1);
		int yy = (y2-y1) * (y2-y1);
		int dis = (int) Math.sqrt(xx +yy);
		return dis;
	}
	public static void findMidPoint(int x1, int x2, int y1, int y2){
		int xx = (x1+x2)/2;
		int yy = (y1+y2)/2;
		System.out.println("Mid Point : "+"( "+ xx + " , "+yy+" )");
	}
		
}
