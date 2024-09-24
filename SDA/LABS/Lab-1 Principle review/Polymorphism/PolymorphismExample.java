public class PolymorphismExample {

    // Abstract base class Shape
    public static abstract class Shape {
        // Abstract method to be implemented by subclasses
        public abstract void draw();
    }

    // Circle class that extends Shape
    public static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Rectangle class that extends Shape
    public static class Rectangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        // Using polymorphism: the same method behaves differently for different objects
        Shape shape1 = new Circle();      // Circle object
        Shape shape2 = new Rectangle();   // Rectangle object

        // Calling the draw method on both objects
        shape1.draw();   // Output: Drawing a Circle
        shape2.draw();   // Output: Drawing a Rectangle
    }
}
