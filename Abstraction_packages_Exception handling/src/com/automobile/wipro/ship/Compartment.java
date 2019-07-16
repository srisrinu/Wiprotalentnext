package com.automobile.wipro.ship;

public class Compartment {
	private double height,width,breadth;
	public Compartment(double height,double width,double breadth) {
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	@Override
	public String toString() {
		return("Compartment(height:"+height+",width:"+width+",breadth:"+breadth+")");
	}

}
