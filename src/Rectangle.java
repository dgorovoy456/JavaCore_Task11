public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public double calcArea() {
        return width*height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public String toString() {
        return "This is " + super.toString() + ", width="+ width + ", height=" +height;
    }

    @Override
    public void draw() {
        System.out.println(toString()+", area is: " + calcArea());
    }
}
