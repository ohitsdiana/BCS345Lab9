import java.util.Objects;

public class Circle extends Shape implements Drawable 
{
    private double radius;

    Circle(int i) 
    {
        System.out.println(" ");
    }

    // Task 1.1
    public void setRadius(double radius) 
    {
	if (radius >= 0) 
            this.radius = radius;
	else 
            radius = 0;
    }
    
    // Task 1.2
    public double getRadius() 
    {
	return radius;
    }
	
    // Task 1.3
    public Circle() 
    {
	radius = 0;
    }
    
    // Task 1.4
    public Circle(double radius) 
    {
	setRadius(radius);
    }
	
    // Task 1.5
    public Circle(Circle other) 
    {
	this.radius = other.radius;
    }

    // Task 1.6
    public String toString() 
    {
	String str = String.format("Radius = %.2f \t Area = %.2f", radius, getArea());
	return str;
    }

    // Task 1.7
    public boolean equals(Circle circle) 
    {
	return this.radius == ((Circle)(circle)).radius;
    }

    // Task 3
    public double getArea() 
    {
	return 3.14 * radius * radius;
    }

    // Task 7
    public void draw() 
    {
	System.out.println("Draw a Circle");
    }
}