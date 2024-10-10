public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("The circle has radius of "
                + c3.getRadius() + ", color of " + c3.getColor()
                + " and area of " + c3.getArea());
        c1.setRadius(5.5);
        c1.setColor("green");
        System.out.println("The circle has radius of "
                + c1.getRadius() + ", color of " + c1.getColor()
                + " and area of " + c1.getArea());
        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c3);
    }
}
