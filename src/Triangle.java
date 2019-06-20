public class Triangle extends Shape {
    private double a;
    private double b;

    public Triangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a*b/2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void draw() {
        System.out.println(toString()+", area is: " + calcArea());
    }
}

