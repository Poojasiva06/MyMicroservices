package com.l;
//liskov principle
class Square extends Rectangle {

	public Square() {}
	
	public Square (int size)
	{
		width = height = size;
	}
	
	@Override
	public void setwidth(int width)
	{
		super.setwidth(width);
		super.setwidth(width);
	}
	@Override
	public void setheight(int height)
	{
		super.setheight(height);
		super.setheight(height);
	}
}
