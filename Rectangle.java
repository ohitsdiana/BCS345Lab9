public class Rectangle extends Shape implements Drawable 
{
    private double length;
    private double width;
    private static int count = 0;

    public Rectangle() 
    {
	length = 1;
	width = 1;
	count++;
    }

    public Rectangle(double len, double wid) 
    {
	setLength(len);
	setWidth(wid);
	count++;
    }

    public Rectangle(Rectangle other) 
    {
	length = other.length;
	width = other.width;
	count++;
    }

    public void setLength(double len) 
    {
	if (len > 0) 
            length = len;
	else length = 1;
    }

    public void setWidth(double wid) 
    {
	if (wid > 0) 
            width = wid;
	else width = 1;
    }

    public double getLength() 
    {
	return length;
    }

    public double getWidth() 
    {
	return width;
    }

    public double getArea() 
    {
	return length * width;
    }
    
    public String toString() 
    {
	// String str = "Length = " + length + "\tWidth = " + width;
	String str = String.format("Length = %.2f\tWidth = %.2f\tArea = %.2f", length, width, getArea());
	return str;
    }

    public boolean equals(Rectangle other) 
    {
	return length == other.length && width == other.width;
    }

    public static int getCount() 
    {
	return count;
    }
    
    // Task 6
    public void draw() 
    {
	System.out.println("Draw a rectangle");
    }
}