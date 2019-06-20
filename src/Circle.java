public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double calcArea () {

        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return super.toString()+ ", radius="+ radius;
    }

    @Override
    public void draw() {
        System.out.println(toString()+", area is: " + calcArea());

    }
}
