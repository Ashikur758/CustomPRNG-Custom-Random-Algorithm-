public class CustomPRNG {
    private static long seed = System.currentTimeMillis();
    private static final long multiplier = 6364136223846793005L;
    private static final long modulus = (1L << 32);

    public static int nextInt() {
        seed = (seed * multiplier) ^ (seed >> 16);
        return (int) (seed % Integer.MAX_VALUE);
    }

    public static int nextInt(int min, int max) {
        return min + nextInt() % (max - min);
    }

    public static double nextDouble() {
        seed = (seed * multiplier) ^ (seed >> 16);
        return (seed % modulus) / (double) modulus;
    }

    public static float nextFloat() {
        return (float) nextDouble();
    }

    public static double[] nextDoubleArray(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextDouble();
        }
        return arr;
    }
}
