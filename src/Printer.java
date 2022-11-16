public class Printer {
    public static void printShape(Shape shape) {
        shape.shapePrint();
    }

    public static void main(String[] args) {
        printShape(new Circle());
        printShape(new Quad());
        printShape(new Triangle());
        printShape(new Rhombus());
        printShape(new Rectangle());

    }
}
