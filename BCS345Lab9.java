public class BCS345Lab9 
{
    public static void main(String[] args) 
    {
        // Task 8
	Shape[] shapes = new Shape[4];
	shapes[0] = new Rectangle(10, 20);
	shapes[1] = new Rectangle(3, -5);
	shapes[2] = new Circle( - 1);
	shapes[3] = new Circle(3.3);

	for (int i = 0; i < shapes.length; i++) 
        {
            System.out.println(shapes[i].toString());
	}

	System.out.println(" ");

        // Task 9
	Drawable[] shapestwo = new Drawable[4];
	shapestwo[0] = new Rectangle(10, 20);
	shapestwo[1] = new Rectangle(3, -5);
	shapestwo[2] = new Circle( - 1);
	shapestwo[3] = new Circle(3.3);

	for (Drawable draw : shapestwo) 
        {
            System.out.println(draw.toString());
	}
    }
}