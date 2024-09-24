Polymorphism Example in Java (Single File)

This project demonstrates the concept of **Polymorphism** in Java, implemented in a single Java file. Polymorphism allows methods to be overridden in derived classes and invoked dynamically based on the object type.

Overview

- The `Shape` class is an abstract base class that defines an abstract method `draw()`.
- Two concrete classes, `Circle` and `Rectangle`, extend `Shape` and implement the `draw()` method.
- In the `main()` method, polymorphism is demonstrated by assigning different shapes (`Circle` and `Rectangle`) to the `Shape` reference, and invoking the `draw()` method.

Example Output
Running the Code in IntelliJ IDEA

1. Open IntelliJ IDEA and create a new Java project.
2. Create a new Java file called `PolymorphismExample.java` in the `src` directory.
3. Paste the provided code into the `PolymorphismExample.java` file.
4. Build and run the project. You should see the output of the `draw()` method for both `Circle` and `Rectangle`.

## Key Benefits of Polymorphism

- **Flexibility**: Allows different objects to be treated in the same way, promoting code reuse.
- **Extensibility**: Easily add new shapes like `Triangle` or `Square` by extending the `Shape` class and overriding the `draw()` method without altering existing code.

## Conclusion

This project shows how polymorphism can simplify code structure by allowing different objects to be handled uniformly while providing specific behavior depending on the type of object.


