package cst8284.generics;

public abstract class BasicShape {
	
	private double width; // Page 3. "assume a default value of 1.0 for the width and height"
	
	public double getWidth(){return width;}
	public void setWidth(double width){this.width = width;}
			
	@Override
	public String toString(){
		return ("BasicShape Overrides " + super.toString());
	}
	
	@Override
	public boolean equals(Object o) {
	  return (this.getArea() == ((BasicShape) o).getArea());
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
