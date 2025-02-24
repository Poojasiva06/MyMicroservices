package com.l;

class Rectangle {
	int width , height;
	
	public Rectangle() {
		
	}
	public Rectangle(int width , int height)
	{
		this.width = width;
		this.height = height;
	}
	public int getwidth()
	{
		return width;
	}
	public void setwidth(int width)
	{
		this.width = width;
	}
	public int getHeight()
	{
		return height;
	}
	public void setheight(int height)
	{
		this.height = height;
	}
	public int getArea() {
		return width*height;
	}
}
