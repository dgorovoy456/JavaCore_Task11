public class Main {
    public static void main(String[] args) {



        Circle circle = new Circle("Green", 10.0);
//        System.out.println(circle.calcArea());
//        System.out.println(circle);


        Rectangle rectangle = new Rectangle("Brown",10.5,13.2);
//        System.out.println(rectangle);
//        System.out.println(rectangle.calcArea());
//        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle("BLACK",15.5,16.5);
        Shape [] shapes = {circle,rectangle,triangle};
        for (Shape shape : shapes) {
            shape.draw();

        }
    }


}
