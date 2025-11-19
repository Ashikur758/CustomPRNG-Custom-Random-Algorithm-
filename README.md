# CustomPRNG

Java implementation of a **custom pseudo-random number generator (PRNG)** with methods for generating `int`, `float`, `double`, and arrays of random numbers. This project uses **static methods** and **method overloading** to generate random numbers of different types.

---

## **Features**

- Generate random `int`, `float`, and `double` numbers.
- Generate `int` within a specific range `[min, max)`.
- Generate arrays of random `double` numbers.
- Fully static methods – no object creation required.
- Simple, custom algorithm using **seed, multiplier, and bit manipulation**.

---

## **Usage**

### **1. Import the class**

Place `CustomPRNG.java` in your project folder.

### **2. Call static methods using the class name**

```java
// Example: TestPRNG.java

public class TestPRNG {
    public static void main(String[] args) {
        System.out.println("Random int: " + CustomPRNG.nextInt());
        System.out.println("Random int [10, 50): " + CustomPRNG.nextInt(10, 50));
        System.out.println("Random double: " + CustomPRNG.nextDouble());
        System.out.println("Random float: " + CustomPRNG.nextFloat());

        double[] arr = CustomPRNG.nextDoubleArray(5);
        System.out.print("Random double array: ");
        for (double d : arr) System.out.print(d + " ");
    }
}
