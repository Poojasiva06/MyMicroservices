package com.l;

class Test {
	 
	  static void getAreaTest(Rectangle r) {
	      int width = r.getwidth();
	      r.setheight(10);
	      System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
	  }

	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(2, 3);
	      getAreaTest(rc);

	      Rectangle sq = new Square();
	      sq.setwidth(5);
	      getAreaTest(sq);
	  }
	}