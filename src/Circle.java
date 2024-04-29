public class Circle {

    private double radius;

    public Circle(double radius){
        radius = radius;                          // this keyword
    }

    // getRadius()
    // getArea()

    public static void main(String[] args) {
        Circle c = new Circle(2);
    }

}

class B extends Circle{

    private double length;

    B(){
        super(23.45);

    }

}
