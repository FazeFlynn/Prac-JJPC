public class Example {
    public static void greet() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        // Using a method reference to refer to the greet method
        Runnable runnable = Example::greet;
        runnable.run(); // Invokes the method, prints "Hello, World!"
    }
}
