
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
