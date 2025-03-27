package abstractionClass_method;

// Interface declaration
interface Laptop {  
    void copy();
    void paste();
    void cut();
    void keyboard();
}
//You're right! An abstract class cannot be instantiated directly. The correct approach is to use a concrete subclass that extends Lenovo. Here’s the corrected and structured version of your code:
// Abstract class implementing Laptop
abstract class Lenovo implements Laptop {  

    public void copy() {
        System.out.println("Copying...");
    }

    public void paste() {
        System.out.println("Pasting...");
    }

    // Abstract methods
    public abstract void cut();
    public abstract void keyboard();
}

// Concrete class extending Lenovo
class IdeaPad extends Lenovo {

    public void cut() {
        System.out.println("Cutting...");
    }

    public void keyboard() {
        System.out.println("Using Lenovo Keyboard...");
    }
}

// Main class to test
public class user {

    public static void main(String[] args) {
        Lenovo user1 = new IdeaPad();  // Instantiate concrete class
        user1.copy();
        user1.cut();
        user1.paste();
        user1.keyboard();
    }
}
