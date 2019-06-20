public abstract class Shape implements Drawable {

    private String color;

    public  Shape(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " color is: " + color ;
    }

    public abstract double calcArea();

}
